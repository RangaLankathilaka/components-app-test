package com.noetic.pos.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.hibernate.dialect.Dialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@EnableSpringDataWebSupport
public abstract class JpaCommonConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(JpaCommonConfig.class);

	// @Bean
	public abstract DataSource dataSource();

	public abstract JpaVendorAdapter getJpaVendorAdapter();

	protected abstract Class<? extends Dialect> getDatabaseDialect();

	protected abstract String getEntityPackage();

	@Bean
	@Qualifier(value = "jpaTransactionManager")
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {

		return new JpaTransactionManager(emf);
	}

	@Bean
	@DependsOn("flyway")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LOGGER.debug("\n\n************ {} ************\n\n", getDatabaseDialect().getCanonicalName());

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(getJpaVendorAdapter());
		LOGGER.debug("\n\n****** Scanning '{}' Packages for Entities ******\n\n", getEntityPackage());
		factory.setPackagesToScan(getEntityPackage());
		factory.setDataSource(dataSource());
		if (getJpaProperties() != null) {
			factory.setJpaProperties(getJpaProperties());
		}
		return factory;
	}

	@Bean(initMethod = "migrate")
	Flyway flyway() {

		try {
			Flyway flyway = new Flyway();
			flyway.setDataSource(dataSource());
			flyway.setBaselineOnMigrate(false); // initialize if missing
			flyway.setLocations("db/migrations");

			flyway.setOutOfOrder(true);

			return flyway;

		} catch (FlywayException e) {
			LOGGER.error("Error initialising Flyway database migration.", e);
			throw new RuntimeException("Failed to startup, Flyway db migration.", e);
		}
	}

	protected Properties getJpaProperties() {
		return null;
	}

}

package com.noetic.pos.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.noetic.pos.config.local.CommonConfig;
import com.noetic.pos.config.local.MySQLConfig;

@Profile("LOCAL")
@Configuration
@EnableCaching
@EnableJpaRepositories(basePackages = {"com.noetic.pos.domain.repository"})
@EnableConfigurationProperties({MySQLConfig.class, CommonConfig.class})
@ComponentScan("com.noetic.pos.config")
@Component(value = "LocalDeployConfig")
public class LocalDeployConfig extends AbstractDeployConfig {

    @Autowired(required = true)
    @Qualifier(value = "LOCAL")
    CommonConfig commonConfig;

    public LocalDeployConfig() {
        super(DeployProfile.LOCAL);
    }

    public LocalDeployConfig(DeployProfile deployProfile) {
        super(deployProfile);
    }

    @Override
    public String getApiUsername() {
        return commonConfig.getApiUsername();
    }

    @Override
    public String getApiPassword() {
        return commonConfig.getApiPassword();
    }

    @Override
    public String getBaseUrl() {
        return commonConfig.getBaseUrl();
    }

    @Override
    public String getSchedulerSecond() {
        return commonConfig.getSchedulerSecond();
    }

    @Override
    public String getSchedulerMinute() {
        return commonConfig.getSchedulerMinute();
    }

    @Override
    public String getSchedulerHour() {
        return commonConfig.getSchedulerHour();
    }

    @Override
    public String getSchedulerDayOfMonth() {
        return commonConfig.getSchedulerDayOfMonth();
    }

    @Override
    public String getSchedulerMonth() {
        return commonConfig.getSchedulerMonth();
    }

    @Override
    public String getSchedulerDayOfWeek() {
        return commonConfig.getSchedulerDayOfWeek();
    }

    @Override
    public String getSchedulerRunning() {
        return commonConfig.getSchedulerRunning();
    }

    @Override
    public String getHospitalityUsername() {
        return commonConfig.getHospitalityUsername();
    }

    @Override
    public String getHospitalityPassword() {
        return commonConfig.getHospitalityPassword();
    }

    @Override
    public String getHospitalityBaseUrl() {
        return commonConfig.getHospitalityBaseUrl();
    }

}

package com.noetic.pos.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.noetic.pos.api.config.dev.CommonConfig;

/**
 */
@Profile("DEV")
@Configuration
@EnableConfigurationProperties({CommonConfig.class})
@ComponentScan("com.noetic.pos.api")
@Component(value = "DevDeployConfig")
public class DevDeployConfig extends AbstractDeployConfig {

    @Autowired(required = true)
    @Qualifier(value = "DEV")
    CommonConfig commonConfig;

    public DevDeployConfig() {
        super(DeployProfile.DEV);
    }

    public DevDeployConfig(DeployProfile deployProfile) {
        super(deployProfile);
    }

    @Override
    public String getInternalApiUsername() {
        return commonConfig.getInternalApiUsername();
    }

    @Override
    public String getInternalApiPassword() {
        return commonConfig.getInternalApiPassword();
    }

    @Override
    public String getInternalBaseUrl() {
        return commonConfig.getInternalBaseUrl();
    }

    @Override
    public String getExternalApiUsername() {
        return commonConfig.getExternalApiUsername();
    }

    @Override
    public String getExternalApiPassword() {return commonConfig.getExternalApiPassword(); }


}

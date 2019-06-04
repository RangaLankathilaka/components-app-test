package com.noetic.pos.config.dev;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.noetic.pos.config.AbstractCommonConfig;

/**
 */
@ConfigurationProperties(locations = "classpath:dev.application.properties", ignoreUnknownFields = true,
        prefix = "common")
@Component(value = "DEV")
public class CommonConfig extends AbstractCommonConfig {

    String apiPassword;

    public String getApiPassword() {
        return this.apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

}

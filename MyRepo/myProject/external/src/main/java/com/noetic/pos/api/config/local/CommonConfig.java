package com.noetic.pos.api.config.local;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.noetic.pos.api.config.AbstractCommonConfig;

/**
 */
@ConfigurationProperties(locations = "classpath:local.application.properties", ignoreUnknownFields = true,
        prefix = "common")
@Component(value = "LOCAL")
public class CommonConfig extends AbstractCommonConfig {

    String internalApiPassword;
    String externalApiPassword;

    @Override
    public String getInternalApiPassword() {
        return this.internalApiPassword;
    }

    @Override
    public void setInternalApiPassword(String internalApiPassword) {
        this.internalApiPassword = internalApiPassword;
    }

    @Override
    public String getExternalApiPassword() {
        return this.externalApiPassword;
    }

    @Override
    public void setExternalApiPassword(String externalApiPassword) {
        this.externalApiPassword = externalApiPassword;
    }
}

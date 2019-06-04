package com.noetic.pos.config.local;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.noetic.pos.config.AbstractCommonConfig;


@ConfigurationProperties(locations = "classpath:local.application.properties", 
ignoreUnknownFields = true, prefix = "common")
@Component(value = "LOCAL")

public class CommonConfig extends AbstractCommonConfig {

	String apiPassword;

	public String getApiPassword() {
		return this.apiPassword;
	}

	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}

}

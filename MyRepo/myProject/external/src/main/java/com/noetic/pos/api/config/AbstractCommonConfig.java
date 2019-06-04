package com.noetic.pos.api.config;

/**
 */
abstract public class AbstractCommonConfig {

	String internalApiUsername;
	String internalApiPassword;
	String internalBaseUrl;
	String externalApiUsername;
	String externalApiPassword;

	public String getInternalApiUsername() {
		return internalApiUsername;
	}

	public void setInternalApiUsername(String internalApiUsername) {
		this.internalApiUsername = internalApiUsername;
	}

	public abstract String getInternalApiPassword();

	public abstract void setInternalApiPassword(String internalApiPassword);

	public String getInternalBaseUrl() {
		return internalBaseUrl;
	}

	public void setInternalBaseUrl(String internalBaseUrl) {
		this.internalBaseUrl = internalBaseUrl;
	}

	public String getExternalApiUsername() {
		return externalApiUsername;
	}

	public void setExternalApiUsername(String externalApiUsername) {
		this.externalApiUsername = externalApiUsername;
	}

	public abstract String getExternalApiPassword();

	public abstract void setExternalApiPassword(String externalApiPassword);
}

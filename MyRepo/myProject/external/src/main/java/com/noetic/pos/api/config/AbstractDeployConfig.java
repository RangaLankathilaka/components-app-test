package com.noetic.pos.api.config;

/**
 */
public abstract class AbstractDeployConfig implements DeployProfileConfig {

	protected DeployProfile deployProfile;

	public AbstractDeployConfig(DeployProfile deployProfile) {
		this.deployProfile = deployProfile;
	}

	public DeployProfile getDeployProfile() {
		return deployProfile;
	}

	public void setDeployProfile(DeployProfile deployProfile) {
		this.deployProfile = deployProfile;
	}

	public abstract String getInternalApiUsername();

	public abstract String getInternalApiPassword();

	public abstract String getInternalBaseUrl();

	public abstract String getExternalApiUsername();

	public abstract String getExternalApiPassword();

}

package com.noetic.pos.api.config;



/**
 *  Possible configuration options for a deployment
 */
public interface DeployProfileConfig {

    DeployProfile getDeployProfile();

    void setDeployProfile(DeployProfile deployProfile);

    String getInternalApiUsername();

    String getInternalApiPassword();

    String getInternalBaseUrl();

    String getExternalApiUsername();

    String getExternalApiPassword();

}

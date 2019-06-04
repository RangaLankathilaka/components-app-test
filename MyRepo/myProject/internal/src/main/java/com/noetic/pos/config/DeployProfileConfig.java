package com.noetic.pos.config;

/**
 * <p>
 * Possible configuration options for a deployment
 */
public interface DeployProfileConfig {

    DeployProfile getDeployProfile();

    void setDeployProfile(DeployProfile deployProfile);

    String getApiUsername();

    String getApiPassword();

    String getBaseUrl();

    String getSchedulerSecond();

    String getSchedulerMinute();

    String getSchedulerHour();

    String getSchedulerDayOfMonth();

    String getSchedulerMonth();

    String getSchedulerDayOfWeek();

    String getSchedulerRunning();

    String getHospitalityUsername();

    String getHospitalityPassword();

    String getHospitalityBaseUrl();

}


package com.noetic.pos.config;

public abstract class AbstractCommonConfig {
	
	String apiUsername;
    String apiPassword;
    String baseUrl;
    String schedulerSecond;
    String schedulerMinute;
    String schedulerHour;
    String schedulerDayOfMonth;
    String schedulerMonth;
    String schedulerDayOfWeek;
    String schedulerRunning;
    String hospitalityUsername;
    String hospitalityPassword;
    String hospitalityBaseUrl;

    public String getApiUsername() {
        return apiUsername;
    }

    public void setApiUsername(String apiUsername) {
        this.apiUsername = apiUsername;
    }

    abstract public String getApiPassword();

    abstract public void setApiPassword(String apiPassword);

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getSchedulerSecond() {
        return schedulerSecond;
    }

    public void setSchedulerSecond(String schedulerSecond) {
        this.schedulerSecond = schedulerSecond;
    }

    public String getSchedulerMinute() {
        return schedulerMinute;
    }

    public void setSchedulerMinute(String schedulerMinute) {
        this.schedulerMinute = schedulerMinute;
    }

    public String getSchedulerHour() {
        return schedulerHour;
    }

    public void setSchedulerHour(String schedulerHour) {
        this.schedulerHour = schedulerHour;
    }

    public String getSchedulerDayOfMonth() {
        return schedulerDayOfMonth;
    }

    public void setSchedulerDayOfMonth(String schedulerDayOfMonth) {
        this.schedulerDayOfMonth = schedulerDayOfMonth;
    }

    public String getSchedulerMonth() {
        return schedulerMonth;
    }

    public void setSchedulerMonth(String schedulerMonth) {
        this.schedulerMonth = schedulerMonth;
    }

    public String getSchedulerDayOfWeek() {
        return schedulerDayOfWeek;
    }

    public void setSchedulerDayOfWeek(String schedulerDayOfWeek) {
        this.schedulerDayOfWeek = schedulerDayOfWeek;
    }

    public String getSchedulerRunning() {
        return schedulerRunning;
    }

    public void setSchedulerRunning(String schedulerRunning) {
        this.schedulerRunning = schedulerRunning;
    }

    public String getHospitalityUsername() {
        return hospitalityUsername;
    }

    public void setHospitalityUsername(String hospitalityUsername) {
        this.hospitalityUsername = hospitalityUsername;
    }

    public String getHospitalityPassword() {
        return hospitalityPassword;
    }

    public void setHospitalityPassword(String hospitalityPassword) {
        this.hospitalityPassword = hospitalityPassword;
    }

    public String getHospitalityBaseUrl() {
        return hospitalityBaseUrl;
    }

    public void setHospitalityBaseUrl(String hospitalityBaseUrl) {
        this.hospitalityBaseUrl = hospitalityBaseUrl;
    }


}

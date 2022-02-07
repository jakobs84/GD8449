package com.devices;

public class Application
{
    String appName;
    String appVersion;
    Double appPrice;

    public Application(String appName, String appVersion, Double appPrice) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appPrice = appPrice;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public Double getAppPrice() {
        return appPrice;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public void setAppPrice(Double appPrice) {
        this.appPrice = appPrice;
    }
}

package com.zapnet.zapnet.Model;

/**
 * Created by theny on 2/16/2018.
 */

public class Event {
    private String startTime;
    private String endTime;
    private String title;
    private String desription;
    private String location;
    private double latitude;
    private double longitute;

    public Event(String startTime, String endTime, String title, String desription, String location) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.title = title;
        this.desription = desription;
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitute() {
        return longitute;
    }

    public void setLongitute(double longitute) {
        this.longitute = longitute;
    }
}

package com.zapnet.zapnet.Model;

/**
 * Created by theny on 2/16/2018.
 */

public class Time {
    private int hour;
    private int minute;
    private String apm;

    public Time(int hour, int minute, String apm){
        this.hour = hour;
        this.minute = minute;
        this.apm = apm;
    }
    public int getHour(){
        return this.hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public String getAPM(){
        return this.apm;
    }
    public void setAPM(String apm){
        this.apm = apm;
    }
}

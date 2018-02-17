package com.zapnet.zapnet.Model;
import java.util.*;

/**
 * Created by theny on 2/16/2018.
 */

public class Event {

    private String title;
    private String desription;
    private String location;

    private String startTime;
    private String endTime;

    private String date;
    private String latitude;
    private String longitude;
    //private Coordinate coordinates;

    public Event(String startTime, String endTime, String title,
                 String desription, String location, String date, String latitude, String longitude) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.title = title;
        this.desription = desription;
        this.location = location;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;

    }
    /*
    public String validEvent(ArrayList<Event> eventList){
       for(Event e : eventList){
           String check = this.checkForOverlap(e);
           if(!check.equals("valid")){
               return check;
           }
       }
       return "valid";
    }

    //check if two events on the same day overlap in time

    public String checkForOverlap(Event e){
        if((this.startTime).earlier(e.startTime)){
            if(this.endTime.earlier(e.startTime)){
                return "valid";
            }
            else{
                return "This event conflicts with " + e.title;
            }
        }
        else{
            if(e.endTime.earlier(this.startTime)){
                return "valid";
            }
            else{
                return "This event conflicts with " + e.title;
            }
        }
    }
    */

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

    /*
    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = new Coordinate(coordinates.getLatitude(), coordinates.getLatitude());
    }
    */

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

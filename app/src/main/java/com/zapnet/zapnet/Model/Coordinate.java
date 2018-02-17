package com.zapnet.zapnet.Model;

/**
 * Created by theny on 2/16/2018.
 */

public class Coordinate {
    private double latitude;
    private double longitute;

    public Coordinate(double latitude, double longitute) {
        this.latitude = latitude;
        this.longitute = longitute;
    }

    public boolean withinRadius(Coordinate otherCoor, double radius){
        double earthRadius = 20902230.9711;
        double lat1 = Math.toRadians(this.getLatitude());
        double lat2 = Math.toRadians(otherCoor.getLatitude());
        double latChange = Math.toRadians(this.getLatitude() - otherCoor.getLatitude());
        double longChange = Math.toRadians(this.getLongitute() - otherCoor.getLongitute());

        double a = Math.pow(Math.sin(latChange/2) , 2) + Math.cos(lat1)* Math.cos(lat2)*Math.pow(Math.sin(longChange/2),2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distance = earthRadius * c;

        return distance < radius;
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

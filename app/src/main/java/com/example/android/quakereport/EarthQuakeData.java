package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.mag;
import static java.lang.String.valueOf;

/**
 * Created by Nicholas on 01/08/2017.
 */

public class EarthQuakeData {

    private String location;
    private double mag;
    private long date;
    private String nearBy;
    private String url;

    public EarthQuakeData(String location, double mag, long date, String url){

        //Separate the location text if it has a "'".
        this.location = (location.indexOf(',') >= 0) ? (location.substring(location.indexOf(',')+2)) : (location);
        this.nearBy = (location.indexOf(',') >= 0) ? (location.substring(0, location.indexOf(','))) : "";

        this.mag = mag;
        this.date = date;
        this.url = url;
    }

    public String getLocation() {
        return location;
    }


    public double getMag() {
        return mag;
    }

    public long getDate() {

        return date;
    }

    public String getNearBy(){
        return nearBy;
    }

    public String getUrl() {
        return url;
    }
}

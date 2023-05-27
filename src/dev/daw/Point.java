package dev.daw;

import java.util.Arrays;

public abstract class Point implements Mappable {
    private double[] location = new double[2]; //hold latitude and longitude

    //changes String, that we coppied from Google Maps, to double
    public Point(String location){
        this.location = Mappable.stringToLatLon(location);
    }

    //print an array to string
    private String location(){
        return Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }
}

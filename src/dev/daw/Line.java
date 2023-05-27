package dev.daw;

import java.util.Arrays;

public abstract class Line implements Mappable {
    private double[][] locations; //hold an array of latitudes and longitudes

    //We can have 0 to many Strings
    public Line(String... locations){
        this.locations = new double[locations.length][];
        int index = 0; //position of the array
        for(var l : locations){
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + locations() + ")");
    }

    //print an array to string
    private String locations(){
        return Arrays.deepToString(locations);
    }

}

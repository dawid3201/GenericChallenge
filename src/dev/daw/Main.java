package dev.daw;

interface Mappable{
    void render();

    //takes a string and split it into DOUBLE array where we will have latidute and logitude values in them
    static double[] stringToLatLon(String a) {

        var splits = a.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat, lng};
    }
};

public class Main {

    public static void main(String[] args) {
        var nationalUsParks = new Park[]{
                new Park("Yellow Stone", "44.4882, -110.5916"),
                new Park("Grand Canyon" , "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUsParks);
        parkLayer.renderLayer();


        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
    }
}


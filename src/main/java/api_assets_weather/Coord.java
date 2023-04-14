/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class Coord { //same as json now
    private double lat;
    private double lon;

/**
 * getter for the locations lat
 * @return double
 */
    public double getLat(){ //returns the latitude
        return this.lat;
    }
/**
 * getter for the locations lon
 * @return double
 */
    public double getLon(){ //returns the longitude
        return this.lon;
    }
}

/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class Location {
    private String name;
    private double lat;
    private double lon;
    private String country;
    private String state;
    
    /**
     * getter for the name of the city
     * @return String
     */
    public String getName() { 
    return this.name; 
    }

    /**
     * getter for the lat of the location
     * @return double
     */
    public double getLat() { 
    return this.lat; 
    }

    /**
     * getter for the lon of the location
     * @return double
     */
    public double getLon() { 
    return this.lon; 
    }

    /**
     * getter for the name of the country
     * @return String
     */
    public String getCountry() { 
    return this.country; 
    }

    /**
     * getter for the name of the State
     * @return String
     */
    public String getState() { 
    return this.state; 
    }
}

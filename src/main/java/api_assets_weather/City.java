/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class City {
    private int id;
    private String name;
    private String country;
    private int population;
    private int timezone;
    private Coord coord;

/**
 * getter for the name of the city
 * @return String
 */
    public String getName(){ //returns the name of the city
        return this.name;
    }
    
/**
 * getter for the name of the country
 * @return String
 */
    public String getCountry(){ //returns the country
        return this.country;
    }
    
/**
 * getter for the city's population
 * @return int
 */    
    public int getPopulation(){
        return this.population;
    }
    
/**
 * getter for the timezone of the city
 * @return int
 */
    public int getTime(){   //returns the time zone of the coordinates
        return this.timezone;
    }
}

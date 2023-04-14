/**
 * required class for calling from the weather api
 */
package api_assets_weather; 

public class Weather {
    private String main;
    private String description;

    /**
     * getter for the kind of weather
     * @return String
     */
    public String getMain(){
        return this.main;
    }
    
    /**
     * getter for a more specific description of the rain
     * @return String
     */
    public String getDescription(){ //returns a description of the current weater
        return this.description;
    }
}

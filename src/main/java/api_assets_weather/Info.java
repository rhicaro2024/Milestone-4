/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class Info { 
    private Main main;
    private Weather[] weather;
    private Wind wind;
    private String dt_txt;

    /**
     * getter for the Main class
     * @return Main
     */
    public Main getMain(){
        return this.main;
    }
    
    /**
     * getter for the weather List
     * @return Weather[]
     */
    public Weather[] getWeather(){
        return this.weather;
    }
    
    /**
     * getter for the Wind class
     * @return Wind
     */
    public Wind getWind(){
        return this.wind;
    }    
    
    /**
     * getter for the time and date String
     * @return String
     */
    public String getDt_Text(){
        return this.dt_txt;
    }
}

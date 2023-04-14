/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class Main {
    private double temp;
    private double temp_min;
    private double temp_max;
    private int humidity;

    /**
     * getter for the current temp
     * @return double
     */
    public double getTemp(){ //returns the current temperature
        return this.temp;
    }   
    
    /**
     * getter for the min temp
     * @return double
     */
    public double getTemp_min(){ //returns the min temperature
        return this.temp_min;
    }
    
    /**
     * getter for the max temp
     * @return double
     */
    public double getTemp_max(){ //returns the max temperature
        return this.temp_max;
    }
    
    /**
     * getter for the humidity percentage
     * @return int
     */
    public int getHumidity(){
        return this.humidity;
    }
}

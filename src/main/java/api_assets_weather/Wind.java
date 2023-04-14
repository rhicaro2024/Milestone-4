/**
 * required class for calling from the weather api
 */
package api_assets_weather;

public class Wind {
    public double speed;
    public int deg;

    /**
     * getter for the speed of the wind
     * @return double
     */
    public double getSpeed(){ //returns the speed of the wind
        return this.speed;
    }
    
    /**
     * getter for the degree of the wind facing
     * @return int
     */
    public int getDeg(){
        return this.deg;
    }
}

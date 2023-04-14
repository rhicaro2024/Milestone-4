/**
 * Object class made to get specific weather data like wind, humidity, and weather 
 * type
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.Response;

/**
 *
 * @author raphaelhicaro
 */
public class WeatherObject extends WeatherAPICall{
    /**
     * getter for the wind speed
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return double
     */    
    @Override
    public double windCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getWind().getSpeed();
        return temp;
    }

     /**
     * getter for the humidity levels
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return int
     */    
    @Override
    public int humidityCall(Response weatherData, int index) {
        int temp = weatherData.getList()[index].getMain().getHumidity();
        return temp;
    }

     /**
     * getter for the type of weather
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return String
     */    
    @Override
    public String weatherCall(Response weatherData, int index) {
        String temp = weatherData.getList()[index].getWeather()[0].getDescription();
        return temp;
    }
    //==========================================================================
    @Override
    public String cityCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String countryCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCallHigh(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCallLow(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String dateCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
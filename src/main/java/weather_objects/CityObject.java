/**
 * Object class specifically for calling on city related methods from the API
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.*;

public class CityObject extends WeatherAPICall{
    /**
     * getter for returning the city name
     * @param weatherData api object
     * @return String
     */
     @Override
    public String cityCall(Response weatherData) {
        String temp = weatherData.getCity().getName();
        return temp;
    }
    
    /**
     * getter for returning the name of the country
     * @param weatherData api object
     * @return String
     */
    @Override
    public String countryCall(Response weatherData) {
        String temp = weatherData.getCity().getCountry();
        return temp;
    }
    //These methods are not used by this object
    //==========================================================================
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

    @Override
    public double windCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int humidityCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String weatherCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

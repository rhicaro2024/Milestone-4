/**
 * Object class made specifically for making a call for the date
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.Response;

public class DateObject extends WeatherAPICall{
        
    /**
     * getter for the date
     * @param weatherData api object
     * @param index index of date that the user wants
     * @return String
     */
    @Override
    public String dateCall(Response weatherData, int index) {
        String date_Num = weatherData.getList()[index].getDt_Text(); 
        String[] date_arr = date_Num.split(" ");
        return date_arr[0];
    }
    //These methods are not used
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

/**
 * object class made for getting the temperature from the weather api
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.Response;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureObject extends WeatherAPICall{
    /**
     * getter for the current temperature
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return double
     */
    @Override
    public double tempCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    /**
     * getter for the max temperature
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return double
     */
    @Override
    public double tempCallHigh(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_max();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    /**
     * getter for the min temperature
     * @param weatherData api object
     * @param index from the many times temp is displayed by the api
     * @return double
     */
    @Override
    public double tempCallLow(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_min();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }
    
    /**Need to Cite**
     * round the value given to certain number of places
     * @param value value that is to be rounded
     * @param places places to round the number to
     * @return double
     */
    public double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    /**
     * return the converted temp from f to c
     * @param value temp F to be changed
     * @return double
     */
    public double convert2Celsius(double value){
        double convertedValue = round(((value - 32) * 5)/9,2);
        return convertedValue;
    }
    //These methods are not used
    //==========================================================================
    
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
    
    @Override
    public String cityCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String countryCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

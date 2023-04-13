/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import api_assets_weather.Response;
import api_assets_weather.Location;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author raphaelhicaro
 */
public class weatherObject extends weatherInformation{    
    @Override
    public String cityCall(Response weatherData) {
        String temp = weatherData.getCity().getName();
        return temp;
    }

    @Override
    public String countryCall(Response weatherData) {
        String temp = weatherData.getCity().getCountry();
        return temp;
    }
    
    @Override
    public double tempCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    @Override
    public double tempCallHigh(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_max();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    @Override
    public double tempCallLow(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_min();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    @Override
    public String dateCall(Response weatherData, int index) {
        String date_Num = weatherData.getList()[index].getDt_Text(); 
        String[] date_arr = date_Num.split(" ");
        return date_arr[0];
    }

    @Override
    public double windCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getWind().getSpeed();
        return temp;
    }

    @Override
    public int humidityCall(Response weatherData, int index) {
        int temp = weatherData.getList()[index].getMain().getHumidity();
        return temp;
    }

    @Override
    public String weatherCall(Response weatherData, int index) {
        String temp = weatherData.getList()[index].getWeather()[0].getDescription();
        return temp;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public double convert2Celsius(double value){
        double convertedValue = round(((value - 32) * 5)/9,2);
        return convertedValue;
    }
    
    //Dont need these methods---------------------------------------------------
    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public static void main(String[] args){
        API_Response object = new API_Response();
        Location objectTest = object.getLocationResp("Beverly")[0];
        double testLat = objectTest.getLat();
        double testLon = objectTest.getLon();
        Response weather = object.getResponse(testLat, testLon);
        weatherObject obj = new weatherObject();
        System.out.println(obj.tempCall(weather, 0));
    }
}
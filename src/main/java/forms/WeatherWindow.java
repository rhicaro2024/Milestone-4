/**
 * Displays Typical Weather Conditions and Information Based on MainWindow City 
 * Input from the User. Displays Temperature in a day rotation and will include
 * changing the temp from Fahrenheit to Celsius and vice versa, MPH to KPH.
 * . Other Functions include selecting the day and seeing further weather
 * information. A change in location can occur spawning and input from the user
 * and the other button changes from the weather to the Pokemon page.
 */
package forms;

import classes.API_Response;
import api_assets.*;
import classes.*;
//import java.awt.event.MouseListener;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WeatherWindow extends javax.swing.JFrame{ // extend jpanel 
    private Response weatherData;
    private MainWindow mainwindow;
    private PokemonWindow pokemonwindow;
    private API_Response resp;
    private ArrayList<JLabel> tempHigh;
    private ArrayList<JLabel> tempLow;
    private ArrayList<JLabel> dateList;
    private ArrayList<JLabel> degreeList;
    private ArrayList<weatherInformation> weatherInfo;
//    private ArrayList<MouseListener> mouseListeners;
    private weatherObject weatherObj;
    
    //Cite this
    private static final DecimalFormat df = new DecimalFormat("0");
    private static final DecimalFormat df2 = new DecimalFormat("0.00");

/**
 * Creates new form WeatherWindow
 * initialize the Pokemon window, hides the imperial system button, and initializes
 * the array lists for JLabel and sets the weather information of the page.
 * @param weatherData the first portion of the API call from mainWindow
 */
    public WeatherWindow(Response weatherData) {
        initComponents();
        pokemonwindow = new PokemonWindow();
        pokemonwindow.setWeatherWin(this);
        imperialBtn.setVisible(false);
        
        this.weatherData = weatherData;
        weatherObj = new weatherObject();
        
//        mouseListeners = new ArrayList<>();
//        this.addMouseListener((MouseListener) this);
   
//        weatherInfo = new ArrayList<>();
//        weatherInfo.add(new weatherObject(weatherData));
        
        tempHigh = new ArrayList<>();
        tempHigh.add(high2);
        tempHigh.add(high3);
        tempHigh.add(high4);
        tempHigh.add(high5);
        
        tempLow = new ArrayList<>();
        tempLow.add(low2);
        tempLow.add(low3);
        tempLow.add(low4);
        tempLow.add(low5);
        
        dateList = new ArrayList<>();
        dateList.add(date2);
        dateList.add(date3);
        dateList.add(date4);
        dateList.add(date5);
        
        degreeList = new ArrayList<>();
        degreeList.add(degree1);
        degreeList.add(degree2);
        degreeList.add(degree3);
        degreeList.add(degree4);
        degreeList.add(degree5);
        degreeList.add(degree6);
        degreeList.add(degree7);
        degreeList.add(degree8);
        degreeList.add(degree9);
        degreeList.add(degree10);
        degreeList.add(degree11);
        
        setGeneralWeatherInfo(weatherData);
    }
    /**
     * sets the MainWindow as the creator of WeatherWindow.
     * @param myCreator the window that created this window
     */
    public void setMainWin(MainWindow myCreator){
        mainwindow = myCreator;
    }
    
    /**
     * Sets the weather information for most of the JLabels
     * @param weatherData the API response variable
     */
    public void setGeneralWeatherInfo(Response weatherData){
        CityName.setText(weatherObj.cityCall(weatherData));
        StateName.setText(weatherObj.countryCall(weatherData));
        WindSpeed.setText(df.format(weatherObj.windCall(weatherData, 0)));
        Humidity.setText(df.format(weatherObj.humidityCall(weatherData, 0)));
        CurrentWeather.setText(weatherObj.weatherCall(weatherData, 0));
        currentTemp.setText(df2.format(weatherObj.tempCall(weatherData, 0)));
        high1.setText(df.format(weatherObj.tempCallHigh(weatherData, 0)));
        low1.setText(df.format(weatherObj.tempCallLow(weatherData, 0)));
        date1.setText(weatherObj.dateCall(weatherData, 0));
        for (int i=0;i<tempHigh.size();i++){
            int x = ((i+1)*8)-1;
            tempHigh.get(i).setText(df.format(weatherObj.tempCallHigh(weatherData, x)));
            tempLow.get(i).setText(df.format(weatherObj.tempCallLow(weatherData, x)));
            dateList.get(i).setText(weatherObj.dateCall(weatherData, x));
        }
    }
    
    /**
     * gets the current temperature from current city
     * @param weatherData holds the beginning of the API call
     * @return double from the API which is the temperature
     */ 
    public double tempCall(Response weatherData){
        double temp = (weatherData.getList()[0].getMain().getTemp() - 273.15) * 9/5 + 32;
        return temp;
    }
    /**
     * gets the high temperature from current city
     * @param weatherData holds the beginning of the API call
     * @param index that wants to be accessed from API
     * @return double from API which is the max temp of that day
     */
    public double tempCallHigh(Response weatherData, int index){
        double temp = (weatherData.getList()[index].getMain().getTemp_max() - 273.15) * 9/5 + 32;
        return temp;
    }
    /**
     * gets the low temperature from current city
     * @param weatherData holds the beginning of the API call
     * @param index that wants to be accessed from API
     * @return double from API which is the min temp of that day
     */
    public double tempCallLow(Response weatherData, int index){
        double temp = (weatherData.getList()[index].getMain().getTemp_min() - 273.15) * 9/5 + 32;
        return temp;
    }
    
    /**
     * gets the date
     * @param weatherData holds the beginning of the API call
     * @param index that wants to be accessed from API
     * @return A string of the date
     */
    public String dateCall(Response weatherData, int index){
        String date_Num = weatherData.getList()[index].getDt_Text(); 
        String[] date_arr = date_Num.split(" ");
        return date_arr[0];
    }
    
    //Cite this
    public double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    //end of cited code
    
    public double convert2Celsius(double value){
        double convertedValue = round(((value - 32) * 5)/9,2);
        return convertedValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        day1 = new javax.swing.JLabel();
        day2 = new javax.swing.JLabel();
        day3 = new javax.swing.JLabel();
        day4 = new javax.swing.JLabel();
        day5 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        WeatherImage = new javax.swing.JLabel();
        high1 = new javax.swing.JLabel();
        low1 = new javax.swing.JLabel();
        high2 = new javax.swing.JLabel();
        low2 = new javax.swing.JLabel();
        high3 = new javax.swing.JLabel();
        low3 = new javax.swing.JLabel();
        high4 = new javax.swing.JLabel();
        low4 = new javax.swing.JLabel();
        high5 = new javax.swing.JLabel();
        low5 = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        PokedexBtn = new javax.swing.JButton();
        metricBtn = new javax.swing.JButton();
        imperialBtn = new javax.swing.JButton();
        ChangeLocBtn = new javax.swing.JButton();
        DayLabel = new javax.swing.JLabel();
        HighLabel = new javax.swing.JLabel();
        LowLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        CityName = new javax.swing.JLabel();
        currentTemp = new javax.swing.JLabel();
        currentTempLabel = new javax.swing.JLabel();
        CurrentWeatherLabel = new javax.swing.JLabel();
        CurrentWeather = new javax.swing.JLabel();
        StateName = new javax.swing.JLabel();
        WindSpeedLabel = new javax.swing.JLabel();
        WindSpeed = new javax.swing.JLabel();
        HumidityLabel = new javax.swing.JLabel();
        Humidity = new javax.swing.JLabel();
        DayWeatherLabel = new javax.swing.JLabel();
        weather1 = new javax.swing.JLabel();
        weather2 = new javax.swing.JLabel();
        weather3 = new javax.swing.JLabel();
        weather4 = new javax.swing.JLabel();
        weather5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        degree2 = new javax.swing.JLabel();
        degree3 = new javax.swing.JLabel();
        degree4 = new javax.swing.JLabel();
        degree5 = new javax.swing.JLabel();
        degree6 = new javax.swing.JLabel();
        degree7 = new javax.swing.JLabel();
        degree8 = new javax.swing.JLabel();
        degree9 = new javax.swing.JLabel();
        degree10 = new javax.swing.JLabel();
        degree11 = new javax.swing.JLabel();
        degree1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        day1.setText("Day1");

        day2.setText("Day2");

        day3.setText("Day3");

        day4.setText("Day4");

        day5.setText("Day5");

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Weathermon.png"))); // NOI18N

        WeatherImage.setBackground(new java.awt.Color(255, 255, 0));
        WeatherImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sun.png"))); // NOI18N

        high1.setText("Temp High");

        low1.setText("Temp Low");

        high2.setText("Temp High");

        low2.setText("Temp Low");

        high3.setText("Temp High");

        low3.setText("Temp Low");

        high4.setText("Temp High");

        low4.setText("Temp Low");

        high5.setText("Temp High");

        low5.setText("Temp Low");

        LocationLabel.setText("Location:");

        PokedexBtn.setText("Pokemon");

        metricBtn.setText("Metric");
        metricBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metricBtnActionPerformed(evt);
            }
        });

        imperialBtn.setText("Imperial");
        imperialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imperialBtnActionPerformed(evt);
            }
        });

        ChangeLocBtn.setText("Change Location");
        ChangeLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeLocBtnActionPerformed(evt);
            }
        });

        DayLabel.setText("Day");

        HighLabel.setText("Highs");

        LowLabel.setText("Lows");

        DateLabel.setText("Date");

        date1.setText("0000-00-00");

        date2.setText("0000-00-00");

        date3.setText("0000-00-00");

        date4.setText("0000-00-00");

        date5.setText("0000-00-00");

        CityName.setText("Place Holder");

        currentTemp.setText("Place Holder");

        currentTempLabel.setText("Current Temperature:");

        CurrentWeatherLabel.setText("Current Weather:");

        CurrentWeather.setText("Place Holder");

        StateName.setText("Place Holder");

        WindSpeedLabel.setText("Wind Speed:");

        WindSpeed.setText("Place Holder");

        HumidityLabel.setText("Humidity:");

        Humidity.setText("Place Holder");

        DayWeatherLabel.setText("Weather");

        weather1.setText("Image");

        weather2.setText("Image");

        weather3.setText("Image");

        weather4.setText("Image");

        weather5.setText("Image");

        jLabel1.setText(",");

        speed.setText("mph");

        jLabel3.setText("%");

        degree2.setText("°F");

        degree3.setText("°F");

        degree4.setText("°F");

        degree5.setText("°F");

        degree6.setText("°F");

        degree7.setText("°F");

        degree8.setText("°F");

        degree9.setText("°F");

        degree10.setText("°F");

        degree11.setText("°F");

        degree1.setText("°F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title)
                            .addGap(281, 281, 281))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CurrentWeatherLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CurrentWeather))
                        .addComponent(WeatherImage)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(HumidityLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Humidity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addComponent(ChangeLocBtn)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LocationLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CityName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StateName))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(currentTempLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currentTemp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(degree1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(WindSpeedLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(WindSpeed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(speed)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(metricBtn)
                                    .addComponent(PokedexBtn)
                                    .addComponent(imperialBtn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HighLabel)
                                    .addComponent(LowLabel)
                                    .addComponent(DayLabel)
                                    .addComponent(DateLabel)
                                    .addComponent(DayWeatherLabel))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day1)
                                    .addComponent(date1)
                                    .addComponent(weather1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(low1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(high1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(degree4)
                                            .addComponent(degree2))))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day2)
                                    .addComponent(date2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(low2)
                                            .addComponent(high2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(degree5)
                                            .addComponent(degree3)))
                                    .addComponent(weather2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day3)
                                    .addComponent(date3)
                                    .addComponent(weather3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(low3)
                                            .addComponent(high3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(degree7)
                                            .addComponent(degree6))))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date4)
                                    .addComponent(day4)
                                    .addComponent(weather4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(low4)
                                            .addComponent(high4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(degree9)
                                            .addComponent(degree8))))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weather5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date5)
                                    .addComponent(day5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(high5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(degree10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(low5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(degree11)))))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(PokedexBtn)
                            .addGap(18, 18, 18)
                            .addComponent(metricBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(imperialBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ChangeLocBtn)
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LocationLabel)
                                .addComponent(CityName)
                                .addComponent(StateName)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(currentTemp)
                                .addComponent(currentTempLabel)
                                .addComponent(degree1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(WindSpeedLabel)
                                .addComponent(WindSpeed)
                                .addComponent(speed))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HumidityLabel)
                                .addComponent(Humidity)
                                .addComponent(jLabel3))))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CurrentWeatherLabel)
                        .addComponent(CurrentWeather))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(WeatherImage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DayLabel)
                                .addComponent(day1)
                                .addComponent(day2)
                                .addComponent(day3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(low2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(weather4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(weather5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(DateLabel)
                                            .addComponent(date1)
                                            .addComponent(date2)
                                            .addComponent(date3)
                                            .addComponent(date4)
                                            .addComponent(date5))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(HighLabel)
                                                    .addComponent(high1)
                                                    .addComponent(high2)
                                                    .addComponent(high3)
                                                    .addComponent(high4)
                                                    .addComponent(high5)
                                                    .addComponent(degree2)
                                                    .addComponent(degree10))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(LowLabel)
                                                    .addComponent(low1)
                                                    .addComponent(degree4)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(degree3)
                                                .addGap(30, 30, 30)
                                                .addComponent(degree5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(degree6)
                                                .addGap(30, 30, 30)
                                                .addComponent(degree7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(degree8)
                                                .addGap(30, 30, 30)
                                                .addComponent(degree9)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(weather1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weather2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weather3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DayWeatherLabel)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(day4)
                                .addComponent(day5))
                            .addGap(184, 184, 184)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(low4)
                                .addComponent(low5)
                                .addComponent(low3)
                                .addComponent(degree11))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * changes the location of which the API is based on.
     * @param evt button event
     */
    private void ChangeLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeLocBtnActionPerformed
        //Plan of Action: Have a pop up asking the user to input the city that they
        //want to view. 
        //Issue with this code is that it does not return name of city or country,
        //or the right temperature for that city.
        
        
//        JFrame frame = new JFrame();
//        String newLocation = JOptionPane.showInputDialog(frame, "Enter new city:");
//        Location location = resp.getLocationResp(newLocation)[0];
//        double locationLat = location.getLat();
//        double locationLon = location.getLon();
//        Response newWeatherData = resp.getResponse(locationLon, locationLon);
//        System.out.println(weatherData);
//        weatherData = newWeatherData;
//        setGeneralWeatherInfo(newWeatherData);
    }//GEN-LAST:event_ChangeLocBtnActionPerformed

    /**
     * changes the measurements to the metric system
     * @param evt button event
     */
    private void metricBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metricBtnActionPerformed
        metricBtn.setVisible(false);
        imperialBtn.setVisible(true);
        
        int wind = parseInt(WindSpeed.getText());
        wind = (int) (wind * 1.609);
        WindSpeed.setText(df.format(wind));
        speed.setText("km/h");
        
        double curtemp = parseDouble(currentTemp.getText());
        currentTemp.setText(df2.format(convert2Celsius(curtemp)));
        
        double curHigh1 = parseDouble(high1.getText());
        high1.setText(df.format(convert2Celsius(curHigh1)));
        
        double curLow1 = parseDouble(low1.getText());
        low1.setText(df.format(convert2Celsius(curLow1)));
        
        for (int i=0; i<tempHigh.size();i++){
            double curHigh2 = parseDouble(tempHigh.get(i).getText());
            tempHigh.get(i).setText(df.format(convert2Celsius(curHigh2)));
            
            double curLow2 = parseDouble(tempLow.get(i).getText());
            tempLow.get(i).setText(df.format(convert2Celsius(curLow2)));
        }
        
        for (int i=0;i<degreeList.size();i++){
            degreeList.get(i).setText("°C");
        }
    }//GEN-LAST:event_metricBtnActionPerformed

    /**
     * changes the measurements to the imperial system
     * @param evt button event
     */
    private void imperialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imperialBtnActionPerformed
        metricBtn.setVisible(true);
        imperialBtn.setVisible(false);
        
        WindSpeed.setText(df.format(weatherObj.windCall(weatherData, 0)));
        speed.setText("mph");
        
        currentTemp.setText(df2.format(weatherObj.tempCall(weatherData, 0)));
        high1.setText(df.format(weatherObj.tempCallHigh(weatherData, 0)));
        low1.setText(df.format(weatherObj.tempCallLow(weatherData, 0)));
        for (int i=0;i<tempHigh.size();i++){
            int x = ((i+1)*8)-1;
            tempHigh.get(i).setText(df.format(weatherObj.tempCallHigh(weatherData, x)));
            tempLow.get(i).setText(df.format(weatherObj.tempCallHigh(weatherData, x)));
        }
        for (int i=0;i<degreeList.size();i++){
            degreeList.get(i).setText("°F");
        }
    }//GEN-LAST:event_imperialBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeLocBtn;
    private javax.swing.JLabel CityName;
    private javax.swing.JLabel CurrentWeather;
    private javax.swing.JLabel CurrentWeatherLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DayLabel;
    private javax.swing.JLabel DayWeatherLabel;
    private javax.swing.JLabel HighLabel;
    private javax.swing.JLabel Humidity;
    private javax.swing.JLabel HumidityLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel LowLabel;
    private javax.swing.JButton PokedexBtn;
    private javax.swing.JLabel StateName;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel WeatherImage;
    private javax.swing.JLabel WindSpeed;
    private javax.swing.JLabel WindSpeedLabel;
    private javax.swing.JLabel currentTemp;
    private javax.swing.JLabel currentTempLabel;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    private javax.swing.JLabel day1;
    private javax.swing.JLabel day2;
    private javax.swing.JLabel day3;
    private javax.swing.JLabel day4;
    private javax.swing.JLabel day5;
    private javax.swing.JLabel degree1;
    private javax.swing.JLabel degree10;
    private javax.swing.JLabel degree11;
    private javax.swing.JLabel degree2;
    private javax.swing.JLabel degree3;
    private javax.swing.JLabel degree4;
    private javax.swing.JLabel degree5;
    private javax.swing.JLabel degree6;
    private javax.swing.JLabel degree7;
    private javax.swing.JLabel degree8;
    private javax.swing.JLabel degree9;
    private javax.swing.JLabel high1;
    private javax.swing.JLabel high2;
    private javax.swing.JLabel high3;
    private javax.swing.JLabel high4;
    private javax.swing.JLabel high5;
    private javax.swing.JButton imperialBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel low1;
    private javax.swing.JLabel low2;
    private javax.swing.JLabel low3;
    private javax.swing.JLabel low4;
    private javax.swing.JLabel low5;
    private javax.swing.JButton metricBtn;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel weather1;
    private javax.swing.JLabel weather2;
    private javax.swing.JLabel weather3;
    private javax.swing.JLabel weather4;
    private javax.swing.JLabel weather5;
    // End of variables declaration//GEN-END:variables
}

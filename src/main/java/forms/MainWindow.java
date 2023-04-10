/**
 * Prompts the user to input a city that the user wants to view the weather of
 */
//This form prompts the user for a city they want to view for weather
package forms;
import classes.API_Response;
import api_assets.*;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author raphaelhicaro
 */
public class MainWindow extends javax.swing.JFrame{
    private WeatherWindow weatherwindow;
//    private API_Response response;
    private Response resp;
    private API_Response api_response;
   
    public MainWindow() {
        initComponents();
        api_response = new API_Response();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CityName = new javax.swing.JTextField();
        PokemonWindowBtn = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);

        CityName.setText("Enter City Name");

        PokemonWindowBtn.setText("PokéGo");
        PokemonWindowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokemonWindowBtnActionPerformed(evt);
            }
        });

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Weathermon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(PokemonWindowBtn)))
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PokemonWindowBtn)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * changes windows and transfers over the Response variable to make API calls 
     * in weather window
     * @param evt button event
     */
    private void PokemonWindowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokemonWindowBtnActionPerformed
        String city = CityName.getText();
        Location location_response = api_response.getLocationResp(city)[0];
        double location_lat = location_response.getLat();
        double location_lon = location_response.getLon();
        resp = api_response.getResponse(location_lat, location_lon);        
        
        weatherwindow = new WeatherWindow(resp);
        weatherwindow.setMainWin(this);
        
        weatherwindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PokemonWindowBtnActionPerformed

    public static void main(String args[]) {
       MainWindow mainwindow = new MainWindow();
       mainwindow.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityName;
    private javax.swing.JButton PokemonWindowBtn;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
package forms.test;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Pokeframe extends javax.swing.JFrame {
    private TestPanel test1;
    private TestPanel2 test2;
    private int stateNumber;
    private ArrayList<JPanel> panelList;
    
    public Pokeframe() {
        initComponents();
        stateNumber = 0;
        test1 = new TestPanel();
        test2 = new TestPanel2();
        test1.setSize(400,400);
        test2.setSize(400,400);
        descriptionPanel.add(test1);
        descriptionPanel.add(test2);
        
        changeState(stateNumber);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokedexPanel = new javax.swing.JPanel();
        descriptionPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        windowDisplayInfo = new javax.swing.JPanel();
        windowNameDisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pokedexPanel.setBackground(new java.awt.Color(255, 51, 51));
        pokedexPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        pokedexPanel.setMaximumSize(new java.awt.Dimension(500, 700));
        pokedexPanel.setPreferredSize(new java.awt.Dimension(500, 700));

        descriptionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        descriptionPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        descriptionPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        descriptionPanel.setSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        descriptionPanelLayout.setVerticalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        userPanel.setBackground(new java.awt.Color(99, 99, 99));
        userPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        userPanel.setPreferredSize(new java.awt.Dimension(400, 150));

        windowDisplayInfo.setBackground(new java.awt.Color(141, 198, 69));
        windowDisplayInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        windowDisplayInfo.setPreferredSize(new java.awt.Dimension(260, 100));

        windowNameDisplay.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        windowNameDisplay.setText("Place Holder");

        javax.swing.GroupLayout windowDisplayInfoLayout = new javax.swing.GroupLayout(windowDisplayInfo);
        windowDisplayInfo.setLayout(windowDisplayInfoLayout);
        windowDisplayInfoLayout.setHorizontalGroup(
            windowDisplayInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowDisplayInfoLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(windowNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        windowDisplayInfoLayout.setVerticalGroup(
            windowDisplayInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowNameDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jButton1.setText("Enter");

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPanelBtn(evt);
            }
        });

        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return2LastPanelBtn(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pokedexPanelLayout = new javax.swing.GroupLayout(pokedexPanel);
        pokedexPanel.setLayout(pokedexPanelLayout);
        pokedexPanelLayout.setHorizontalGroup(
            pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokedexPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        pokedexPanelLayout.setVerticalGroup(
            pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokedexPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(userPanel, 129, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pokedexPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pokedexPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return2LastPanelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return2LastPanelBtn
        if (stateNumber == 0){
            stateNumber -= 0;
        } else {
            stateNumber -= 1;
        }
        System.out.println(stateNumber);
        changeState(stateNumber);
    }//GEN-LAST:event_return2LastPanelBtn

    private void nextPanelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPanelBtn
        stateNumber += 1;
        System.out.println(stateNumber);
        changeState(stateNumber);

    }//GEN-LAST:event_nextPanelBtn
    
    public void changeState(int stateNumber){
        if (stateNumber == 0){
            windowNameDisplay.setText("Enter City");
            test2.setVisible(false);
            test1.setVisible(true);
        }
        if (stateNumber == 1){
            windowNameDisplay.setText("Day 1");
            test2.setVisible(true);
            test1.setVisible(false);
        }
        if (stateNumber == 2){
            windowNameDisplay.setText("Day 2");
        }
        if (stateNumber == 3){
            windowNameDisplay.setText("Day 3");
        }
        if (stateNumber == 4){
            windowNameDisplay.setText("Day 4");
        }
        if (stateNumber == 5){
            windowNameDisplay.setText("Day 5");
        }
        if (stateNumber == 6){
            windowNameDisplay.setText("Day 5");
        }
        if (stateNumber == 7){
            windowNameDisplay.setText("Pokémon");
        }
        if (stateNumber == 8){
            windowNameDisplay.setText("Pokédex");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel pokedexPanel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel windowDisplayInfo;
    private javax.swing.JLabel windowNameDisplay;
    // End of variables declaration//GEN-END:variables
}

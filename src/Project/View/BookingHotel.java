/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author UG-Moustafa
 */
public class BookingHotel extends javax.swing.JFrame {

    /**
     * Creates new form BookingHotel
     */
     private Timer thetimer;
     int thecount=1;
    
    public BookingHotel() {
        initComponents();
        this.setSize(1100, 650);
        this.setTitle("Bookin Hotel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
       thetimer=new Timer(8000, new timerlistener());
       thetimer.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSpinField1 = new com.toedter.components.JSpinField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("personlize to your need");

        jButton2.setBackground(new java.awt.Color(38, 150, 196));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/saving.png"))); // NOI18N
        jButton2.setText("SAVE  Booking");

        jButton3.setBackground(new java.awt.Color(238, 195, 82));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/_cancel.png"))); // NOI18N
        jButton3.setText("CANCEL  Booking");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hooome (2).png"))); // NOI18N
        jButton1.setText("BACK  Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Miriam", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hotel.png"))); // NOI18N
        jLabel1.setText("Booking HOTEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 27, 250, 70);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 98, 234, 2);

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel2.setText("Tick Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 234, 16);

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel3.setText("Country");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 210, 234, 16);

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel4.setText("Hotel Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 300, 234, 16);

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel5.setText("Num Rooms");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 390, 100, 16);

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel6.setText("Total Price");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 480, 110, 16);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 0, 0));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(30, 500, 234, 35);

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/r.png"))); // NOI18N
        jLabel7.setText("Num Nights");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 390, 100, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 320, 230, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(30, 150, 228, 30);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(380, 100, 2, 447);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel8.setText("Sample Of OUR HOTEL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(425, 97, 241, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("personlize to your need");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(425, 132, 222, 15);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/silder hotel/1.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(425, 165, 620, 220);

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText(" The Tahrir Hotel");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(234, 214, 168), new java.awt.Color(234, 214, 183), new java.awt.Color(234, 214, 183), new java.awt.Color(234, 214, 183)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(430, 400, 253, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Egypt - Cario- The Tahrir.st");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(437, 444, 273, 17);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(425, 401, 2, 60);

        jButton4.setBackground(new java.awt.Color(38, 150, 196));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/saving.png"))); // NOI18N
        jButton4.setText("SAVE  Booking");
        jPanel1.add(jButton4);
        jButton4.setBounds(410, 509, 160, 40);

        jButton5.setBackground(new java.awt.Color(238, 195, 82));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/_cancel.png"))); // NOI18N
        jButton5.setText("CANCEL  Booking");
        jPanel1.add(jButton5);
        jButton5.setBounds(590, 510, 160, 40);

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hooome (2).png"))); // NOI18N
        jButton6.setText("BACK  Home");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(760, 510, 150, 40);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(30, 230, 228, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sittings.png"))); // NOI18N
        jLabel15.setText("Eng : Moustafa");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(930, 50, 140, 30);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/call.png"))); // NOI18N
        jLabel20.setText(" :::  0109 106 9 260");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(840, 10, 240, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/in.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(780, 10, 40, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/youtube.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22);
        jLabel22.setBounds(730, 10, 40, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/twitter.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(680, 10, 40, 40);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/face.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(630, 10, 40, 40);

        jButton7.setBackground(new java.awt.Color(102, 153, 255));
        jButton7.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print-icon.png"))); // NOI18N
        jButton7.setText("Print Tickt");
        jPanel1.add(jButton7);
        jButton7.setBounds(930, 510, 140, 40);

        jSpinField1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jSpinField1.setValue(1);
        jPanel1.add(jSpinField1);
        jSpinField1.setBounds(160, 410, 90, 30);

        jSpinField2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jSpinField2.setValue(1);
        jPanel1.add(jSpinField2);
        jSpinField2.setBounds(30, 410, 90, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/booking bg.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 1110, 650);

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Tools");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        Overview2 ov=new Overview2();
        ov.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
 
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.setVisible(false);
        Overview2 ov=new Overview2();
        ov.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        String url="https://www.linkedin.com/uas/login";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Overview2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        String url="https://www.youtube.com/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Overview2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        String url="https://www.twitter.com/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Overview2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        String url="https://www.facebook.com/groups/151130771724647/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Overview2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel24MouseClicked

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
            java.util.logging.Logger.getLogger(BookingHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingHotel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

 private class timerlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         
          //jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/img3.png")));
          //jPanel2.setBackground(new java.awt.Color(142, 93, 86));
            
            String[]hote_name={"Lautor Egle Hotel","The Blue Sky Hotel","Kota Max-Ya Hotel ","Talo Hours Hotel","Eglye Moon Hotel","Sun Rise Hotel"};
            String[]hote_address={"Egypt - Cario- The Tahrir.st","ITly -Melano-Nar.st","Franc-Paris- Sun.st","Doubi-Gada-Mas.st","Brazill-Main- KAKA.st","Egypt - Cario- The Tahrir.st"};
           
            
           thecount++;
           if(thecount>=6){
           thecount=1;
           }
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/silder hotel/"+thecount+".png")));
            jLabel12.setText(hote_name[thecount]);
            jLabel13.setText(hote_address[thecount]);
            
           
        }
    
    
    
    }



}

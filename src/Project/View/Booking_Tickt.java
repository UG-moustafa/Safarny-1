/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author UG-Moustafa
 */
public class Booking_Tickt extends javax.swing.JFrame {
     
    /**
     * Creates new form Booking_Tickt
     */
     
    
    public Booking_Tickt() {
        initComponents();
        this.setSize(1090,700);
        this.setTitle("Booking Tickt ");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jSpinField3 = new com.toedter.components.JSpinField();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/the tickt icon.png"))); // NOI18N
        jLabel1.setText("Booking Tickt");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 251, 49);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 90, 290, 2);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel2.setText("Tickt  Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 140, 120, 17);

        jTextField1.setFont(new java.awt.Font("Vrinda", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(60, 160, 234, 30);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel3.setText("Passanger Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 220, 150, 17);

        jTextField2.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(60, 240, 234, 30);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/small star.png"))); // NOI18N
        jLabel4.setText("Passanger E-Mail");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(770, 150, 160, 17);

        jTextField3.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(770, 170, 250, 30);

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel5.setText("Travel State");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 310, 150, 20);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel6.setText("Province  From");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 300, 140, 17);

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setText("Flight Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 390, 201, 17);

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/small star.png"))); // NOI18N
        jLabel8.setText("Passangers");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(415, 139, 110, 20);

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/small star.png"))); // NOI18N
        jLabel9.setText("Num Of Babies");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 260, 110, 16);

        jTextField9.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(242, 10, 1));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField9.setEnabled(false);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(410, 500, 230, 30);

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel10.setText("Total Price");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(410, 480, 201, 17);

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel11.setText("Airport");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 390, 90, 17);

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/star.png"))); // NOI18N
        jLabel12.setText("To");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 470, 80, 20);

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/small star.png"))); // NOI18N
        jLabel13.setText("childs");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(420, 200, 70, 20);

        jLabel14.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/notes.png"))); // NOI18N
        jLabel14.setText("Notes About fligth");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(770, 220, 200, 30);

        jTextArea1.setBackground(new java.awt.Color(250, 248, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(770, 256, 250, 120);

        jTextArea2.setBackground(new java.awt.Color(250, 248, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(774, 416, 250, 110);

        jCheckBox1.setBackground(new java.awt.Color(234, 214, 183));
        jCheckBox1.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 0, 0));
        jCheckBox1.setText("Sens Massage To Passangers");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(770, 391, 239, 20);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(30, 554, 979, 2);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hooome (2).png"))); // NOI18N
        jButton1.setText("BACK  Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 580, 170, 40);

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/saving.png"))); // NOI18N
        jButton2.setText("SAVE  Booking");
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 580, 170, 40);

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/_cancel.png"))); // NOI18N
        jButton3.setText("CANCEL  Booking");
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 580, 180, 40);

        jRadioButton1.setBackground(new java.awt.Color(234, 214, 183));
        jRadioButton1.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jRadioButton1.setText("Going & Back");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(410, 335, 130, 20);

        jRadioButton2.setBackground(new java.awt.Color(234, 214, 183));
        jRadioButton2.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jRadioButton2.setText("Going");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(540, 330, 70, 30);

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(60, 330, 230, 30);

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(60, 500, 230, 30);

        jComboBox5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(60, 410, 230, 30);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 3, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 130, 3, 420);

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(380, 130, 3, 420);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 3, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(740, 130, 3, 420);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sittings.png"))); // NOI18N
        jLabel15.setText("Eng : Moustafa");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(910, 50, 140, 30);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/call.png"))); // NOI18N
        jLabel20.setText(" :::  0109 106 9 260");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(820, 10, 240, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/in.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(760, 10, 40, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/youtube.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22);
        jLabel22.setBounds(710, 10, 40, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/twitter.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(660, 10, 40, 40);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/face.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(610, 10, 40, 40);

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print-icon.png"))); // NOI18N
        jButton4.setText("Print Tickt");
        jPanel1.add(jButton4);
        jButton4.setBounds(790, 580, 160, 40);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(410, 410, 230, 30);

        jSpinField1.setBackground(new java.awt.Color(234, 214, 183));
        jSpinField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jSpinField1);
        jSpinField1.setBounds(540, 250, 90, 30);

        jSpinField2.setBackground(new java.awt.Color(234, 214, 183));
        jSpinField2.setAutoscrolls(true);
        jSpinField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinField2.setValue(1);
        jPanel1.add(jSpinField2);
        jSpinField2.setBounds(540, 130, 90, 30);

        jSpinField3.setBackground(new java.awt.Color(234, 214, 183));
        jSpinField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jSpinField3);
        jSpinField3.setBounds(540, 190, 90, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/booking bg.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 0, 1090, 650);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        Overview2 ov=new Overview2();
        ov.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking_Tickt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Tickt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Tickt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Tickt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Tickt().setVisible(true);
            }
        });
        
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private com.toedter.components.JSpinField jSpinField3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
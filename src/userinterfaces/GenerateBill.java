/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterfaces;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import classes.AppointmentSingleton;
import classes.Invoice;
import classes.User;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Istina
 */
public class GenerateBill extends javax.swing.JFrame {
    
    
     
    public GenerateBill()
    {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_new_appointment_update = new javax.swing.JLabel();
        lbl_logout_update = new javax.swing.JLabel();
        lbl_view_appointments__update = new javax.swing.JLabel();
        lbl_update_appointments_update = new javax.swing.JLabel();
        lbl_generate_invoice_update = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_invoice_patient_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_invoice_date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_invoice_app_search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_invoice_app_id = new javax.swing.JTextField();
        btn_generate_invoice = new javax.swing.JButton();
        txt_invoice_contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_invoice_time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_whitening = new javax.swing.JCheckBox();
        cb_cleaning = new javax.swing.JCheckBox();
        cb_root_canal_therapy = new javax.swing.JCheckBox();
        cb_filling = new javax.swing.JCheckBox();
        cb_nerve_filling = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txt_total_bill = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_total_doctor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minilogo.png"))); // NOI18N

        lbl_new_appointment_update.setBackground(new java.awt.Color(255, 255, 255));
        lbl_new_appointment_update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_new_appointment_update.setForeground(new java.awt.Color(0, 0, 0));
        lbl_new_appointment_update.setText("  New Appointment");
        lbl_new_appointment_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_new_appointment_updateMouseClicked(evt);
            }
        });

        lbl_logout_update.setBackground(new java.awt.Color(255, 255, 255));
        lbl_logout_update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_logout_update.setForeground(new java.awt.Color(0, 0, 0));
        lbl_logout_update.setText("  Logout");
        lbl_logout_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logout_updateMouseClicked(evt);
            }
        });

        lbl_view_appointments__update.setBackground(new java.awt.Color(255, 255, 255));
        lbl_view_appointments__update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_view_appointments__update.setForeground(new java.awt.Color(0, 0, 0));
        lbl_view_appointments__update.setText("  View Appointments");
        lbl_view_appointments__update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view_appointments__updateMouseClicked(evt);
            }
        });

        lbl_update_appointments_update.setBackground(new java.awt.Color(255, 255, 255));
        lbl_update_appointments_update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_update_appointments_update.setForeground(new java.awt.Color(0, 0, 0));
        lbl_update_appointments_update.setText("  Update Appointment");
        lbl_update_appointments_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_update_appointments_updateMouseClicked(evt);
            }
        });

        lbl_generate_invoice_update.setBackground(new java.awt.Color(255, 255, 255));
        lbl_generate_invoice_update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_generate_invoice_update.setForeground(new java.awt.Color(0, 0, 0));
        lbl_generate_invoice_update.setText("  Generate Invoice");
        lbl_generate_invoice_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_generate_invoice_updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_new_appointment_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl_view_appointments__update, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addComponent(lbl_update_appointments_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_generate_invoice_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_logout_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(lbl_new_appointment_update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_view_appointments__update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_update_appointments_update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_generate_invoice_update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_logout_update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Generate Invoice");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        txt_invoice_patient_name.setEditable(false);
        txt_invoice_patient_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice_patient_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_invoice_patient_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_invoice_patient_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_invoice_patient_nameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contact");

        txt_invoice_date.setEditable(false);
        txt_invoice_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice_date.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_invoice_date.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date");

        btn_invoice_app_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_invoice_app_search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_invoice_app_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_invoice_app_search.setText("Search");
        btn_invoice_app_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_invoice_app_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invoice_app_searchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Appointment ID");

        txt_invoice_app_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice_app_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txt_invoice_app_id.setForeground(new java.awt.Color(0, 0, 0));

        btn_generate_invoice.setBackground(new java.awt.Color(5, 77, 149));
        btn_generate_invoice.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btn_generate_invoice.setForeground(new java.awt.Color(255, 255, 255));
        btn_generate_invoice.setText("Generate Invoice");
        btn_generate_invoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_generate_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_invoiceActionPerformed(evt);
            }
        });

        txt_invoice_contact.setEditable(false);
        txt_invoice_contact.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice_contact.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_invoice_contact.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Time");

        txt_invoice_time.setEditable(false);
        txt_invoice_time.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice_time.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_invoice_time.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Treatment Type");

        cb_whitening.setBackground(new java.awt.Color(204, 255, 255));
        cb_whitening.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_whitening.setForeground(new java.awt.Color(0, 0, 0));
        cb_whitening.setText("Whitening");

        cb_cleaning.setBackground(new java.awt.Color(204, 255, 255));
        cb_cleaning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_cleaning.setForeground(new java.awt.Color(0, 0, 0));
        cb_cleaning.setText("Cleaning");

        cb_root_canal_therapy.setBackground(new java.awt.Color(204, 255, 255));
        cb_root_canal_therapy.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_root_canal_therapy.setForeground(new java.awt.Color(0, 0, 0));
        cb_root_canal_therapy.setText("Root Canal Therapy");

        cb_filling.setBackground(new java.awt.Color(204, 255, 255));
        cb_filling.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_filling.setForeground(new java.awt.Color(0, 0, 0));
        cb_filling.setText("Filling");

        cb_nerve_filling.setBackground(new java.awt.Color(204, 255, 255));
        cb_nerve_filling.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        cb_nerve_filling.setForeground(new java.awt.Color(0, 0, 0));
        cb_nerve_filling.setText("Nerve Filling");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total");

        txt_total_bill.setEditable(false);
        txt_total_bill.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_bill.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_total_bill.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Doctor");

        txt_total_doctor.setEditable(false);
        txt_total_doctor.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_doctor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txt_total_doctor.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41)
                                .addComponent(txt_invoice_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_invoice_app_search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(402, 402, 402)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                        .addGap(363, 363, 363))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(131, 131, 131)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_invoice_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_invoice_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(89, 89, 89)
                                        .addComponent(txt_invoice_time, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_whitening)
                                    .addComponent(cb_root_canal_therapy)
                                    .addComponent(cb_filling)
                                    .addComponent(cb_cleaning)
                                    .addComponent(cb_nerve_filling))
                                .addGap(136, 136, 136))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(88, 88, 88)
                                        .addComponent(txt_total_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(72, 72, 72)
                                        .addComponent(txt_total_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_generate_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_invoice_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_invoice_app_search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_cleaning)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(cb_whitening)
                        .addGap(18, 18, 18)
                        .addComponent(cb_filling)
                        .addGap(18, 18, 18)
                        .addComponent(cb_nerve_filling)
                        .addGap(18, 18, 18)
                        .addComponent(cb_root_canal_therapy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_invoice_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_invoice_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_invoice_time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btn_generate_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_invoice_patient_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_invoice_patient_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoice_patient_nameActionPerformed

  
    
    

    //method to generate pdf invoice and call calculateBill method to calculate final bill
    private void btn_generate_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_invoiceActionPerformed
     
        String path = System.getProperty("user.home") + "\\Downloads\\";
        
        String appointmentNo=txt_invoice_app_id.getText();
        String currentUsername=User.getLoggedInUser();          
       
        AppointmentSingleton foundAppointment= AppointmentSingleton.getInstance().searchAppointmentById(appointmentNo);
       
    
       if(appointmentNo.equals("")) 
        {
         JOptionPane.showMessageDialog(null,"Please enter appointment number","Error", JOptionPane.ERROR_MESSAGE);
        }
       if(txt_invoice_patient_name.getText().equals("")) 
        {
         JOptionPane.showMessageDialog(null,"Please search for appointment details to proceed","Error", JOptionPane.ERROR_MESSAGE);
        }
       if (!cb_cleaning.isSelected() && !cb_whitening.isSelected() && !cb_filling.isSelected() && !cb_nerve_filling.isSelected() && !cb_root_canal_therapy.isSelected()) 
       {
           JOptionPane.showMessageDialog(null, "Please select treatment(s).","Error", JOptionPane.ERROR_MESSAGE);
       }
      
        
       else
       { 
        try 
         {           
            if (cb_cleaning.isSelected()||cb_whitening.isSelected()||cb_filling.isSelected()||cb_nerve_filling.isSelected()||cb_root_canal_therapy.isSelected()) 
            {
                Invoice invoice=new Invoice();
                double totalFee=invoice.calculateBill(appointmentNo,cb_cleaning, cb_whitening, cb_filling, cb_nerve_filling, cb_root_canal_therapy);
       
                txt_total_bill.setText(Double.toString(totalFee));
                
              
               
                com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                
           
                PdfWriter.getInstance(doc,new FileOutputStream(path+""+appointmentNo+".pdf"));
                doc.open();
                Paragraph  para1= new Paragraph("***************************************************************************************************************\n");
                doc.add(para1);
                Paragraph para2= new Paragraph("                                                             Tooth Care\n");
                doc.add(para2);
                doc.add(para1);
                Paragraph para3= new Paragraph("\tInvoice No : "+foundAppointment.getInvoice().getInvoiceId()+"\nCreated By : "+currentUsername+"\nPatient Name : "+txt_invoice_patient_name.getText()+"\nMobile Number : "+txt_invoice_contact.getText()+"\n Appointment Date : "+txt_invoice_date.getText()+" "+"\n Appointment Time : "+txt_invoice_time.getText()+" "+"\n Doctor : "+txt_total_doctor.getText()+" ");
                doc.add(para3);
                doc.add(para1);
                Paragraph para4= new Paragraph("\n");
                doc.add(para4);
                doc.add(para1);
                Paragraph para6= new Paragraph("\n");
                doc.add(para6);
                PdfPTable table1=new PdfPTable(2);
                //set 1st row as header
                table1.setHeaderRows(1);
                
                table1.addCell("Treatment");
                table1.addCell("Price ");
                
               

                //add the data
                if(cb_cleaning.isSelected())
                {
                    table1.addCell("Cleaning");  
                    table1.addCell("6500.00");
                } 
                    
                if(cb_whitening.isSelected())
                {   table1.addCell("Whitening");  
                    table1.addCell("35000.00"); 
                }    
                    
                if(cb_filling.isSelected())
                {   table1.addCell("Filling");  
                    table1.addCell("4000.00"); 
                }
                  
                if(cb_nerve_filling.isSelected())
                {   table1.addCell("Nerve Filling");  
                    table1.addCell("30000.00");
                }
                    
                if(cb_root_canal_therapy.isSelected())
                {  table1.addCell("Root Canal Therapy");  
                   table1.addCell("25000.00"); 
                }
                   
                 table1.addCell("Total Bill");
                 table1.addCell(txt_total_bill.getText()); 
                

                doc.add(table1);
                doc.add(para6);
                doc.add(para1);
                Paragraph  para5= new Paragraph("                                                  Thank you ! Please visit us again...\n");
                doc.add(para5);
                doc.add(para1);

                doc.close();

            } 
            
            int a =JOptionPane.showConfirmDialog(null,"Do you want to print the bill ? ","Select",JOptionPane.YES_NO_OPTION);
            if(a==1)
            {
                setVisible(false);
                new GenerateBill().setVisible(true);
            }
            if(a==0)
            {
                try
                {
                    if((new File(path+appointmentNo+".pdf")).exists())
                    {
                        
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path+appointmentNo+".pdf");
                        setVisible(false);
                        new GenerateBill().setVisible(true);
                    }
                    else
                    { System.out.println("File does not exist. ");}
                    
                    
                } 

                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                  
            }//if
         

          } //try
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
     
       
     }//else
     
        
    }//GEN-LAST:event_btn_generate_invoiceActionPerformed

    private void lbl_new_appointment_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_new_appointment_updateMouseClicked
        setVisible(false);
        NewAppointment.resetInstance();
        NewAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_new_appointment_updateMouseClicked

    private void lbl_view_appointments__updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view_appointments__updateMouseClicked
        setVisible(false);
        new ViewAppointment().setVisible(true);
    }//GEN-LAST:event_lbl_view_appointments__updateMouseClicked

    private void lbl_update_appointments_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update_appointments_updateMouseClicked
       setVisible(false);
       UpdateAppointment.resetInstance();
       UpdateAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_update_appointments_updateMouseClicked

    private void lbl_generate_invoice_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generate_invoice_updateMouseClicked
        setVisible(false);
        new GenerateBill().setVisible(true);
    }//GEN-LAST:event_lbl_generate_invoice_updateMouseClicked

    private void lbl_logout_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout_updateMouseClicked
        int choice=JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Logout",  JOptionPane.YES_NO_OPTION);
        if(choice==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_lbl_logout_updateMouseClicked

    //method to get appointment details by ID to calculate bill
    private void btn_invoice_app_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invoice_app_searchActionPerformed
     try{
            String appointmentNo=txt_invoice_app_id.getText().toString();
           
            AppointmentSingleton foundAppointment= AppointmentSingleton.getInstance().searchAppointmentById(appointmentNo);
            
                if(appointmentNo.equals("")) 
                {
                    JOptionPane.showMessageDialog(null,"Please enter appointment number","Error", JOptionPane.ERROR_MESSAGE);
                } 
                
                if(foundAppointment.getAppointmentStatus().equals("COMPLETE"))
                {
                  JOptionPane.showMessageDialog(null,"Appointment completed already. Find bill in downloads folder.");
                  txt_invoice_app_id.setText("");
                }  
        
                else 
                {          
                    txt_invoice_app_id.setEditable(false);
                    txt_invoice_patient_name.setText(foundAppointment.getPatient().getPatientName());
                    txt_invoice_contact.setText(foundAppointment.getPatient().getPatientContact());
                    txt_invoice_time.setText(foundAppointment.getAppointmentTime());
                    txt_invoice_date.setText(foundAppointment.getAppointmentDate());    
                    txt_total_doctor.setText(foundAppointment.getDoctor());
                }
     }//end of try//end of try//end of try//end of try
     
     catch(NullPointerException e)
     {
         JOptionPane.showMessageDialog(null,"Invalid Appointment ID. Enter a valid ID.","Error", JOptionPane.ERROR_MESSAGE);
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_btn_invoice_app_searchActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generate_invoice;
    private javax.swing.JButton btn_invoice_app_search;
    private javax.swing.JCheckBox cb_cleaning;
    private javax.swing.JCheckBox cb_filling;
    private javax.swing.JCheckBox cb_nerve_filling;
    private javax.swing.JCheckBox cb_root_canal_therapy;
    private javax.swing.JCheckBox cb_whitening;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_generate_invoice_update;
    private javax.swing.JLabel lbl_logout_update;
    private javax.swing.JLabel lbl_new_appointment_update;
    private javax.swing.JLabel lbl_update_appointments_update;
    private javax.swing.JLabel lbl_view_appointments__update;
    private javax.swing.JTextField txt_invoice_app_id;
    private javax.swing.JTextField txt_invoice_contact;
    private javax.swing.JTextField txt_invoice_date;
    private javax.swing.JTextField txt_invoice_patient_name;
    private javax.swing.JTextField txt_invoice_time;
    private javax.swing.JTextField txt_total_bill;
    private javax.swing.JTextField txt_total_doctor;
    // End of variables declaration//GEN-END:variables
}

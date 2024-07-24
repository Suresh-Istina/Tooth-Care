/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterfaces;

import classes.AppointmentSingleton;
import classes.Doctor;
import classes.Schedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Istina
 */
public class ViewAppointment extends javax.swing.JFrame {

    /**
     * Creates new form ViewAppointment
     */
    public ViewAppointment() {
        initComponents();
         // Call the addDoctor method to get the list of doctors
        ArrayList<Doctor> doctors = Doctor.addDoctor();

        // Populate the doctor names in the combo box
        for (Doctor doctor : doctors) {
            cmb_box_doctor_name.addItem(doctor.getDoctorName());
        }
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_new_appointment_update = new javax.swing.JLabel();
        lbl_logout_view = new javax.swing.JLabel();
        lbl_view_appointments = new javax.swing.JLabel();
        lbl_update_appointments_view = new javax.swing.JLabel();
        lbl_generate_invoice_view = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_view_app_date = new com.toedter.calendar.JDateChooser();
        btn_view_app_search_id = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_view_app_id = new javax.swing.JTextField();
        btn_view_app_search_date = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_view_appointment = new javax.swing.JTable();
        btn_show_all_app = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_view_app_name = new javax.swing.JTextField();
        btn_view_app_search_name = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmb_box_doctor_name = new javax.swing.JComboBox<>();

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

        lbl_logout_view.setBackground(new java.awt.Color(255, 255, 255));
        lbl_logout_view.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_logout_view.setForeground(new java.awt.Color(0, 0, 0));
        lbl_logout_view.setText("  Logout");
        lbl_logout_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logout_viewMouseClicked(evt);
            }
        });

        lbl_view_appointments.setBackground(new java.awt.Color(255, 255, 255));
        lbl_view_appointments.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_view_appointments.setForeground(new java.awt.Color(0, 0, 0));
        lbl_view_appointments.setText("  View Appointments");
        lbl_view_appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view_appointmentsMouseClicked(evt);
            }
        });

        lbl_update_appointments_view.setBackground(new java.awt.Color(255, 255, 255));
        lbl_update_appointments_view.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_update_appointments_view.setForeground(new java.awt.Color(0, 0, 0));
        lbl_update_appointments_view.setText("  Update Appointment");
        lbl_update_appointments_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_update_appointments_viewMouseClicked(evt);
            }
        });

        lbl_generate_invoice_view.setBackground(new java.awt.Color(255, 255, 255));
        lbl_generate_invoice_view.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_generate_invoice_view.setForeground(new java.awt.Color(0, 0, 0));
        lbl_generate_invoice_view.setText("  Generate Invoice");
        lbl_generate_invoice_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_generate_invoice_viewMouseClicked(evt);
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
            .addComponent(lbl_view_appointments, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addComponent(lbl_update_appointments_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_generate_invoice_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_logout_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(lbl_new_appointment_update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_view_appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_update_appointments_view, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_generate_invoice_view, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_logout_view, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("View Appointments");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date");

        txt_view_app_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_view_app_date.setForeground(new java.awt.Color(0, 0, 0));
        txt_view_app_date.setDateFormatString("EEEE, dd/MM/yyyy");

        btn_view_app_search_id.setBackground(new java.awt.Color(0, 0, 0));
        btn_view_app_search_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_view_app_search_id.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_app_search_id.setText("Search");
        btn_view_app_search_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_view_app_search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_app_search_idActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Appointment ID");

        txt_view_app_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_view_app_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txt_view_app_id.setForeground(new java.awt.Color(0, 0, 0));

        btn_view_app_search_date.setBackground(new java.awt.Color(0, 0, 0));
        btn_view_app_search_date.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_view_app_search_date.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_app_search_date.setText("Search");
        btn_view_app_search_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_view_app_search_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_app_search_dateActionPerformed(evt);
            }
        });

        tbl_view_appointment.setBackground(new java.awt.Color(255, 255, 255));
        tbl_view_appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tbl_view_appointment.setForeground(new java.awt.Color(0, 0, 0));
        tbl_view_appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Doctor", "Name", "Address", "Contact", "Age", "Date", "Time", "Status", "Bill Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_view_appointment);

        btn_show_all_app.setBackground(new java.awt.Color(0, 0, 204));
        btn_show_all_app.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_show_all_app.setForeground(new java.awt.Color(255, 255, 255));
        btn_show_all_app.setText("Show All Appointments ");
        btn_show_all_app.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_show_all_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_all_appActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Patient Name");

        txt_view_app_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_view_app_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txt_view_app_name.setForeground(new java.awt.Color(0, 0, 0));

        btn_view_app_search_name.setBackground(new java.awt.Color(0, 0, 0));
        btn_view_app_search_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_view_app_search_name.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_app_search_name.setText("Search");
        btn_view_app_search_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_view_app_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_app_search_nameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Doctor");

        cmb_box_doctor_name.setBackground(new java.awt.Color(255, 255, 255));
        cmb_box_doctor_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cmb_box_doctor_name.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(363, 363, 363))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(35, 35, 35)
                                .addComponent(txt_view_app_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_view_app_search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_view_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_view_app_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_box_doctor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36)
                                .addComponent(txt_view_app_date, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_view_app_search_date, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(btn_show_all_app, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_view_app_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_view_app_search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(cmb_box_doctor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_view_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(btn_view_app_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_view_app_search_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_view_app_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_show_all_app, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lbl_new_appointment_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_new_appointment_updateMouseClicked
        setVisible(false);
        NewAppointment.resetInstance();
        NewAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_new_appointment_updateMouseClicked

    private void lbl_logout_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout_viewMouseClicked
        int choice=JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Logout",  JOptionPane.YES_NO_OPTION);
        if(choice==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_lbl_logout_viewMouseClicked

    private void lbl_view_appointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view_appointmentsMouseClicked
         setVisible(false);
         new ViewAppointment().setVisible(true);
    }//GEN-LAST:event_lbl_view_appointmentsMouseClicked

    private void lbl_update_appointments_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update_appointments_viewMouseClicked
       setVisible(false);
       UpdateAppointment.resetInstance();
       UpdateAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_update_appointments_viewMouseClicked

    private void lbl_generate_invoice_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generate_invoice_viewMouseClicked
         setVisible(false);
         new GenerateBill().setVisible(true);
    }//GEN-LAST:event_lbl_generate_invoice_viewMouseClicked
    
    
   //method validate and display appointment details by id
    private void btn_view_app_search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_app_search_idActionPerformed
     try {
        txt_view_app_date.setDate(null);
        txt_view_app_name.setText("");
        DefaultTableModel model = (DefaultTableModel) tbl_view_appointment.getModel();
        model.setRowCount(0);

        // Create a new instance of AppointmentSingleton
       // AppointmentSingleton appointment = new AppointmentSingleton();

        // Get the appointment ID from the user input
        String appointmentId = txt_view_app_id.getText();
         if (appointmentId.equals("")) {
             JOptionPane.showMessageDialog(null, "Please enter appointment ID","Error", JOptionPane.ERROR_MESSAGE);
         } 
         else
         {
             // Call the viewAppointmentById method to get and display appointment details by ID
             AppointmentSingleton.viewAppointmentById(model, appointmentId);
         }

    } 
     catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Appointment not found. Enter valid Appointment ID","Error", JOptionPane.ERROR_MESSAGE);
        }
     catch (Exception e) 
     {
        JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btn_view_app_search_idActionPerformed

    //method to validate filter appointments by date
    private void btn_view_app_search_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_app_search_dateActionPerformed
     try 
       {
        DefaultTableModel model = (DefaultTableModel) tbl_view_appointment.getModel();
        txt_view_app_id.setText("");
        txt_view_app_name.setText("");
        Date selectedDate=txt_view_app_date.getDate();
        String doctorName = cmb_box_doctor_name.getSelectedItem().toString();
        
        
           if (selectedDate.equals("")) 
           {
                 JOptionPane.showMessageDialog(null, "Please select a date","Error", JOptionPane.ERROR_MESSAGE);
           } 
           else 
           {
               SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
               String appointmentDate = dateFormat.format(selectedDate);
                
                // Call the new viewAppointmentsByDate method from the AppointmentSingleton class
                //Appointment appointment = new AppointmentSingleton();
                AppointmentSingleton.viewAppointmentByDate(model,appointmentDate,doctorName);
           }
        } 
     
     catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please select a date","Error", JOptionPane.ERROR_MESSAGE);
        }
     catch (Exception e) 
        {
           JOptionPane.showMessageDialog(null, e,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_view_app_search_dateActionPerformed

    //method to show all appointments
    private void btn_show_all_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_all_appActionPerformed
       try {
            txt_view_app_id.setText("");
            txt_view_app_date.setDate(null);
            txt_view_app_name.setText("");
            DefaultTableModel model = (DefaultTableModel) tbl_view_appointment.getModel();
            model.setRowCount(0);

            // Create a new instance of AppointmentSingleton
            //Appointment appointment = new AppointmentSingleton();

            // Call the viewAllAppointments method to get and display all appointments
            AppointmentSingleton.viewAllAppointments(model);
         } 
       
       catch(NullPointerException e)
       {
           JOptionPane.showMessageDialog(null, "No appointments found.","Error", JOptionPane.ERROR_MESSAGE);
           
       }
       catch (Exception e) 
       {
        JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }

    }//GEN-LAST:event_btn_show_all_appActionPerformed

    //method to find patient by name
    private void btn_view_app_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_app_search_nameActionPerformed
        try {
        DefaultTableModel model = (DefaultTableModel) tbl_view_appointment.getModel();
        txt_view_app_id.setText("");
        txt_view_app_date.setDate(null);

        String patientName = txt_view_app_name.getText().toUpperCase();

        if (patientName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Call the viewAppointmentByName method in AppointmentSingleton class
            boolean appointmentsFound = AppointmentSingleton.viewAppointmentByName(model, patientName);

            if (!appointmentsFound) {
                JOptionPane.showMessageDialog(null, "No appointments found for the given name", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid name", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_view_app_search_nameActionPerformed

   
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
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_show_all_app;
    private javax.swing.JButton btn_view_app_search_date;
    private javax.swing.JButton btn_view_app_search_id;
    private javax.swing.JButton btn_view_app_search_name;
    private javax.swing.JComboBox<String> cmb_box_doctor_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_generate_invoice_view;
    private javax.swing.JLabel lbl_logout_view;
    private javax.swing.JLabel lbl_new_appointment_update;
    private javax.swing.JLabel lbl_update_appointments_view;
    private javax.swing.JLabel lbl_view_appointments;
    private javax.swing.JTable tbl_view_appointment;
    private com.toedter.calendar.JDateChooser txt_view_app_date;
    private javax.swing.JTextField txt_view_app_id;
    private javax.swing.JTextField txt_view_app_name;
    // End of variables declaration//GEN-END:variables
}

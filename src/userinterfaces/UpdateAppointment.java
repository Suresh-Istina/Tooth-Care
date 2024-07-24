/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterfaces;
import com.toedter.calendar.JDateChooser;
import classes.AppointmentSingleton;
import classes.Patient;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Istina
 */
public class UpdateAppointment extends javax.swing.JFrame {
private static UpdateAppointment instance;

private UpdateAppointment() {
        initComponents();
        
        //makes sure user cannot select an older date
        txt_update_app_date.setMinSelectableDate(new Date());
        
        //setting maximum number of characters that can be input for name and address to 50
        txt_update_app_patient_name.addKeyListener(createKeyListener(50));
        txt_update_app_address.addKeyListener(createKeyListener(50));
        
         //setting maximum number of digits that can be input for contact to 10
        txt_update_app_contact.addKeyListener(createKeyListener(10));
        
        
        //Adding a PropertyChangeListener to validate the selected date
        txt_update_app_date.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                validateSelectedDate();
            }
        });

        
    }
//singleton pattern implementation
    public static UpdateAppointment getInstance()
    {
      if (instance == null) {
          instance = new UpdateAppointment();
            }
         return instance;
    }

    public static void resetInstance() {
            instance = null;
      }

     //method to validate selected date
    private void validateSelectedDate() {
        Date selectedDate = txt_update_app_date.getDate();
        if (selectedDate != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Allow only Mondays, Wednesdays, Saturdays, and Sundays
            if (!(dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.WEDNESDAY ||
                    dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY)) {
                JOptionPane.showMessageDialog(null, "Please select a valid date (Mondays, Wednesdays, Saturdays, or Sundays).","Error", JOptionPane.ERROR_MESSAGE);
                txt_update_app_date.setDate(null); // Clear the invalid date
            }
            else{
                if (dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.WEDNESDAY)
                {
                    cm_box_update_app_time.removeAllItems();
                    generateWeekdaySchedule();
                }
                else
                {
                     // Clear the existing items in the cmb_box_time
                    cm_box_update_app_time.removeAllItems();
                    generateWeekendSchedule();
                }
            }
        }
                 
    }
    
     // Method to generate Monday and Wednesday appointment times (6:00 PM to 9:00 PM in 15-minute intervals)
    private void generateWeekdaySchedule() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime startTime = LocalTime.parse("06:00 PM", formatter);
        LocalTime endTime = LocalTime.parse("09:01 PM", formatter);

        List<String> defaultTimes = new ArrayList<>();
        LocalTime currentTime = startTime;

        while (currentTime.isBefore(endTime)) {
            defaultTimes.add(currentTime.format(formatter));
            currentTime = currentTime.plusMinutes(15);
        }

       // Populate cmb_box_time with available times
        for (String time : defaultTimes) {
            cm_box_update_app_time.addItem(time);
        }
    }
    
     // Method to generate Saturday and Sunday appointment times (3:00 PM to 10:00 PM in 15-minute intervals)
    private void generateWeekendSchedule() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime startTime = LocalTime.parse("03:00 PM", formatter);
        LocalTime endTime = LocalTime.parse("10:01 PM", formatter);

        List<String> defaultTimes = new ArrayList<>();
        LocalTime currentTime = startTime;

        while (currentTime.isBefore(endTime)) {
            defaultTimes.add(currentTime.format(formatter));
            currentTime = currentTime.plusMinutes(15);
        }

        // Populate cmb_box_time with available times
        for (String time : defaultTimes) {
            cm_box_update_app_time.addItem(time);
        }
    }
    
  


    
    // Method to generate KeyListener instances with a specific character limit
        private KeyListener createKeyListener(int maxLength) {
         return new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            JTextField source = (JTextField) e.getSource();
            if (source.getText().length() >= maxLength) {
                e.consume(); // Consume the event to prevent further input
                JOptionPane.showMessageDialog(null,"Maximum number of characters for this field is "+maxLength,"Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Not needed for character limiting, but required by KeyListener interface
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Not needed for character limiting, but required by KeyListener interface
        }
    };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        txt_update_app_patient_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_update_app_contact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cm_box_update_app_time = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_update_app_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_update_app_date = new com.toedter.calendar.JDateChooser();
        btn_update_app_search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_update_app_id = new javax.swing.JTextField();
        btn_update_appointment = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmb_age_update_app = new javax.swing.JComboBox<>();
        txt_update_doctor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

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
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Update Appointment");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        txt_update_app_patient_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_app_patient_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_update_app_patient_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_update_app_patient_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_update_app_patient_nameKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contact");

        txt_update_app_contact.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_app_contact.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_update_app_contact.setForeground(new java.awt.Color(0, 0, 0));
        txt_update_app_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_update_app_contactKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Doctor");

        cm_box_update_app_time.setBackground(new java.awt.Color(255, 255, 255));
        cm_box_update_app_time.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cm_box_update_app_time.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        txt_update_app_address.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_app_address.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_update_app_address.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date");

        txt_update_app_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_app_date.setForeground(new java.awt.Color(0, 0, 0));
        txt_update_app_date.setDateFormatString("EEEE, dd/MM/yyyy");

        btn_update_app_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_update_app_search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_update_app_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_update_app_search.setText("Search");
        btn_update_app_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_update_app_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_app_searchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Appointment ID");

        txt_update_app_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_app_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txt_update_app_id.setForeground(new java.awt.Color(0, 0, 0));

        btn_update_appointment.setBackground(new java.awt.Color(5, 77, 149));
        btn_update_appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btn_update_appointment.setForeground(new java.awt.Color(255, 255, 255));
        btn_update_appointment.setText("Update Appointment");
        btn_update_appointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_update_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_appointmentActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Age");

        cmb_age_update_app.setBackground(new java.awt.Color(255, 255, 255));
        cmb_age_update_app.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cmb_age_update_app.setForeground(new java.awt.Color(0, 0, 0));
        cmb_age_update_app.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));

        txt_update_doctor.setEditable(false);
        txt_update_doctor.setBackground(new java.awt.Color(255, 255, 255));
        txt_update_doctor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_update_doctor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Time");

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
                        .addGap(400, 400, 400)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_update_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_update_app_search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_update_app_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_update_doctor)
                                            .addComponent(txt_update_app_contact)
                                            .addComponent(cm_box_update_app_time, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_update_app_address)
                                    .addComponent(txt_update_app_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_age_update_app, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_update_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258)))
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_update_app_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_update_app_search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_update_app_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txt_update_app_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txt_update_app_address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_update_app_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cmb_age_update_app, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cm_box_update_app_time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_update_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addComponent(btn_update_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //method to find appointment details using entered ID
    private void btn_update_app_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_app_searchActionPerformed
        try{
            String appointmentNo=txt_update_app_id.getText();
                if(appointmentNo.equals("")) 
                {
                    JOptionPane.showMessageDialog(null,"Please enter appointment number","Error", JOptionPane.ERROR_MESSAGE);
                } 
        
                else {
                    txt_update_app_id.setEditable(false);
                   
                    AppointmentSingleton foundAppointment= AppointmentSingleton.getInstance().searchAppointmentById(appointmentNo);
                    txt_update_app_patient_name.setText(foundAppointment.getPatient().getPatientName());
                    txt_update_app_contact.setText(foundAppointment.getPatient().getPatientContact());
                    txt_update_app_address.setText(foundAppointment.getPatient().getPatientAddress());
                    cm_box_update_app_time.setSelectedItem(foundAppointment.getAppointmentTime());
                    cmb_age_update_app.setSelectedItem(foundAppointment.getPatient().getAge());
                    String dateString=foundAppointment.getAppointmentDate();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
                    Date date=dateFormat.parse(dateString);
                    txt_update_app_date.setDate(date);
                    txt_update_doctor.setText(foundAppointment.getDoctor());
                    

                }

     }
     
     catch(NullPointerException e)
     {
         JOptionPane.showMessageDialog(null,"Invalid Appointment ID. Enter a valid ID.","Error", JOptionPane.ERROR_MESSAGE);
         txt_update_app_id.setEditable(true);
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_btn_update_app_searchActionPerformed
      //method to check if the selected time slot is booked for the selected date
     public boolean checkBookedAppointmentSlots(String appointmentDate, String appointmentTime, String doctor)
    {
         String appointmentId=txt_update_app_id.getText();
        
         AppointmentSingleton foundAppointment= AppointmentSingleton.getInstance().searchAppointmentById(appointmentId);
        List<AppointmentSingleton> allAppointments =  AppointmentSingleton.getInstance().getAllAppointments();

            for (AppointmentSingleton appointment : allAppointments)
            {
                if (appointment.getAppointmentDate().equals(appointmentDate) && appointment.getAppointmentTime().equals(appointmentTime) && appointment.getDoctor().equals(doctor)) {
                    if (foundAppointment.getAppointmentDate().equals(appointmentDate) && foundAppointment.getAppointmentTime().equals(appointmentTime)) {
                        return false;//allows to select already picked date and time only if it is the respective appointment
                    }
                    else 
                    {
                        return true;
                    }
                   
                } 
                
            }
            
            return false;
    }
     
     
     //method to update appointment after validation by caling updateAppointment() from AppointmentSingleton class
    private void btn_update_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_appointmentActionPerformed
       
    try {
            
         String appointmentNo=txt_update_app_id.getText();
         String patientName = txt_update_app_patient_name.getText().toUpperCase();
         String patientContact = txt_update_app_contact.getText();
         String address = txt_update_app_address.getText().toUpperCase();
         int age=Integer.parseInt(cmb_age_update_app.getSelectedItem().toString());
         //Formatting the date as per requirement
         SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
         Date date=txt_update_app_date.getDate();
         String appointmentDate=dateFormat.format(date).toString();
         String appointmentTime = cm_box_update_app_time.getSelectedItem().toString();
         String doctor=txt_update_doctor.getText();

        if(appointmentNo.equals("")) 
        {
           JOptionPane.showMessageDialog(null,"Please enter appointment number","Error", JOptionPane.ERROR_MESSAGE);
        } 
        else if (patientName.equals("")) {
            JOptionPane.showMessageDialog(null, "Name cannot be blank. Please enter a name.","Error", JOptionPane.ERROR_MESSAGE);
        } else if (patientContact.equals("")) {
            JOptionPane.showMessageDialog(null, "Contact cannot be blank. Please enter a contact number.","Error", JOptionPane.ERROR_MESSAGE);
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address cannot be blank. Please enter an address.","Error", JOptionPane.ERROR_MESSAGE);
        } else if (appointmentDate == null) {
            JOptionPane.showMessageDialog(null, "Appointment date cannot be blank. Please select a date.","Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(Pattern.matches("^\\d{10}$", patientContact))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number.","Error", JOptionPane.ERROR_MESSAGE);
        } else if (checkBookedAppointmentSlots(appointmentDate,appointmentTime,doctor)==true){
            JOptionPane.showMessageDialog(null, "Appointment slot is already booked. Select a new time/day","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {        
        // Call the updateAppointment method from the AppointmentSingleton class
       
        AppointmentSingleton foundAppointment= AppointmentSingleton.getInstance().searchAppointmentById(appointmentNo);
        foundAppointment.updateAppointment(patientName, patientContact, address, appointmentDate, appointmentTime,age);

        setVisible(false);
         new UpdateAppointment().setVisible(true);
        }
    } 
    catch (NullPointerException e)
    {
        JOptionPane.showMessageDialog(null, "Please enter valid appointment ID and click search.","Error", JOptionPane.ERROR_MESSAGE);
    } 
    catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_btn_update_appointmentActionPerformed

    private void txt_update_app_patient_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_update_app_patient_nameKeyPressed
         // only allows letters, space, key controls like delete and backspace, caps lock, and shift for name
        char characters = evt.getKeyChar();
        
        if(Character.isLetter(characters) || Character.isWhitespace(characters) || Character.isISOControl(characters) ||
            (Character.isUpperCase(characters) && !evt.isShiftDown()) || 
            (Character.isUpperCase(characters) && evt.isShiftDown()) ||
            evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK||evt.isShiftDown())
           {
               txt_update_app_patient_name.setEditable(true);
           }
        else{
            txt_update_app_patient_name.setEditable(false);
            JOptionPane.showMessageDialog(null,"Name can only have letters and space.","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_txt_update_app_patient_nameKeyPressed

    private void txt_update_app_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_update_app_contactKeyPressed
       //only allows to enter digits for contact
        char contactCheck = evt.getKeyChar();
        
        if(Character.isDigit(contactCheck)||Character.isISOControl(contactCheck))
            txt_update_app_contact.setEditable(true);
        else{
            txt_update_app_contact.setEditable(false);
            JOptionPane.showMessageDialog(null,"Contact can only have numbers.","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_txt_update_app_contactKeyPressed

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
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update_app_search;
    private javax.swing.JButton btn_update_appointment;
    private javax.swing.JComboBox<String> cm_box_update_app_time;
    private javax.swing.JComboBox<String> cmb_age_update_app;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txt_update_app_address;
    private javax.swing.JTextField txt_update_app_contact;
    private com.toedter.calendar.JDateChooser txt_update_app_date;
    private javax.swing.JTextField txt_update_app_id;
    private javax.swing.JTextField txt_update_app_patient_name;
    private javax.swing.JTextField txt_update_doctor;
    // End of variables declaration//GEN-END:variables
}

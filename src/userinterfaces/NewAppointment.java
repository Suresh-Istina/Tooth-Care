
package userinterfaces;
import classes.AppointmentSingleton;
import classes.Doctor;
import classes.Patient;
import classes.Registration;
import classes.Schedule;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Istina
 */
public class NewAppointment extends javax.swing.JFrame {

    private static NewAppointment instance;
    
    private NewAppointment() {
      
        initComponents();
        
        // Call the addDoctor method to get the list of doctors
        ArrayList<Doctor> doctors = Doctor.addDoctor();

        // Populate the doctor names in the combo box
        for (Doctor doctor : doctors) {
            cmb_box_doctor.addItem(doctor.getDoctorName());
        }
        
       //calling method to display the schedule
        Schedule schedule= new Schedule();
        schedule.viewSchedule(table_schedule);
          
        
        //makes sure user cannot select an older date
        txt_appointment_date.setMinSelectableDate(new Date());
       
        
        //setting maximum number of characters that can be input for name and address to 50
        txt_patient_name.addKeyListener(createKeyListener(50));
        txt_address.addKeyListener(createKeyListener(50));
        
        //setting maximum number of digits that can be input for contact to 10
        txt_contact.addKeyListener(createKeyListener(10));
        
                
        // Adding a PropertyChangeListener to validate the selected date
        txt_appointment_date.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                validateSelectedDate();
            }
        });

        
    }

   
    //singleton pattern implementation
    public static NewAppointment getInstance() {
        if (instance == null) {
            instance = new NewAppointment();
        }
        return instance;
    }
    
    public static void resetInstance() {
        instance = null;
    }
    
    //method to validate selected date
     private void validateSelectedDate() {
        Date selectedDate = txt_appointment_date.getDate();
        if (selectedDate != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Allow only Mondays, Wednesdays, Saturdays, and Sundays
            if (!(dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.WEDNESDAY ||
                    dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY)) {
                JOptionPane.showMessageDialog(null, "Please select a valid date (Mondays, Wednesdays, Saturdays or Sundays).","Error", JOptionPane.ERROR_MESSAGE);
                txt_appointment_date.setDate(null); // Clear the invalid date
            }
            else{
                if (dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.WEDNESDAY)
                {
                    cmb_box_time.removeAllItems();
                    generateWeekdaySchedule();
                }
                else
                {
                     // Clear the existing items in the cmb_box_time
                    cmb_box_time.removeAllItems();
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
            cmb_box_time.addItem(time);
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
            cmb_box_time.addItem(time);
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
        lbl_new_appointment = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        lbl_view_appointments1 = new javax.swing.JLabel();
        lbl_update_appointments1 = new javax.swing.JLabel();
        lbl_generate_invoice1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_patient_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_appointment_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cmb_box_time = new javax.swing.JComboBox<>();
        checkbox_registration = new javax.swing.JCheckBox();
        btn_book_appointment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_schedule = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cmb_age_new_app = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmb_box_doctor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minilogo.png"))); // NOI18N

        lbl_new_appointment.setBackground(new java.awt.Color(255, 255, 255));
        lbl_new_appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_new_appointment.setForeground(new java.awt.Color(0, 0, 0));
        lbl_new_appointment.setText("  New Appointment");
        lbl_new_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_new_appointmentMouseClicked(evt);
            }
        });

        lbl_logout.setBackground(new java.awt.Color(255, 255, 255));
        lbl_logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(0, 0, 0));
        lbl_logout.setText("  Logout");
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });

        lbl_view_appointments1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_view_appointments1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_view_appointments1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_view_appointments1.setText("  View Appointments");
        lbl_view_appointments1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view_appointments1MouseClicked(evt);
            }
        });

        lbl_update_appointments1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_update_appointments1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_update_appointments1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_update_appointments1.setText("  Update Appointment");
        lbl_update_appointments1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_update_appointments1MouseClicked(evt);
            }
        });

        lbl_generate_invoice1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_generate_invoice1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_generate_invoice1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_generate_invoice1.setText("  Generate Invoice");
        lbl_generate_invoice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_generate_invoice1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_new_appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl_view_appointments1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addComponent(lbl_update_appointments1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_generate_invoice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(lbl_new_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_view_appointments1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_update_appointments1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_generate_invoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("New Appointment");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        txt_patient_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_patient_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_patient_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_patient_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_patient_nameKeyPressed(evt);
            }
        });

        txt_address.setBackground(new java.awt.Color(255, 255, 255));
        txt_address.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contact");

        txt_contact.setBackground(new java.awt.Color(255, 255, 255));
        txt_contact.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(0, 0, 0));
        txt_contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_contactMouseClicked(evt);
            }
        });
        txt_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contactKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date");

        txt_appointment_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_appointment_date.setForeground(new java.awt.Color(0, 0, 0));
        txt_appointment_date.setToolTipText("");
        txt_appointment_date.setDateFormatString("EEEE, dd/MM/yyyy");
        txt_appointment_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_appointment_dateKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Time");

        cmb_box_time.setBackground(new java.awt.Color(255, 255, 255));
        cmb_box_time.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cmb_box_time.setForeground(new java.awt.Color(0, 0, 0));

        checkbox_registration.setBackground(new java.awt.Color(204, 255, 255));
        checkbox_registration.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        checkbox_registration.setForeground(new java.awt.Color(0, 0, 0));
        checkbox_registration.setText("  Registration Fee");
        checkbox_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_registrationActionPerformed(evt);
            }
        });

        btn_book_appointment.setBackground(new java.awt.Color(5, 77, 149));
        btn_book_appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btn_book_appointment.setForeground(new java.awt.Color(255, 255, 255));
        btn_book_appointment.setText("Book Appointment");
        btn_book_appointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 77, 149), 0, true));
        btn_book_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book_appointmentActionPerformed(evt);
            }
        });

        table_schedule.setBackground(new java.awt.Color(255, 255, 255));
        table_schedule.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        table_schedule.setForeground(new java.awt.Color(0, 0, 0));
        table_schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Day", "From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_schedule);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Age");

        cmb_age_new_app.setBackground(new java.awt.Color(255, 255, 255));
        cmb_age_new_app.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cmb_age_new_app.setForeground(new java.awt.Color(0, 0, 0));
        cmb_age_new_app.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Doctor");

        cmb_box_doctor.setBackground(new java.awt.Color(255, 255, 255));
        cmb_box_doctor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cmb_box_doctor.setForeground(new java.awt.Color(0, 0, 0));
        cmb_box_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_box_doctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(377, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_box_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_contact)
                                                .addComponent(cmb_box_time, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_address)
                                            .addComponent(txt_appointment_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmb_age_new_app, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkbox_registration))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_book_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(414, 414, 414))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_appointment_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmb_age_new_app, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_box_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmb_box_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_registration))))
                .addGap(67, 67, 67)
                .addComponent(btn_book_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        int choice=JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Logout",  JOptionPane.YES_NO_OPTION);
        if(choice==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void lbl_new_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_new_appointmentMouseClicked
        setVisible(false);
        NewAppointment.resetInstance();
        NewAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_new_appointmentMouseClicked

    private void lbl_view_appointments1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view_appointments1MouseClicked
        setVisible(false);
        new ViewAppointment().setVisible(true);
    }//GEN-LAST:event_lbl_view_appointments1MouseClicked

    private void lbl_update_appointments1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update_appointments1MouseClicked
       setVisible(false);
       UpdateAppointment.resetInstance();
       UpdateAppointment.getInstance().setVisible(true);
    }//GEN-LAST:event_lbl_update_appointments1MouseClicked

    private void lbl_generate_invoice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generate_invoice1MouseClicked
        setVisible(false);
        new GenerateBill().setVisible(true);
    }//GEN-LAST:event_lbl_generate_invoice1MouseClicked

    //method to check if the selected time slot is booked for the selected date
    public boolean checkBookedAppointmentSlots(String appointmentDate, String appointmentTime, String doctor)
    {
        List<AppointmentSingleton> allAppointments =  AppointmentSingleton.getInstance().getAllAppointments();

            for (AppointmentSingleton appointment : allAppointments)
            {
                if (appointment.getAppointmentDate().equals(appointmentDate) && appointment.getAppointmentTime().equals(appointmentTime) && appointment.getDoctor().equals(doctor)) {
                   return true;
                } 
                
            }
            
            return false;
    }
    
    //method to book appointment by calling bookAppointment() from AppointmentSingleton class
    private void btn_book_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book_appointmentActionPerformed
    
        try {
            String patientName = txt_patient_name.getText().toUpperCase();
            String patientContact = txt_contact.getText();
            String address = txt_address.getText().toUpperCase();
            int age =Integer.parseInt(cmb_age_new_app.getSelectedItem().toString());
            String doctor=cmb_box_doctor.getSelectedItem().toString();
            
            // Formatting the date as per requirement
            Date date = txt_appointment_date.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
            String appointmentDate=dateFormat.format(date);
            String appointmentTime = cmb_box_time.getSelectedItem().toString();
             
            if (patientName.equals("")) {
                JOptionPane.showMessageDialog(null, "Name cannot be blank. Please enter a name.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (patientContact.equals("")) {
                JOptionPane.showMessageDialog(null, "Contact cannot be blank. Please enter a contact number.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address cannot be blank. Please enter an address.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (appointmentDate == null) {
                JOptionPane.showMessageDialog(null, "Please select a valid date.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(Pattern.matches("^\\d{10}$", patientContact))) {
                JOptionPane.showMessageDialog(null, "Please enter a valid phone number.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (!checkbox_registration.isSelected()) { 
                JOptionPane.showMessageDialog(null, "Please collect Registration Fee.","Error", JOptionPane.ERROR_MESSAGE);
            } else if (checkBookedAppointmentSlots(appointmentDate,appointmentTime,doctor)==true){
                JOptionPane.showMessageDialog(null, "Appointment slot is already booked. Select a new time/day","Error", JOptionPane.ERROR_MESSAGE);
                //checks availability of selected and date and time  
            }
            else{          
                  // Call the static method from AppointmentSingleton class
                  AppointmentSingleton.getInstance().createNewAppointment(patientName, patientContact, address, appointmentDate, appointmentTime,age,doctor);
                  setVisible(false);
                  new NewAppointment().setVisible(true);
              }

    }//try//try
        catch (NullPointerException e) 
        {
        JOptionPane.showMessageDialog(null, "Please select a date.","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_btn_book_appointmentActionPerformed

    private void txt_patient_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_patient_nameKeyPressed
        // only allows letters, space, key controls like delete and backspace, caps lock, and shift for name

        char characters = evt.getKeyChar();
        
        if (Character.isLetter(characters) || Character.isWhitespace(characters) || Character.isISOControl(characters) ||
            (Character.isUpperCase(characters) && !evt.isShiftDown()) || 
            (Character.isUpperCase(characters) && evt.isShiftDown()) ||
            evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK || evt.isShiftDown())
        {
            txt_patient_name.setEditable(true);
        }
        else{
            txt_patient_name.setEditable(false);
            JOptionPane.showMessageDialog(null,"Name can only have letters and space.","Error", JOptionPane.ERROR_MESSAGE);}
            
    }//GEN-LAST:event_txt_patient_nameKeyPressed

    private void txt_contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contactMouseClicked
        
    }//GEN-LAST:event_txt_contactMouseClicked

    private void txt_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyPressed
        //only allows to enter digits for contact
        char contactCheck = evt.getKeyChar();
        
        if(Character.isDigit(contactCheck)||Character.isISOControl(contactCheck))
            txt_contact.setEditable(true);
        else{
            txt_contact.setEditable(false);
            JOptionPane.showMessageDialog(null,"Contact can only have numbers.","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_txt_contactKeyPressed

    
    private void txt_appointment_dateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_appointment_dateKeyPressed

    }//GEN-LAST:event_txt_appointment_dateKeyPressed

    private void checkbox_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_registrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_registrationActionPerformed

    private void cmb_box_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_box_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_box_doctorActionPerformed

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
            java.util.logging.Logger.getLogger(NewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAppointment().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book_appointment;
    private javax.swing.JCheckBox checkbox_registration;
    private javax.swing.JComboBox<String> cmb_age_new_app;
    private javax.swing.JComboBox<String> cmb_box_doctor;
    private javax.swing.JComboBox<String> cmb_box_time;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_generate_invoice1;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_new_appointment;
    private javax.swing.JLabel lbl_update_appointments1;
    private javax.swing.JLabel lbl_view_appointments1;
    private javax.swing.JTable table_schedule;
    private javax.swing.JTextField txt_address;
    private com.toedter.calendar.JDateChooser txt_appointment_date;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_patient_name;
    // End of variables declaration//GEN-END:variables

    
}

package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Singleton design pattern implementation for managing appointments.
 * This class is responsible for creating, updating and accessing appointments.
 * It also provides methods for searching and viewing appointments.
 * @author Istina
 */
public class AppointmentSingleton {
    private static volatile AppointmentSingleton instance;
    private static int nextId = 1;

    private ArrayList<AppointmentSingleton> appointments;
    private Invoice invoice;
    private Patient patient;
    private String appointmentId;
    private String appointmentDate;
    private String appointmentTime;
    private String appointmentStatus;
    private String doctor;

   
    // Private constructor to enforce singleton pattern.
    private AppointmentSingleton() {
        appointments = new ArrayList<>();
    }
    
     private AppointmentSingleton(Patient patient, String appointmentDate, String appointmentTime,String doctor) {
        this.patient = patient;
        this.appointmentId = "A" + nextId++;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.doctor=doctor;
        this.appointmentStatus = "PENDING";
    }
      

    // Get the instance of the AppointmentSingleton singleton.
         public static AppointmentSingleton getInstance() {
        if (instance == null) {
            synchronized (AppointmentSingleton.class) {
                if (instance == null) {
                    instance = new AppointmentSingleton();
                }
            }
        }
        return instance;
    }

     
      
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

     public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

   
   //create new appointment
    public void createNewAppointment(String patientName, String patientContact, String address,
        String appointmentDate, String appointmentTime, int age, String doctor) {
        
        //creating new patient and adding patient details
        Patient newPatient = new Patient(patientName, address, patientContact, age);
        
        //creating new appointment to add appointment and patient details
        AppointmentSingleton appointment = new AppointmentSingleton(newPatient, appointmentDate, appointmentTime,doctor);
        appointments.add(appointment);
        
        //accepting registration payment and updating registration status to complete for the appointment
        Registration registration = new Registration();
        registration.createNewRegistration(appointment, "Complete", 1000.00);
    }

   

    //Search for an appointment by ID.
    public AppointmentSingleton searchAppointmentById(String appointmentId) {
        for (AppointmentSingleton appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                return appointment;
            }
        }
        return null;
    }

   //Find appointments by date and booked doctor
    public List<AppointmentSingleton> findAppointmentsByDate(String date,String doctorName) {
        List<AppointmentSingleton> result = new ArrayList<>();
        for (AppointmentSingleton appointment : appointments) {
            if (appointment.getAppointmentDate().equals(date) && appointment.getDoctor().equals(doctorName)) {
                result.add(appointment);
            }
        }
        return result;
    }

    //Find appointments by patient name.
    public List<AppointmentSingleton> findAppointmentsByName(String patientName) {
        List<AppointmentSingleton> result = new ArrayList<>();
        for (AppointmentSingleton appointment : appointments) {
            if (appointment.getPatient().getPatientName().equals(patientName)) {
                result.add(appointment);
            }
        }
        return result;
    }
    
   

    // Get all appointments.
    public List<AppointmentSingleton> getAllAppointments() {
        return new ArrayList<>(appointments);
    }

    //Update an existing appointment.    
    public void updateAppointment(String patientName, String patientContact, String address, String appointmentDate,
            String appointmentTime, int age) {
        // Update patient details
        this.patient.setPatientName(patientName);
        this.patient.setPatientAddress(address);
        this.patient.setPatientContact(patientContact);
        this.patient.setAge(age);

        // Update appointment details
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

   //view all apointments on table
    public static void viewAllAppointments(DefaultTableModel model) {
        List<AppointmentSingleton> allAppointments = AppointmentSingleton.getInstance().getAllAppointments();

        for (AppointmentSingleton appointment : allAppointments) {
            if (appointment.getInvoice() != null && appointment.getInvoice().getFinalFee() != null) {
                model.addRow(new Object[] { appointment.getAppointmentId(),appointment.getDoctor(), appointment.getPatient().getPatientName(),
                        appointment.getPatient().getPatientAddress(), appointment.getPatient().getPatientContact(),
                        appointment.getPatient().getAge(), appointment.getAppointmentDate(),
                        appointment.getAppointmentTime(), appointment.getAppointmentStatus(),
                        appointment.getInvoice().getFinalFee() });
            } else {
                model.addRow(new Object[] { appointment.getAppointmentId(),appointment.getDoctor(), appointment.getPatient().getPatientName(),
                        appointment.getPatient().getPatientAddress(), appointment.getPatient().getPatientContact(),
                        appointment.getPatient().getAge(), appointment.getAppointmentDate(),
                        appointment.getAppointmentTime(), appointment.getAppointmentStatus() });
            }
        }
    }

    

    // Method to view appointment details by ID on the table
    public static void viewAppointmentById(DefaultTableModel model, String appointmentId) {
       
        
             AppointmentSingleton foundAppointment =  AppointmentSingleton.getInstance().searchAppointmentById(appointmentId);

           
               // If appointments are found, add them to the table
                if (foundAppointment.getInvoice() != null && foundAppointment.getInvoice().getFinalFee() != null) {
                    model.addRow(new Object[]{
                            foundAppointment.getAppointmentId(),
                            foundAppointment.getDoctor(),
                            foundAppointment.getPatient().getPatientName(),
                            foundAppointment.getPatient().getPatientAddress(),
                            foundAppointment.getPatient().getPatientContact(),
                            foundAppointment.getPatient().getAge(),
                            foundAppointment.getAppointmentDate(),
                            foundAppointment.getAppointmentTime(),
                            foundAppointment.getAppointmentStatus(),
                            foundAppointment.getInvoice().getFinalFee()
                    });
                } else {
                    model.addRow(new Object[]{
                            foundAppointment.getAppointmentId(),
                            foundAppointment.getDoctor(),
                            foundAppointment.getPatient().getPatientName(),
                            foundAppointment.getPatient().getPatientAddress(),
                            foundAppointment.getPatient().getPatientContact(),
                            foundAppointment.getPatient().getAge(),
                            foundAppointment.getAppointmentDate(),
                            foundAppointment.getAppointmentTime(),
                            foundAppointment.getAppointmentStatus()
                    });
                }
            
    }


    // Method to view appointment details by date and doctor to check each doctor's schedule.
     public static void viewAppointmentByDate(DefaultTableModel model, String selectedDate, String doctorName) {
    
        List<AppointmentSingleton> foundAppointments =  AppointmentSingleton.getInstance().findAppointmentsByDate(selectedDate,doctorName);
                    
        // Sort the List by appointment time
        foundAppointments.sort(Comparator.comparing(AppointmentSingleton::getAppointmentTime));
       

         // Clear existing table data
         model.setRowCount(0);

        // If appointments are found, add them to the table
                for (AppointmentSingleton rowData : foundAppointments) {
                    if (rowData.getInvoice() != null && rowData.getInvoice().getFinalFee() != null) {
                        model.addRow(new Object[]{
                                rowData.getAppointmentId(),
                                rowData.getDoctor(),
                                rowData.getPatient().getPatientName(),
                                rowData.getPatient().getPatientAddress(),
                                rowData.getPatient().getPatientContact(),
                                rowData.getPatient().getAge(),
                                rowData.getAppointmentDate(),
                                rowData.getAppointmentTime(),
                                rowData.getAppointmentStatus(),
                                rowData.getInvoice().getFinalFee()
                        });
                    } else {
                        model.addRow(new Object[]{
                                rowData.getAppointmentId(),
                                rowData.getDoctor(),
                                rowData.getPatient().getPatientName(),
                                rowData.getPatient().getPatientAddress(),
                                rowData.getPatient().getPatientContact(),
                                rowData.getPatient().getAge(),
                                rowData.getAppointmentDate(),
                                rowData.getAppointmentTime(),
                                rowData.getAppointmentStatus()
                        });
                    }
                }
                        
        
               
    }

  // Method to view appointment details by patient name on the table
  public static boolean viewAppointmentByName(DefaultTableModel model, String patientName) {

    List<AppointmentSingleton> foundAppointments =  AppointmentSingleton.getInstance().findAppointmentsByName(patientName);

    // Clear existing table data
     model.setRowCount(0);

        // If appointments are found, add them to the table
        if (!foundAppointments.isEmpty()) {
            for (AppointmentSingleton rowData : foundAppointments) {
                if (rowData.getInvoice() != null && rowData.getInvoice().getFinalFee() != null) {
                    model.addRow(new Object[]{
                            rowData.getAppointmentId(),
                            rowData.getDoctor(),
                            rowData.getPatient().getPatientName(),
                            rowData.getPatient().getPatientAddress(),
                            rowData.getPatient().getPatientContact(),
                            rowData.getPatient().getAge(),
                            rowData.getAppointmentDate(),
                            rowData.getAppointmentTime(),
                            rowData.getAppointmentStatus(),
                            rowData.getInvoice().getFinalFee()
                    });
                } else {
                    model.addRow(new Object[]{
                            rowData.getAppointmentId(),
                            rowData.getDoctor(),
                            rowData.getPatient().getPatientName(),
                            rowData.getPatient().getPatientAddress(),
                            rowData.getPatient().getPatientContact(),
                            rowData.getPatient().getAge(),
                            rowData.getAppointmentDate(),
                            rowData.getAppointmentTime(),
                            rowData.getAppointmentStatus()
                    });
                }
            }
            return true; // Appointments found
        } else {
            return false; // No appointments found
        }
}


 

   
}


package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Istina
 */
public class Registration {
    
    private static int nextId = 1;
    private String appointmentNo;
    private String registrationId;
    private String registrationStatus;
    private double registrationFee;
    private static ArrayList<Registration> registrations;

    public Registration() {
        registrations= new ArrayList<>();
    }
    
    
    
    public Registration(AppointmentSingleton appointment,String registrationStatus, double registrationFee) {
        this.appointmentNo=appointment.getAppointmentId();
        this.registrationId = "R" + nextId++;
        this.registrationStatus = registrationStatus;
        this.registrationFee = registrationFee;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
    
    // Create a new registration and save it in the array list
    public void createNewRegistration(AppointmentSingleton appointment, String status, double fee) {
        
        Registration registration = new Registration(appointment, status, fee);
        registrations.add(registration);
       }

}

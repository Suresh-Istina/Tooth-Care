
package classes;

import java.util.ArrayList;

/**
 *
 * @author Istina
 */
public class Doctor {
    private static int nextId = 1;
    private String doctorId;
    private String doctorName;
    private String specialization;
    private String doctorContact;
    private static ArrayList<Doctor> doctors;


    public Doctor(String doctorName, String specialization, String doctorContact) {
        this.doctorId ="D" + nextId++;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorContact = doctorContact;
    }

    public Doctor() {
        doctors= new ArrayList<>();
    }
    
    

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(String doctorContact) {
        this.doctorContact = doctorContact;
    }
    
    
        //adding two doctors' details to the systems
    
    public static ArrayList<Doctor> addDoctor() {
        doctors = new ArrayList<>();

        doctors.add( new Doctor("Mr.A.D.Ranasinghe", "Dental Surgeon", "0772626298"));
        doctors.add(new Doctor("Ms.Jayani Perera", "Dental Surgeon", "0777323796"));
       
        return doctors;
    }
}

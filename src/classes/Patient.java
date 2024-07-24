
package classes;

public class Patient {
    private static int nextId = 1;
    
    private String patientId;
    private String patientName;
    private String patientAddress;
    private String patientContact;
    private int age;
   
    
    public Patient(String patientName, String patientAddress, String patientContact, int age) {
        this.patientId = "P" + nextId++;
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.patientContact = patientContact;
        this.age=age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}

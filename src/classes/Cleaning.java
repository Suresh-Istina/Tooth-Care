
package classes;



// Concrete implementation for Cleaning treatment
public class Cleaning implements Treatment {
    
    private String treatmentId;
    private String treatmentType;
    private double treatmentPrice;

    public Cleaning() {
        this.treatmentId = "T1";
        this.treatmentType = "Cleaning";
        this.treatmentPrice = 6500.00;
    }

    
    @Override
    public String getTreatmentId() {
        return treatmentId;
    }

    @Override
    public String getTreatmentType() {
        return treatmentType;
    }

    @Override
    public double getTreatmentPrice() {
        return treatmentPrice;
    }
    
}

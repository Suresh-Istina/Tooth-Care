
package classes;


// Concrete implementation for whitening treatment
public class Whitening implements Treatment{

    private String treatmentId;
    private String treatmentType;
    private double treatmentPrice;

    public Whitening() {
        this.treatmentId = "T2";
        this.treatmentType = "Whitening";
        this.treatmentPrice = 35000.00;
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

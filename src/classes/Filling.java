
package classes;



// Concrete implementation for filling treatment
public class Filling implements Treatment{
    private String treatmentId;
    private String treatmentType;
    private double treatmentPrice;

    public Filling() {
        this.treatmentId = "T3";
        this.treatmentType = "Filling";
        this.treatmentPrice = 4000.00;
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

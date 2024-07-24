
package classes;



// Concrete implementation for nerve filling treatment
public class NerveFilling implements Treatment{
    private String treatmentId;
    private String treatmentType;
    private double treatmentPrice;

    public NerveFilling() {
        this.treatmentId = "T4";
        this.treatmentType = "NerveFilling";
        this.treatmentPrice = 30000.00;
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

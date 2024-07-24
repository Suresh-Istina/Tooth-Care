/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Istina
 */
// Concrete implementation for root canal therapy treatment
public class RootCanalTherapy implements Treatment{
    private String treatmentId;
    private String treatmentType;
    private double treatmentPrice;

    public RootCanalTherapy() {
        this.treatmentId = "T5";
        this.treatmentType = "RootCanalTherapy";
        this.treatmentPrice = 25000.00;
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

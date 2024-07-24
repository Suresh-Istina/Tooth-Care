
package classes;

import javax.swing.*;


/**
 *
 * @author Istina
 */
public class Invoice {
    private static int nextId = 1;
    private String invoiceId;
    private Double finalFee=00.00;
    private String appointmentNo;

    public Invoice(String appointmentNo,Double finalFee) {
        this.invoiceId = "INV000" + nextId++;
        this.finalFee = finalFee;
    }

    public Invoice() {
    }

    
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Double getFinalFee() {
        return finalFee;
    }

    public void setFinalFee(Double finalFee) {
        this.finalFee = finalFee;
    }

    public String getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(String appointmentNo) {
        this.appointmentNo = appointmentNo;
    }
    
    //method to calculate Final fee based on the treatment
    public double calculateBill(String appointmentNumber,JCheckBox cbCleaning, JCheckBox cbWhitening, JCheckBox cbFilling,
                              JCheckBox cbNerveFilling, JCheckBox cbRootCanalTherapy) {
        String appointmentId = appointmentNumber;

        TreatmentFactory treatmentFactory = new TreatmentFactory();

        
        AppointmentSingleton foundAppointment =  AppointmentSingleton.getInstance().searchAppointmentById(appointmentId);

        finalFee = 00.00;
        
        if (cbCleaning.isSelected()) {
            finalFee = finalFee + (treatmentFactory.getTreatmentPriceById("T1"));
        }

        if (cbWhitening.isSelected()) {
            finalFee = finalFee + (treatmentFactory.getTreatmentPriceById("T2"));
        }

        if (cbFilling.isSelected()) {
            finalFee = finalFee + (treatmentFactory.getTreatmentPriceById("T3"));
        }

        if (cbNerveFilling.isSelected()) {
            finalFee = finalFee + (treatmentFactory.getTreatmentPriceById("T4"));
        }

        if (cbRootCanalTherapy.isSelected()) {
            finalFee = finalFee + (treatmentFactory.getTreatmentPriceById("T5"));
        }

       

        // Creating invoice object
        Invoice invoice = new Invoice(appointmentId, finalFee);

        // Setting the invoice to the relevant appointment and updating appointment status as complete afte receiving payment
        foundAppointment.setAppointmentStatus("COMPLETE");
        foundAppointment.setInvoice(invoice);
         
        return finalFee;
        
    }

 
}

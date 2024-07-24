
package classes;

import java.util.HashMap;
import java.util.*;

/**
 *
 * @author Istina
 */


public class TreatmentFactory {
     
    private HashMap<String, Treatment> treatments;

    public TreatmentFactory() {
        treatments = new HashMap<>();
        treatments.put("T1", new Cleaning());
        treatments.put("T2", new Whitening());
        treatments.put("T3", new Filling());
        treatments.put("T4", new NerveFilling());
        treatments.put("T5", new RootCanalTherapy());
      
    }

    /*method takes treatment ID as a parameter and retrieves the corresponding Treatment object from the 
    treatments hash map.Then calls the getTreatmentPrice method on that Treatment object to obtain
    and return the price of the treatment.
    */
    public double getTreatmentPriceById(String id) {
        return treatments.get(id).getTreatmentPrice();
    }
}

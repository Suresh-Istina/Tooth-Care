
package classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Istina
 */
public class Schedule {
    private static int nextId = 1;
    private String docId;
    private String scheduleId;
    private String availableDay;
    private String fromTime;
    private String toTime;
   
    private ArrayList<Schedule> schedules= new ArrayList<>();
    
    public Schedule() {
        
    }

    
    
    public Schedule(String docId, String availableDay, String fromTime, String toTime) {
        this.scheduleId = "S" + nextId++;
        this.docId=docId;
        this.availableDay = availableDay;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getAvailableDay() {
        return availableDay;
    }

    public void setAvailableDay(String availableDay) {
        this.availableDay = availableDay;
    }

      
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }
    
    public String getFromTime() {
        return fromTime;
    }

    public String getToTime() {
        return toTime;
    }
    
    //creating schedule for both doctors. Only one doctor ID is given here because both doctors have the same schedule
    public void addSchedule()
    {
        schedules.add(new Schedule("D1","Monday","06:00 PM" ,"09:00 PM"));
        schedules.add(new Schedule("D1","Wednesday","06:00 PM","09:00 PM"));
        schedules.add(new Schedule("D1","Saturday","03:00 PM","10:00 PM"));
        schedules.add(new Schedule("D1","Sunday","03:00 PM","10:00 PM"));
       
             
    }
    
    
    
    //implementing view all schedules        
   public void viewSchedule(JTable table) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            addSchedule();
            List<Schedule> allSchedules = new ArrayList<> (schedules); 
            for (Schedule schedule : allSchedules) 
            {
                model.addRow(new Object[]{schedule.getAvailableDay(), schedule.getFromTime(),schedule.getToTime()});
            }

                   
    }

    


    
}

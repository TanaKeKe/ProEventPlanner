/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Event;
import Model.Task;
import Model.Timeline;
import java.util.List;

public class OptionEvent {
    public void setNoneInfor(Event event){
        if(event.getDateEvent().equals("") == true) event.setDateEvent("None");
        if(event.getNameEvent().equals("") == true) event.setNameEvent("None");
        if(event.getPlaceEvent().equals("") == true) event.setPlaceEvent("None");
        if(event.getStatusEvent().equals("...") == true) event.setStatusEvent("Pending");
        if(event.getTimeEvent().equals("") == true) event.setTimeEvent("None");
        
    }
    public void setNoneTimeline(Timeline timeline){
        if(timeline.getContent().equals("") == true) timeline.setContent("None");
        if(timeline.getNote().equals("") == true) timeline.setNote("None");
        if(timeline.getTime().equals("") == true) timeline.setTime("None");
    }
    public void setNoneTask(Task task){
        if(task.getContent().equals("") == true) task.setContent("None");
        if(task.getDeadline().equals("") == true) task.setDeadline("None");
        if(task.getLead().equals("") == true) task.setLead("None");
        if(task.getNote().equals("") == true) task.setNote("None");
        if(task.getOrdinalNumber().equals("") == true) task.setOrdinalNumber("None");
        if(task.getStatus().equals("") == true) task.setStatus("None");
    }
    public String setString(String nameString){
        String tmp = nameString.toLowerCase();
        char firstchar = tmp.charAt(0);
        char endchar = Character.toUpperCase(firstchar);
        String tmp1 = "";
        for(int i=1;i<tmp.length();++i) tmp1 += tmp.charAt(i);
        return String.valueOf(endchar) + tmp1;
    }
    
    public void setEvent(Event event){
        event.setDateEvent(setString(event.getDateEvent()));
        event.setNameEvent(setString(event.getNameEvent()));
        event.setPlaceEvent(setString(event.getPlaceEvent()));
        event.setStatusEvent(setString(event.getStatusEvent()));
        event.setTimeEvent(setString(event.getTimeEvent()));
        
        for(Timeline timeline : event.listTimeLine){
            timeline.setContent(setString(timeline.getContent()));
            timeline.setNote(setString(timeline.getNote()));
        }
        for(Task task : event.listTask){
            task.setContent(setString(task.getContent()));
            task.setLead(setString(task.getLead()));
            task.setNote(setString(task.getNote()));
            
        }
    }
    public void setIdToListEvent(List<Event> nameList){
        int cnt = 0;
        for(Event event : nameList){
            event.setId(String.valueOf(cnt));
            ++cnt;
        }
    }
    
    public int checkDuplicateEvent(Event event,List<Event> nameList){

        for(Event x : nameList){
            if(x.getDateEvent().equals(event.getDateEvent()) == true) {
                if(x.getNameEvent().equals(event.getNameEvent()) == true){
                    if(x.getPlaceEvent().equals(event.getPlaceEvent()) == true){
                        if(x.getStatusEvent().equals(event.getStatusEvent()) == true){
                            if(x.getTimeEvent().equals(event.getTimeEvent()) == true){
                                
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        
        return 0;
    }
}

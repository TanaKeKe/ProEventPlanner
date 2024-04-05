/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Event implements Serializable{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String nameEvent;
    private String timeEvent;
    private String dateEvent;
    private String placeEvent;
    private String statusEvent;
    private int sizeTask = 0;
    private int sizeTimeline = 0;

    public int getSizeTask() {
        return sizeTask;
    }

    public void setSizeTask(int sizeTask) {
        this.sizeTask = sizeTask;
    }

    public int getSizeTimeline() {
        return sizeTimeline;
    }

    public void setSizeTimeline(int sizeTimeline) {
        this.sizeTimeline = sizeTimeline;
    }
    public List<Timeline> listTimeLine = new LinkedList<>();
    public List<Task> listTask = new LinkedList<>();
    public Event(){
        //
    }
    public Event(String nameEvent, String timeEvent, String dateEvent, String placeEvent, String statusEvent) {
        this.nameEvent = nameEvent;
        this.timeEvent = timeEvent;
        this.dateEvent = dateEvent;
        this.placeEvent = placeEvent;
        this.statusEvent = statusEvent;
    }

    
    
    
    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getTimeEvent() {
        return timeEvent;
    }

    public void setTimeEvent(String timeEvent) {
        this.timeEvent = timeEvent;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getPlaceEvent() {
        return placeEvent;
    }

    public void setPlaceEvent(String placeEvent) {
        this.placeEvent = placeEvent;
    }

    public String getStatusEvent() {
        return statusEvent;
    }

    public void setStatusEvent(String statusEvent) {
        this.statusEvent = statusEvent;
    }
    
}

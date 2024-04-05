/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Event;
import Model.Task;
import Model.Timeline;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class DataEvent {
    public void storeListToDataEvent(List<Event> nameList) {
        for(Event event : nameList){
            event.setSizeTimeline(event.listTimeLine.size());
            event.setSizeTask(event.listTask.size());
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Data/dataEvent.txt");
            for(Event event : nameList){
                writer.write(event.getId() + "\n");
                writer.write(event.getNameEvent()+ "\n");
                writer.write(event.getTimeEvent()+ "\n");
                writer.write(event.getDateEvent()+ "\n");
                writer.write(event.getPlaceEvent()+ "\n");
                writer.write(event.getStatusEvent()+ "\n");
                writer.write(String.valueOf(event.getSizeTimeline()) + "\n");
                for(Timeline timeline : event.listTimeLine){
                    
                    
                    writer.write(timeline.getContent() + "\n");
                    writer.write(timeline.getNote()+ "\n");
                    writer.write(timeline.getTime() + "\n");
                }
                writer.write(String.valueOf(event.getSizeTask()) + "\n");
                for(Task task : event.listTask){
                    writer.write(task.getOrdinalNumber()+ "\n");
                    writer.write(task.getContent()+ "\n");
                    
                    writer.write(task.getDeadline()+ "\n");
                    writer.write(task.getNote()+ "\n");
                    writer.write(task.getLead()+ "\n");
                    writer.write(task.getStatus()+ "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("");
        }
        
    }
    
    public void loadDataEventToList(List<Event> nameList) {
        nameList.clear();
        FileReader reader = null;
        try {
            reader = new FileReader("src/Data/dataEvent.txt");
            BufferedReader br = new BufferedReader(reader);
            
            while(br.ready()== true){
                Event event = new Event();
                event.setId(br.readLine());
                event.setNameEvent(br.readLine());
                event.setTimeEvent(br.readLine());
                event.setDateEvent(br.readLine());
                event.setPlaceEvent(br.readLine());
                event.setStatusEvent(br.readLine());
                event.setSizeTimeline(Integer.parseInt(br.readLine()));
                for(int i =0;i<event.getSizeTimeline();++i){
                    Timeline timeline = new Timeline(br.readLine(), br.readLine(), br.readLine());
                    event.listTimeLine.add(timeline);
                }
                event.setSizeTask(Integer.parseInt(br.readLine()));
                for(int i=0;i<event.getSizeTask();++i){
                    event.listTask.add(new Task(br.readLine(), br.readLine(), br.readLine()
                            , br.readLine(), br.readLine(), br.readLine()));
                }
                nameList.add(event);
            }
            reader.close();
        } catch (Exception e) {
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Task {
    private String ordinalNumber;
    private String content;
    private String deadline;
    private String note;
    private String Lead;
    private String status;
    

    
    
    public Task(String ordinalNumber, String content, String deadline, String note, String Lead, String status) {
        this.ordinalNumber = ordinalNumber;
        this.content = content;
        this.deadline = deadline;
        this.note = note;
        this.Lead = Lead;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getOrdinalNumber() {
        return ordinalNumber;
    }

    public void setOrdinalNumber(String ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLead() {
        return Lead;
    }

    public void setLead(String Lead) {
        this.Lead = Lead;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Event;
import Model.Task;
import Model.Timeline;
import View.FrameProEventPlanner;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Main main = new Main();
        main.run();
    }

    public void run() throws IOException, FileNotFoundException, ClassNotFoundException {
        frameProEventPlanner.setVisible(true);
        dataEvent.loadDataEventToList(nameListEvent);
        loadListToTableListEvent();
        
        PanelListEvent();
        PanelAddEvent();
        PanelEditEvent();
        PanelAccess();

    }



    public void PanelAddEvent() {

        // xử lí thêm sự kiện vào list
        frameProEventPlanner.buttonAddEventAction((ActionEvent e) -> {
            Event event = frameProEventPlanner.newEvent();
            optionEvent.setNoneInfor(event); // không điền thì auto là none
            optionEvent.setEvent(event); // chuẩn hóa
            if (optionEvent.checkDuplicateEvent(event, nameListEvent) == 0) {
                nameListEvent.add(event); // thêm event vào list
                optionEvent.setIdToListEvent(nameListEvent); // xét id của từng sự kiện
                frameProEventPlanner.resetAddEvent();
                frameProEventPlanner.showMessageAddEventSuccess(); // 
            } else {
                frameProEventPlanner.showMessageAddEventFail();
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });
        // quay trở lại listEvent
        frameProEventPlanner.buttonAddEventGoBackListEventAction((ActionEvent e) -> {
            frameProEventPlanner.displayButtonAddEventGoBackListEventAction();
            loadListToTableListEvent();
        });

    }

    public void PanelListEvent() {
        // đi tới thêm sự kiện
        frameProEventPlanner.buttonGoAddEventAction(((e) -> {
            frameProEventPlanner.displayButtonGoAddEventAction();
        }));
        // double click 1 dòng trong table để hiện ra panel mới
        frameProEventPlanner.tableListEventMouseAction();
    }

    public void PanelEditEvent() {
        frameProEventPlanner.buttonEditEventGoBackListEventAction((e) -> {
            loadListToTableListEvent();
            frameProEventPlanner.displayButtonEditEventGoBackListEventAction();

        });

        // nút truy cập sự kiện
        frameProEventPlanner.buttonAccessEventAction((e) -> {
            frameProEventPlanner.displayButtonAccessEventAction();
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow))) {
                    loadListTaskToTableTask(event);
                    loadListTimelineToTableTimeline(event);
                }
            }
            frameProEventPlanner.resetTask();
            frameProEventPlanner.resetTimeline();
        });

        // Sửa sự kiện
        frameProEventPlanner.buttonUpdateEventAction((e) -> {
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();

            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow))) {

                    Event tmpEvent = new Event(frameProEventPlanner.getTextFieldNameEventOfEditEvent(),
                            frameProEventPlanner.getTextFieldTimeEventOfEditEvent(),
                            frameProEventPlanner.getTextFieldDateEventOfEditEvent(),
                            frameProEventPlanner.getTextFieldPlaceEventOfEditEvent(),
                            frameProEventPlanner.getComboBoxStatusOfEditEvent());
                    optionEvent.setNoneInfor(tmpEvent);
                    optionEvent.setEvent(tmpEvent);

                    if (optionEvent.checkDuplicateEvent(tmpEvent, nameListEvent) == 0) {
                        event.setNameEvent(frameProEventPlanner.getTextFieldNameEventOfEditEvent());
                        event.setDateEvent(frameProEventPlanner.getTextFieldDateEventOfEditEvent());
                        event.setPlaceEvent(frameProEventPlanner.getTextFieldPlaceEventOfEditEvent());
                        event.setTimeEvent(frameProEventPlanner.getTextFieldTimeEventOfEditEvent());
                        event.setStatusEvent(frameProEventPlanner.getComboBoxStatusOfEditEvent());
                        optionEvent.setNoneInfor(tmpEvent);
                        optionEvent.setEvent(event);
                        frameProEventPlanner.showMessageUpdateEventSuccess();
                    } else {

                        frameProEventPlanner.showMessageUpdateFail();
                    }
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });

        // Xóa sự kiện
        frameProEventPlanner.buttonDeleteEventAction((ActionEvent e) -> {
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event x : nameListEvent) {
                if (x.getId().equals(String.valueOf(currentRow))) {

                    nameListEvent.remove(x);
                }
            }
            loadListToTableListEvent();
            optionEvent.setIdToListEvent(nameListEvent);
            frameProEventPlanner.displayButtonEditEventGoBackListEventAction();
            dataEvent.storeListToDataEvent(nameListEvent);
        });
    }

    public void PanelAccess() {
        frameProEventPlanner.buttonAccessEventGoBackListEventAction(((e) -> {
            frameProEventPlanner.displayButtonAccessEventGoBackListEventAction();
            loadListToTableListEvent();
        }));

        // Panel TimeLine
        frameProEventPlanner.buttonAddOfTimelineAction((e) -> { // thêm timeline mới trong event
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    Timeline currentTimeline = frameProEventPlanner.newTimeline();
                    int checkTimeline = 0;
                    for (Timeline timeline : event.listTimeLine) {
                        if (timeline.getTime().equals(currentTimeline.getTime()) == true) {
                            checkTimeline = 1;
                            frameProEventPlanner.showMessageAddTimelineFail();
                            break;
                        }
                    }
                    if (checkTimeline == 0) {
                        optionEvent.setNoneTimeline(currentTimeline);
                        optionEvent.setEvent(event);
                        event.listTimeLine.add(currentTimeline);
                        
                        loadListTimelineToTableTimeline(event);
                        frameProEventPlanner.resetTimeline();
                    }
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });

        frameProEventPlanner.buttonUpdateOfTimelineAction((e) -> { // sửa timeline
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            editTimeline();
            frameProEventPlanner.showMessageUpdateTimelineSuccess();
            frameProEventPlanner.resetTimeline();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    loadListTimelineToTableTimeline(event);
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });

        frameProEventPlanner.buttonDeleteAllOfTimelineAction((e) -> { // làm mới timeline
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    event.listTimeLine.removeAll(event.listTimeLine);
                    loadListTimelineToTableTimeline(event);
                }
            }
            frameProEventPlanner.resetTimeline();
            dataEvent.storeListToDataEvent(nameListEvent);
        });
        // xóa dòng timeline nếu kích double 2 lần
        frameProEventPlanner.tableTimelineMouseAction(); // xóa dòng timeline nếu kích double 2 lần

        frameProEventPlanner.buttonDeleteThislineOfTimelineAction((e) -> {
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    for (Timeline timeline : event.listTimeLine) {
                        if (timeline.getTime().equals(frameProEventPlanner.getTextFieldTimeOfTimeline())) {
                            event.listTimeLine.remove(timeline);
                        }
                    }
                    loadListTimelineToTableTimeline(event);
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
            frameProEventPlanner.displayButtonNotDeleteThislineOfTimelineAction();
        });

        frameProEventPlanner.buttonNotDeleteThislineOfTimelineAction((e) -> {

            frameProEventPlanner.displayButtonNotDeleteThislineOfTimelineAction();
        });

        // Panel Task
        frameProEventPlanner.buttonAddOfTaskAction((e) -> { // thêm task mới trong event
            for (Event event : nameListEvent) {
                JTable tableListEvent = frameProEventPlanner.getTableListEvent();

                int currentRow = tableListEvent.getSelectedRow();
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    Task newTask = frameProEventPlanner.newTask();
                    int checkTask = 0;
                    for (Task task : event.listTask) {
                        if (task.getContent().equals(newTask.getContent())) {
                            checkTask = 1;
                            frameProEventPlanner.showMessageAddTaskFail();
                            break;
                        }
                    }
                    if (checkTask == 0) {
                        optionEvent.setNoneTask(newTask);
                        event.listTask.add(newTask);
                        optionEvent.setEvent(event);
                        loadListTaskToTableTask(event);
                        frameProEventPlanner.resetTask();
                    }
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });

        frameProEventPlanner.buttonUpdateOfTaskAction((e) -> { // sửa task
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            editTask();
            frameProEventPlanner.showMessageUpdateTaskSuccess();
            frameProEventPlanner.resetTask();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    loadListTaskToTableTask(event);
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
        });

        frameProEventPlanner.buttonDeleteAllOfTaskAction((e) -> { // làm mới task
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    event.listTask.removeAll(event.listTask);
                    loadListTaskToTableTask(event);
                }
            }
            frameProEventPlanner.resetTask();
            dataEvent.storeListToDataEvent(nameListEvent);
        });
        // xóa Task nếu double click
        frameProEventPlanner.tableTaskMouseAction(); // xóa dòng task nếu kích double 2 lần
        frameProEventPlanner.buttonDeleteThisLineOfTaskAction((e) -> {
            JTable tableListEvent = frameProEventPlanner.getTableListEvent();

            int currentRow = tableListEvent.getSelectedRow();
            for (Event event : nameListEvent) {
                if (event.getId().equals(String.valueOf(currentRow)) == true) {
                    for (Task task : event.listTask) {
                        if (task.getContent().equals(frameProEventPlanner.getTextFieldContentOfTask())) {
                            event.listTask.remove(task);
                        }
                    }
                    loadListTaskToTableTask(event);
                }
            }
            dataEvent.storeListToDataEvent(nameListEvent);
            frameProEventPlanner.displayButtonNotDeleteThisLineOFTask();
        });

        frameProEventPlanner.buttonNotDeleteThisLineOfTaskAction((e) -> {

            frameProEventPlanner.displayButtonNotDeleteThisLineOFTask();
        });
    }

    public void editTask() {
        JTable tableTask = frameProEventPlanner.getTableTask();
        JTable tableListEvent = frameProEventPlanner.getTableListEvent();
        int row = tableListEvent.getSelectedRow();
        for (Event event : nameListEvent) {
            if (event.getId().equals(String.valueOf(row)) == true) {
                for (Task task : event.listTask) {
                    if (task.getContent().equals(tableTask.getValueAt(tableTask.getSelectedRow(), 1))) {
                        task.setOrdinalNumber(frameProEventPlanner.getTextFieldOrdinalNumberOfTask());
                        task.setContent(frameProEventPlanner.getTextFieldContentOfTask());
                        task.setDeadline(frameProEventPlanner.getTextFieldDeadlineOfTask());
                        task.setNote(frameProEventPlanner.getTextAreaNoteOfTask());
                        task.setLead(frameProEventPlanner.getTextFieldLeadOfTask());
                        task.setStatus(frameProEventPlanner.getComboBoxStatusOfTask());
                        optionEvent.setNoneTask(task);
                        break;
                    }
                }
                
                optionEvent.setEvent(event);
            }
        }
    }

    public void editTimeline() {
        JTable tableTimeline = frameProEventPlanner.getTableTimeLine();
        JTable tableListEvent = frameProEventPlanner.getTableListEvent();
        int row = tableListEvent.getSelectedRow();
        for (Event event : nameListEvent) {
            if (event.getId().equals(String.valueOf(row)) == true) {
                for (Timeline line : event.listTimeLine) {
                    if (line.getTime().equals(tableTimeline.getValueAt(tableTimeline.getSelectedRow(), 0))) {
                        line.setTime(frameProEventPlanner.getTextFieldTimeOfTimeline());
                        line.setNote(frameProEventPlanner.getTextAreaNoteOfTimeline());
                        line.setContent(frameProEventPlanner.getTextFieldContentOfTimeline());
                        optionEvent.setNoneTimeline(line);
                        break;
                    }
                }
                optionEvent.setEvent(event);
            } else {
                //
            }
        }
    }

    public void loadListTimelineToTableTimeline(Event event) {
        JTable tableTimeline = frameProEventPlanner.getTableTimeLine();
        DefaultTableModel model = (DefaultTableModel) tableTimeline.getModel();
        model.setRowCount(0);
        for (Timeline x : event.listTimeLine) {
            model.addRow(new Object[]{x.getTime(), x.getContent(), x.getNote()});
        }
    }

    public void loadListTaskToTableTask(Event event) {
        JTable tableTask = frameProEventPlanner.getTableTask();
        DefaultTableModel model = (DefaultTableModel) tableTask.getModel();
        model.setRowCount(0);
        for (Task x : event.listTask) {
            model.addRow(new Object[]{x.getOrdinalNumber(), x.getContent(), x.getLead(), x.getDeadline(), x.getNote(), x.getStatus()});
        }
    }

    public void loadListToTableListEvent() {
        JTable tableListEvent = frameProEventPlanner.getTableListEvent();
        DefaultTableModel model = (DefaultTableModel) tableListEvent.getModel();
        model.setRowCount(0);
        for (Event x : nameListEvent) {
            model.addRow(new Object[]{x.getNameEvent(), x.getTimeEvent(), x.getDateEvent(), x.getPlaceEvent(), x.getStatusEvent()});

        }
    }

    List<Event> nameListEvent = new LinkedList<>();
    FrameProEventPlanner frameProEventPlanner = new FrameProEventPlanner();
    OptionEvent optionEvent = new OptionEvent();
    DataEvent dataEvent = new DataEvent();
}

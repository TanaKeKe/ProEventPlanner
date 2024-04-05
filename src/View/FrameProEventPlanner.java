/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Event;
import Model.Task;
import Model.Timeline;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public final class FrameProEventPlanner extends javax.swing.JFrame {
    
    public FrameProEventPlanner() {
        initComponents();
        
        PanelAddEvent.setVisible(false);
        PanelListEvent.setVisible(false);
        PanelEditEvent.setVisible(false);
        PanelAccessEvent.setVisible(false);
        dialogNoticeTimeline.setVisible(false);
        dialogNoticeTask.setVisible(false);
        setDialogNoticeTask();
        setDialogNoticeTimeline();
        PanelStart.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogNoticeTimeline = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        buttonDeleteThislineOfTimeline = new javax.swing.JButton();
        buttonNotDeleteThisLineOfTimeline = new javax.swing.JButton();
        dialogNoticeTask = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        buttonDeleteThisLineOfTask = new javax.swing.JButton();
        buttonNoteDeleteThisLineOfTask = new javax.swing.JButton();
        PanelStart = new javax.swing.JPanel();
        buttonStartProEventPlanner = new javax.swing.JButton();
        PanelListEvent = new javax.swing.JPanel();
        labelListEvent = new javax.swing.JLabel();
        buttonGoAddEvent = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableListEvent = new javax.swing.JTable();
        PanelEditEvent = new javax.swing.JPanel();
        titleLaberBigEventOfEditEvent = new javax.swing.JLabel();
        buttonEditEventGoBackListEvent = new javax.swing.JButton();
        buttonAccessEvent = new javax.swing.JButton();
        buttonDeleteEvent = new javax.swing.JButton();
        buttonUpdateEvent = new javax.swing.JButton();
        textFieldPlaceEventOfEditEvent = new javax.swing.JTextField();
        textFieldNameEventOfEditEvent = new javax.swing.JTextField();
        labelNameEventOfEditEvent = new javax.swing.JLabel();
        labelPlaceEventOfEditEvent = new javax.swing.JLabel();
        textFieldTimeEventOfEditEvent = new javax.swing.JTextField();
        labelTimeEventOfEditEvent = new javax.swing.JLabel();
        textFieldDateEventOfEditEvent = new javax.swing.JTextField();
        labelDateEventOfEditEvent = new javax.swing.JLabel();
        comboBoxStatusOfEditEvent = new javax.swing.JComboBox<>();
        labelStatusOfEditEvent = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelOptionEvent = new javax.swing.JLabel();
        PanelAddEvent = new javax.swing.JPanel();
        titleLaberBigEventOfAddEvent = new javax.swing.JLabel();
        buttonAddEventGoBackListEvent = new javax.swing.JButton();
        panelOfAddEvent = new javax.swing.JPanel();
        textFieldNameEventOfAddEvent = new javax.swing.JTextField();
        labelNameEventOfAddEvent = new javax.swing.JLabel();
        labelTimeEventOfAddEvent = new javax.swing.JLabel();
        labelDateEventOfAddEvent = new javax.swing.JLabel();
        textFieldDateEventOfAddEvent = new javax.swing.JTextField();
        textFieldTimeEventOfAddEvent = new javax.swing.JTextField();
        labelPlaceEventOfAddEvent = new javax.swing.JLabel();
        textFieldPlaceEventOfAddEvent = new javax.swing.JTextField();
        labelStatusOfAddEvent = new javax.swing.JLabel();
        comboBoxStatusOfAddEvent = new javax.swing.JComboBox<>();
        buttonAddEvent = new javax.swing.JButton();
        PanelAccessEvent = new javax.swing.JPanel();
        labelNameEventOfAccessEvent = new javax.swing.JLabel();
        TabbedPaneAccessEvent = new javax.swing.JTabbedPane();
        PanelTask = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();
        labelOrdinalNumberOfTask = new javax.swing.JLabel();
        labelContentOfTask = new javax.swing.JLabel();
        labelLeadOfTask = new javax.swing.JLabel();
        labelDeadlineOfTask = new javax.swing.JLabel();
        labelNoteOfTask = new javax.swing.JLabel();
        textFieldOrdinalNumberOfTask = new javax.swing.JTextField();
        textFieldContentOfTask = new javax.swing.JTextField();
        textFieldLeadOfTask = new javax.swing.JTextField();
        textFieldDeadlineOfTask = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaNoteOfTask = new javax.swing.JTextArea();
        buttonAddOfTask = new javax.swing.JButton();
        buttonUpdateOfTask = new javax.swing.JButton();
        buttonDeleteAllOfTask = new javax.swing.JButton();
        labelStatusOfTask = new javax.swing.JLabel();
        comboBoxStatusOfTask = new javax.swing.JComboBox<>();
        PanelTimeline = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTimeLine = new javax.swing.JTable();
        labelTimeOfTimeLine = new javax.swing.JLabel();
        textFieldTimeOfTimeline = new javax.swing.JTextField();
        labelContentOfTimeline = new javax.swing.JLabel();
        textFieldContentOfTimeline = new javax.swing.JTextField();
        labelNoteOfTimeline = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaNoteOfTimeline = new javax.swing.JTextArea();
        buttonAddOfTimeline = new javax.swing.JButton();
        buttonUpdateOfTimeline = new javax.swing.JButton();
        buttonDeleteAllOfTimeline = new javax.swing.JButton();
        buttonAccessEventGoBackListEvent = new javax.swing.JButton();

        dialogNoticeTimeline.setTitle("Thông báo");
        dialogNoticeTimeline.setModal(true);
        dialogNoticeTimeline.setPreferredSize(new java.awt.Dimension(463, 252));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Anh/chị muốn xóa phần timeline này đúng không ?");

        buttonDeleteThislineOfTimeline.setText("Đúng Vậy!");

        buttonNotDeleteThisLineOfTimeline.setText("Không em!");

        javax.swing.GroupLayout dialogNoticeTimelineLayout = new javax.swing.GroupLayout(dialogNoticeTimeline.getContentPane());
        dialogNoticeTimeline.getContentPane().setLayout(dialogNoticeTimelineLayout);
        dialogNoticeTimelineLayout.setHorizontalGroup(
            dialogNoticeTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNoticeTimelineLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(buttonDeleteThislineOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonNotDeleteThisLineOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(dialogNoticeTimelineLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        dialogNoticeTimelineLayout.setVerticalGroup(
            dialogNoticeTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNoticeTimelineLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(dialogNoticeTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNotDeleteThisLineOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteThislineOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        dialogNoticeTimeline.getAccessibleContext().setAccessibleDescription("");

        dialogNoticeTask.setModal(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Anh/chị muốn xóa đầu công việc này đúng không ?");

        buttonDeleteThisLineOfTask.setText("Đúng vậy!");

        buttonNoteDeleteThisLineOfTask.setText("Hông");

        javax.swing.GroupLayout dialogNoticeTaskLayout = new javax.swing.GroupLayout(dialogNoticeTask.getContentPane());
        dialogNoticeTask.getContentPane().setLayout(dialogNoticeTaskLayout);
        dialogNoticeTaskLayout.setHorizontalGroup(
            dialogNoticeTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogNoticeTaskLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(dialogNoticeTaskLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(buttonDeleteThisLineOfTask)
                .addGap(84, 84, 84)
                .addComponent(buttonNoteDeleteThisLineOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogNoticeTaskLayout.setVerticalGroup(
            dialogNoticeTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNoticeTaskLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(dialogNoticeTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeleteThisLineOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNoteDeleteThisLineOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProEventPlaner");

        PanelStart.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelStart.setPreferredSize(new java.awt.Dimension(900, 500));

        buttonStartProEventPlanner.setText("Bắt Đầu");

        javax.swing.GroupLayout PanelStartLayout = new javax.swing.GroupLayout(PanelStart);
        PanelStart.setLayout(PanelStartLayout);
        PanelStartLayout.setHorizontalGroup(
            PanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStartLayout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(buttonStartProEventPlanner, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        PanelStartLayout.setVerticalGroup(
            PanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStartLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(buttonStartProEventPlanner, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        PanelListEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelListEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        labelListEvent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelListEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListEvent.setText("Danh Sách Sự Kiện");

        buttonGoAddEvent.setText("Thêm Sự Kiện");

        tableListEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableListEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên Sự Kiện", "Thời Gian", "Ngày", "Địa Điểm", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tableListEvent);

        javax.swing.GroupLayout PanelListEventLayout = new javax.swing.GroupLayout(PanelListEvent);
        PanelListEvent.setLayout(PanelListEventLayout);
        PanelListEventLayout.setHorizontalGroup(
            PanelListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListEventLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonGoAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
            .addGroup(PanelListEventLayout.createSequentialGroup()
                .addGroup(PanelListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListEventLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(labelListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelListEventLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelListEventLayout.setVerticalGroup(
            PanelListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListEventLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelListEvent)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGoAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        PanelEditEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelEditEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        titleLaberBigEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfEditEvent.setText("Sự Kiện Lớn");

        buttonEditEventGoBackListEvent.setText("Go Back");

        buttonAccessEvent.setText("Truy Cập Sự Kiện");

        buttonDeleteEvent.setText("Xóa Sự Kiện");

        buttonUpdateEvent.setText("Cập Nhật Sự Kiện");

        labelNameEventOfEditEvent.setText("Tên Sự Kiện");

        labelPlaceEventOfEditEvent.setText("Địa điểm");

        labelTimeEventOfEditEvent.setText("Thời Gian");

        labelDateEventOfEditEvent.setText("Ngày");

        comboBoxStatusOfEditEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfEditEvent.setToolTipText("");

        labelStatusOfEditEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfEditEvent.setText("Status");

        labelOptionEvent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelOptionEvent.setText("Chức Năng Sự Kiện Hiện Tại");

        javax.swing.GroupLayout PanelEditEventLayout = new javax.swing.GroupLayout(PanelEditEvent);
        PanelEditEvent.setLayout(PanelEditEventLayout);
        PanelEditEventLayout.setHorizontalGroup(
            PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditEventLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addComponent(textFieldNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(labelPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                .addGap(450, 450, 450)
                                .addComponent(comboBoxStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAccessEvent)
                        .addGap(75, 75, 75)
                        .addComponent(buttonUpdateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(buttonDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
            .addGroup(PanelEditEventLayout.createSequentialGroup()
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonEditEventGoBackListEvent)
                                .addGap(283, 283, 283)
                                .addComponent(titleLaberBigEventOfEditEvent))
                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(labelNameEventOfEditEvent)
                                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textFieldPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelOptionEvent))
                                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                                .addComponent(textFieldTimeEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textFieldDateEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(95, 95, 95))
                                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(labelTimeEventOfEditEvent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDateEventOfEditEvent)
                                        .addGap(140, 140, 140)))
                                .addComponent(labelStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        PanelEditEventLayout.setVerticalGroup(
            PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditEventLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditEventLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelStatusOfEditEvent)
                                    .addComponent(labelDateEventOfEditEvent)
                                    .addComponent(labelTimeEventOfEditEvent)))
                            .addComponent(buttonEditEventGoBackListEvent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDateEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTimeEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addComponent(titleLaberBigEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPlaceEventOfEditEvent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOptionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonUpdateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonAccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        PanelAddEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelAddEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        titleLaberBigEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfAddEvent.setText("Sự Kiện Lớn");

        buttonAddEventGoBackListEvent.setText("Go Back");

        panelOfAddEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), null, null));

        labelNameEventOfAddEvent.setText("Tên Sự Kiện");

        labelTimeEventOfAddEvent.setText("Thời Gian");

        labelDateEventOfAddEvent.setText("Ngày");

        labelPlaceEventOfAddEvent.setText("Địa điểm");

        labelStatusOfAddEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfAddEvent.setText("Status");

        comboBoxStatusOfAddEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfAddEvent.setToolTipText("");

        buttonAddEvent.setText("Thêm Sự Kiện");

        javax.swing.GroupLayout panelOfAddEventLayout = new javax.swing.GroupLayout(panelOfAddEvent);
        panelOfAddEvent.setLayout(panelOfAddEventLayout);
        panelOfAddEventLayout.setHorizontalGroup(
            panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textFieldDateEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStatusOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(textFieldNameEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelNameEventOfAddEvent)))
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(labelPlaceEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldTimeEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldPlaceEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(210, 234, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                                .addComponent(labelTimeEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(labelDateEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                                .addComponent(labelStatusOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        panelOfAddEventLayout.setVerticalGroup(
            panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelNameEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNameEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateEventOfAddEvent)
                    .addComponent(labelTimeEventOfAddEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDateEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTimeEventOfAddEvent))
                .addGap(5, 5, 5)
                .addComponent(labelStatusOfAddEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxStatusOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlaceEventOfAddEvent))
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textFieldPlaceEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(buttonAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );

        javax.swing.GroupLayout PanelAddEventLayout = new javax.swing.GroupLayout(PanelAddEvent);
        PanelAddEvent.setLayout(PanelAddEventLayout);
        PanelAddEventLayout.setHorizontalGroup(
            PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddEventLayout.createSequentialGroup()
                .addGroup(PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddEventLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAddEventGoBackListEvent)
                        .addGap(267, 267, 267)
                        .addComponent(titleLaberBigEventOfAddEvent))
                    .addGroup(PanelAddEventLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelAddEventLayout.setVerticalGroup(
            PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLaberBigEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddEventGoBackListEvent))
                .addGap(18, 18, 18)
                .addComponent(panelOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        PanelAccessEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelAccessEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        labelNameEventOfAccessEvent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNameEventOfAccessEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNameEventOfAccessEvent.setText("Tên Sự Kiện");

        TabbedPaneAccessEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Số Thứ Tự", "Nội Dung", "Lead", "DeadLine", "Note", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTaskMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableTask);

        labelOrdinalNumberOfTask.setText("Số Thứ Tự");

        labelContentOfTask.setText("Nội Dung");

        labelLeadOfTask.setText("Lead");

        labelDeadlineOfTask.setText("Deadline");

        labelNoteOfTask.setText("Note");

        textAreaNoteOfTask.setColumns(20);
        textAreaNoteOfTask.setRows(5);
        jScrollPane3.setViewportView(textAreaNoteOfTask);

        buttonAddOfTask.setText("Thêm");

        buttonUpdateOfTask.setText("Cập Nhật");

        buttonDeleteAllOfTask.setText("Làm Mới Các Công Việc");

        labelStatusOfTask.setText("Trạng Thái");

        comboBoxStatusOfTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Done" }));

        javax.swing.GroupLayout PanelTaskLayout = new javax.swing.GroupLayout(PanelTask);
        PanelTask.setLayout(PanelTaskLayout);
        PanelTaskLayout.setHorizontalGroup(
            PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaskLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaskLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTaskLayout.createSequentialGroup()
                                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTaskLayout.createSequentialGroup()
                                        .addComponent(labelOrdinalNumberOfTask)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(textFieldOrdinalNumberOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelTaskLayout.createSequentialGroup()
                                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelContentOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(labelNoteOfTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelDeadlineOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelLeadOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(labelStatusOfTask))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldLeadOfTask)
                                            .addComponent(textFieldDeadlineOfTask)
                                            .addComponent(comboBoxStatusOfTask, 0, 165, Short.MAX_VALUE)
                                            .addComponent(textFieldContentOfTask))))
                                .addGap(50, 50, 50))
                            .addGroup(PanelTaskLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelTaskLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTaskLayout.createSequentialGroup()
                                .addComponent(buttonAddOfTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUpdateOfTask))
                            .addComponent(buttonDeleteAllOfTask))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelTaskLayout.setVerticalGroup(
            PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(PanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrdinalNumberOfTask)
                    .addComponent(textFieldOrdinalNumberOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContentOfTask)
                    .addComponent(textFieldContentOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLeadOfTask)
                    .addComponent(textFieldLeadOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeadlineOfTask)
                    .addComponent(textFieldDeadlineOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatusOfTask)
                    .addComponent(comboBoxStatusOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNoteOfTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUpdateOfTask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDeleteAllOfTask)
                .addGap(62, 62, 62))
        );

        TabbedPaneAccessEvent.addTab("Task", PanelTask);

        tableTimeLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Thời Gian", "Nội Dung", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTimeLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTimeLineMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableTimeLine);

        labelTimeOfTimeLine.setText("Thời Gian");

        labelContentOfTimeline.setText("Nội dung");

        labelNoteOfTimeline.setText("Note");

        textAreaNoteOfTimeline.setColumns(20);
        textAreaNoteOfTimeline.setRows(5);
        jScrollPane5.setViewportView(textAreaNoteOfTimeline);

        buttonAddOfTimeline.setText("Thêm");

        buttonUpdateOfTimeline.setText("Cập Nhật");

        buttonDeleteAllOfTimeline.setText("Làm Mới Timeline");

        javax.swing.GroupLayout PanelTimelineLayout = new javax.swing.GroupLayout(PanelTimeline);
        PanelTimeline.setLayout(PanelTimelineLayout);
        PanelTimelineLayout.setHorizontalGroup(
            PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimelineLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTimelineLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelTimelineLayout.createSequentialGroup()
                                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTimeOfTimeLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelContentOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNoteOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTimeOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(textFieldContentOfTimeline))
                                .addGap(42, 42, 42))
                            .addGroup(PanelTimelineLayout.createSequentialGroup()
                                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelTimelineLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(buttonAddOfTimeline)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(buttonUpdateOfTimeline)))
                                .addGap(41, 41, 41))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimelineLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeleteAllOfTimeline)
                        .addGap(84, 84, 84))))
        );
        PanelTimelineLayout.setVerticalGroup(
            PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimelineLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelTimelineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTimeOfTimeLine)
                    .addComponent(textFieldTimeOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContentOfTimeline)
                    .addComponent(textFieldContentOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNoteOfTimeline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddOfTimeline)
                    .addComponent(buttonUpdateOfTimeline))
                .addGap(29, 29, 29)
                .addComponent(buttonDeleteAllOfTimeline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPaneAccessEvent.addTab("Timeline", PanelTimeline);

        buttonAccessEventGoBackListEvent.setText("Go Back");

        javax.swing.GroupLayout PanelAccessEventLayout = new javax.swing.GroupLayout(PanelAccessEvent);
        PanelAccessEvent.setLayout(PanelAccessEventLayout);
        PanelAccessEventLayout.setHorizontalGroup(
            PanelAccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccessEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAccessEventGoBackListEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNameEventOfAccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addComponent(TabbedPaneAccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        PanelAccessEventLayout.setVerticalGroup(
            PanelAccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccessEventLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNameEventOfAccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAccessEventGoBackListEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPaneAccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelListEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelEditEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(PanelAccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelListEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelEditEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(PanelAccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ấn quay lại danh sách sự kiện từ panel thêm sự kiện

    /**
     *
     * @return
     */
    // Panel List Sự Kiện
    public JTable getTableListEvent() {
        return tableListEvent;
    }    
    
    public void tableListEventMouseAction() {
        tableListEvent.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    int currentRow = tableListEvent.getSelectedRow();
                    if (!tableListEvent.getValueAt(currentRow, 0).equals("")) {
                        PanelEditEvent.setVisible(true);
                        PanelListEvent.setVisible(false);
                        
                        textFieldNameEventOfEditEvent.setText((String) tableListEvent.getValueAt(currentRow, 0));
                        textFieldTimeEventOfEditEvent.setText((String) tableListEvent.getValueAt(currentRow, 1));
                        textFieldDateEventOfEditEvent.setText((String) tableListEvent.getValueAt(currentRow, 2));
                        textFieldPlaceEventOfEditEvent.setText((String) tableListEvent.getValueAt(currentRow, 3));
                        comboBoxStatusOfEditEvent.setSelectedItem((String) tableListEvent.getValueAt(currentRow, 4));
                    } else {
                        JOptionPane.showMessageDialog(PanelListEvent, "Không Thể Truy Cập", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    // Panel Edit Sự Kiện
    public void buttonEditEventGoBackListEventAction(ActionListener actionListener) {
        buttonEditEventGoBackListEvent.addActionListener(actionListener);
    }
    
    public void displayButtonEditEventGoBackListEventAction() {
        PanelEditEvent.setVisible(false);
        PanelListEvent.setVisible(true);
        
    }
    
    public void buttonAccessEventAction(ActionListener actionListener) {
        buttonAccessEvent.addActionListener(actionListener);
    }

    public void displayButtonAccessEventAction() {
        PanelEditEvent.setVisible(false);
        PanelAccessEvent.setVisible(true);
        labelNameEventOfAccessEvent.setText(textFieldNameEventOfEditEvent.getText());
    }
    
    public void buttonUpdateEventAction(ActionListener actionListener) {
        buttonUpdateEvent.addActionListener(actionListener);
    }

    public void showMessageUpdateEventSuccess() {
        JOptionPane.showMessageDialog(PanelEditEvent, "Cập Nhật Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getComboBoxStatusOfEditEvent() {
        return (String) comboBoxStatusOfEditEvent.getSelectedItem();
    }
    
    public String getTextFieldNameEventOfEditEvent() {
        return textFieldNameEventOfEditEvent.getText();
    }
    
    public String getTextFieldPlaceEventOfEditEvent() {
        return textFieldPlaceEventOfEditEvent.getText();
    }
    
    public String getTextFieldTimeEventOfEditEvent() {
        return textFieldTimeEventOfEditEvent.getText();
    }

    public String getTextFieldDateEventOfEditEvent() {
        return textFieldDateEventOfEditEvent.getText();
    }
    
    public void buttonDeleteEventAction(ActionListener actionListener) {
        buttonDeleteEvent.addActionListener(actionListener);
    }

    public void showMessageDeleteSuccess() {
        JOptionPane.showMessageDialog(PanelEditEvent, "Xóa Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
    }

    // Panel Thêm sự kiện
    public void buttonAddEventGoBackListEventAction(ActionListener actionListener) {
        buttonAddEventGoBackListEvent.addActionListener(actionListener);
    }

    public void displayButtonAddEventGoBackListEventAction() {
        PanelAddEvent.setVisible(false);
        PanelListEvent.setVisible(true);
    }

    public void buttonAddEventAction(ActionListener actionListener) {
        buttonAddEvent.addActionListener(actionListener);
    }

    public void showMessageAddEventSuccess() {
        JOptionPane.showMessageDialog(PanelAddEvent, "Thêm Sự Kiện Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMessageAddEventFail() {
        JOptionPane.showMessageDialog(PanelAddEvent, "Sự Kiện Bị Trùng!\nHãy Thử lại :>", "Thông Báo", JOptionPane.ERROR_MESSAGE);
    }
    
    public Event newEvent() {
        Event event = new Event(textFieldNameEventOfAddEvent.getText(),
                textFieldTimeEventOfAddEvent.getText(),
                textFieldDateEventOfAddEvent.getText(),
                textFieldPlaceEventOfAddEvent.getText(), (String) comboBoxStatusOfAddEvent.getSelectedItem());
        return event;
        
    }
    
    public void resetAddEvent() {
        textFieldTimeEventOfAddEvent.setText("");
        textFieldNameEventOfAddEvent.setText("");
        textFieldPlaceEventOfAddEvent.setText("");
        textFieldDateEventOfAddEvent.setText("");
        comboBoxStatusOfAddEvent.setSelectedIndex(0);
    }

    //
    // Panel Bắt Đầu
    public void buttonStartProEventPlannerAction(ActionListener actionListener) {
        buttonStartProEventPlanner.addActionListener(actionListener);
    }

    public void displayButtonStartProEventPlannerAction() {
        PanelStart.setVisible(false);
        PanelListEvent.setVisible(true);
        
    }

    // Panel Task + TimeLine
    public void displayButtonNotDeleteThisLineOFTask(){
        dialogNoticeTask.setVisible(false);
    }
    public void buttonAddOfTaskAction(ActionListener actionListener) {
        buttonAddOfTask.addActionListener(actionListener);
    }

    public void showMessageAddTaskFail() {
        JOptionPane.showMessageDialog(PanelAccessEvent, "Đã Có Nội Dung Này", "Thông Báo", JOptionPane.ERROR_MESSAGE);
    }

    public void setDialogNoticeTask(){
        dialogNoticeTask.setSize(500, 300);
         final Toolkit toolkit = Toolkit.getDefaultToolkit();
         final Dimension screenSize = toolkit.getScreenSize();
         final int x = (screenSize.width - dialogNoticeTask.getWidth()) / 2;
         final int y = (screenSize.height - dialogNoticeTask.getHeight()) / 2;
        dialogNoticeTask.setLocation(x, y);
    }
    public void buttonDeleteAllOfTaskAction(ActionListener actionListener){
        buttonDeleteAllOfTask.addActionListener(actionListener);
    }
    public void showMessageUpdateFail(){
        JOptionPane.showMessageDialog(PanelEditEvent, "Trùng sự kiện! Cập nhật thất bại!","Thông báo",JOptionPane.ERROR_MESSAGE);
    }
    public void setDialogNoticeTimeline() {
        
        dialogNoticeTimeline.setSize(500, 300);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dialogNoticeTimeline.getWidth()) / 2;
        final int y = (screenSize.height - dialogNoticeTimeline.getHeight()) / 2;
        
        dialogNoticeTimeline.setLocation(x, y);
        
    }

    public void buttonDeleteThislineOfTimelineAction(ActionListener actionListener) {
        buttonDeleteThislineOfTimeline.addActionListener(actionListener);
    }

    public void buttonNotDeleteThislineOfTimelineAction(ActionListener actionListener) {
        buttonNotDeleteThisLineOfTimeline.addActionListener(actionListener);
    }

    public void displayButtonNotDeleteThislineOfTimelineAction() {
        dialogNoticeTimeline.setVisible(false);
    }

    public void tableTimelineMouseAction() {
        tableTimeLine.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    int currentRow = tableTimeLine.getSelectedRow();
                    if (!tableTimeLine.getValueAt(currentRow, 0).equals("")) {
                        dialogNoticeTimeline.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(PanelAccessEvent, "Không Thể Truy Cập", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public void buttonAccessEventGoBackListEventAction(ActionListener actionListener) {
        buttonAccessEventGoBackListEvent.addActionListener(actionListener);
    }

    public void displayButtonAccessEventGoBackListEventAction() {
        PanelAccessEvent.setVisible(false);
        PanelListEvent.setVisible(true);
    }
    
    public String getLabelNameEventOfAccessEvent() {
        return labelNameEventOfAccessEvent.getText();
    }
    
    public void setLabelNameEventOfAccessEvent(JLabel labelNameEventOfAccessEvent) {
        this.labelNameEventOfAccessEvent = labelNameEventOfAccessEvent;
    }
    
    public JTable getTableTask() {
        return tableTask;
    }
    
    public void setTableTask(JTable tableTask) {
        this.tableTask = tableTask;
    }
    
    public JTable getTableTimeLine() {
        return tableTimeLine;
    }
    
    public void setTableTimeLine(JTable tableTimeLine) {
        this.tableTimeLine = tableTimeLine;
    }

    public Task newTask() {
        
        Task task = new Task(textFieldOrdinalNumberOfTask.getText(), textFieldContentOfTask.getText(),
                 textFieldDeadlineOfTask.getText(), textAreaNoteOfTask.getText(), textFieldLeadOfTask.getText(), (String) comboBoxStatusOfTask.getSelectedItem());
        return task;
    }

    public Timeline newTimeline() {
        Timeline timeline = new Timeline(textFieldContentOfTimeline.getText(), textAreaNoteOfTimeline.getText(), textFieldTimeOfTimeline.getText());
        return timeline;
        
    }
    
    public void buttonAddOfTimelineAction(ActionListener actionListener) {
        buttonAddOfTimeline.addActionListener(actionListener);
    }

    public void resetTimeline() {
        textFieldContentOfTimeline.setText("");
        textFieldTimeOfTimeline.setText("");
        textAreaNoteOfTimeline.setText("");
        
    }

    public void buttonDeleteThisLineOfTaskAction(ActionListener actionListener) {
        buttonDeleteThisLineOfTask.addActionListener(actionListener);
    }

    public void buttonNotDeleteThisLineOfTaskAction(ActionListener actionListener) {
        buttonNoteDeleteThisLineOfTask.addActionListener(actionListener);
    }

    public void tableTaskMouseAction() {
        tableTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    int currentRow = tableTask.getSelectedRow();
                    if (!tableTask.getValueAt(currentRow, 0).equals("")) {
                        
                        dialogNoticeTask.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(PanelAccessEvent, "Không Thể Truy Cập", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public void resetTask() {
        textFieldOrdinalNumberOfTask.setText("");
        textFieldContentOfTask.setText("");
        textFieldLeadOfTask.setText("");
        textFieldDeadlineOfTask.setText("");
        comboBoxStatusOfTask.setSelectedIndex(0);
        textAreaNoteOfTask.setText("");
    }
    
    public void buttonUpdateOfTimelineAction(ActionListener actionListener) {
        buttonUpdateOfTimeline.addActionListener(actionListener);
    }

    public void buttonUpdateOfTaskAction(ActionListener actionListener) {
        buttonUpdateOfTask.addActionListener(actionListener);
    }

    public void showMessageUpdateTaskSuccess() {
        JOptionPane.showMessageDialog(PanelAccessEvent, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getComboBoxStatusOfTask() {
        return (String) comboBoxStatusOfTask.getSelectedItem();
    }
    
    public String getTextAreaNoteOfTask() {
        return textAreaNoteOfTask.getText();
    }
    
    public String getTextAreaNoteOfTimeline() {
        return textAreaNoteOfTimeline.getText();
    }
    
    public String getTextFieldContentOfTask() {
        return textFieldContentOfTask.getText();
    }
    
    public String getTextFieldContentOfTimeline() {
        return textFieldContentOfTimeline.getText();
    }
    
    public String getTextFieldDeadlineOfTask() {
        return textFieldDeadlineOfTask.getText();
    }
    
    public String getTextFieldLeadOfTask() {
        return textFieldLeadOfTask.getText();
    }
    
    public String getTextFieldOrdinalNumberOfTask() {
        return textFieldOrdinalNumberOfTask.getText();
    }
    
    public String getTextFieldTimeOfTimeline() {
        return textFieldTimeOfTimeline.getText();
    }

    public void showMessageUpdateTimelineSuccess() {
        JOptionPane.showMessageDialog(PanelAccessEvent, "Cập nhật Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMessageAddTimelineFail() {
        JOptionPane.showMessageDialog(PanelAccessEvent, "Trùng thời gian!", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }

    public void buttonDeleteAllOfTimelineAction(ActionListener actionListener) {
        buttonDeleteAllOfTimeline.addActionListener(actionListener);
    }
    
    private void tableTimeLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTimeLineMouseClicked
        int row = tableTimeLine.getSelectedRow();
        textFieldContentOfTimeline.setText((String) tableTimeLine.getValueAt(row, 1));
        textFieldTimeOfTimeline.setText((String) tableTimeLine.getValueAt(row, 0));
        textAreaNoteOfTimeline.setText((String) tableTimeLine.getValueAt(row, 2));
    }//GEN-LAST:event_tableTimeLineMouseClicked

    private void tableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTaskMouseClicked
        int row = tableTask.getSelectedRow();
        textFieldOrdinalNumberOfTask.setText((String) tableTask.getValueAt(row, 0));
        textFieldContentOfTask.setText((String)tableTask.getValueAt(row, 1));
        textFieldLeadOfTask.setText((String)tableTask.getValueAt(row, 2));
        textFieldDeadlineOfTask.setText((String)tableTask.getValueAt(row, 3));
        textAreaNoteOfTask.setText((String)tableTask.getValueAt(row, 4));
        comboBoxStatusOfTask.setSelectedItem(tableTask.getValueAt(row, 5));
    }//GEN-LAST:event_tableTaskMouseClicked
    // Panel List Event
    
    public void buttonGoAddEventAction(ActionListener actionListener) {
        buttonGoAddEvent.addActionListener(actionListener);
    }

    public void displayButtonGoAddEventAction() {
        PanelListEvent.setVisible(false);
        PanelAddEvent.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameProEventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProEventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProEventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProEventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProEventPlanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAccessEvent;
    private javax.swing.JPanel PanelAddEvent;
    private javax.swing.JPanel PanelEditEvent;
    private javax.swing.JPanel PanelListEvent;
    private javax.swing.JPanel PanelStart;
    private javax.swing.JPanel PanelTask;
    private javax.swing.JPanel PanelTimeline;
    private javax.swing.JTabbedPane TabbedPaneAccessEvent;
    private javax.swing.JButton buttonAccessEvent;
    private javax.swing.JButton buttonAccessEventGoBackListEvent;
    private javax.swing.JButton buttonAddEvent;
    private javax.swing.JButton buttonAddEventGoBackListEvent;
    private javax.swing.JButton buttonAddOfTask;
    private javax.swing.JButton buttonAddOfTimeline;
    private javax.swing.JButton buttonDeleteAllOfTask;
    private javax.swing.JButton buttonDeleteAllOfTimeline;
    private javax.swing.JButton buttonDeleteEvent;
    private javax.swing.JButton buttonDeleteThisLineOfTask;
    private javax.swing.JButton buttonDeleteThislineOfTimeline;
    private javax.swing.JButton buttonEditEventGoBackListEvent;
    private javax.swing.JButton buttonGoAddEvent;
    private javax.swing.JButton buttonNotDeleteThisLineOfTimeline;
    private javax.swing.JButton buttonNoteDeleteThisLineOfTask;
    private javax.swing.JButton buttonStartProEventPlanner;
    private javax.swing.JButton buttonUpdateEvent;
    private javax.swing.JButton buttonUpdateOfTask;
    private javax.swing.JButton buttonUpdateOfTimeline;
    private javax.swing.JComboBox<String> comboBoxStatusOfAddEvent;
    private javax.swing.JComboBox<String> comboBoxStatusOfEditEvent;
    private javax.swing.JComboBox<String> comboBoxStatusOfTask;
    private javax.swing.JDialog dialogNoticeTask;
    private javax.swing.JDialog dialogNoticeTimeline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelContentOfTask;
    private javax.swing.JLabel labelContentOfTimeline;
    private javax.swing.JLabel labelDateEventOfAddEvent;
    private javax.swing.JLabel labelDateEventOfEditEvent;
    private javax.swing.JLabel labelDeadlineOfTask;
    private javax.swing.JLabel labelLeadOfTask;
    private javax.swing.JLabel labelListEvent;
    private javax.swing.JLabel labelNameEventOfAccessEvent;
    private javax.swing.JLabel labelNameEventOfAddEvent;
    private javax.swing.JLabel labelNameEventOfEditEvent;
    private javax.swing.JLabel labelNoteOfTask;
    private javax.swing.JLabel labelNoteOfTimeline;
    private javax.swing.JLabel labelOptionEvent;
    private javax.swing.JLabel labelOrdinalNumberOfTask;
    private javax.swing.JLabel labelPlaceEventOfAddEvent;
    private javax.swing.JLabel labelPlaceEventOfEditEvent;
    private javax.swing.JLabel labelStatusOfAddEvent;
    private javax.swing.JLabel labelStatusOfEditEvent;
    private javax.swing.JLabel labelStatusOfTask;
    private javax.swing.JLabel labelTimeEventOfAddEvent;
    private javax.swing.JLabel labelTimeEventOfEditEvent;
    private javax.swing.JLabel labelTimeOfTimeLine;
    private javax.swing.JPanel panelOfAddEvent;
    private javax.swing.JTable tableListEvent;
    private javax.swing.JTable tableTask;
    private javax.swing.JTable tableTimeLine;
    private javax.swing.JTextArea textAreaNoteOfTask;
    private javax.swing.JTextArea textAreaNoteOfTimeline;
    private javax.swing.JTextField textFieldContentOfTask;
    private javax.swing.JTextField textFieldContentOfTimeline;
    private javax.swing.JTextField textFieldDateEventOfAddEvent;
    private javax.swing.JTextField textFieldDateEventOfEditEvent;
    private javax.swing.JTextField textFieldDeadlineOfTask;
    private javax.swing.JTextField textFieldLeadOfTask;
    private javax.swing.JTextField textFieldNameEventOfAddEvent;
    private javax.swing.JTextField textFieldNameEventOfEditEvent;
    private javax.swing.JTextField textFieldOrdinalNumberOfTask;
    private javax.swing.JTextField textFieldPlaceEventOfAddEvent;
    private javax.swing.JTextField textFieldPlaceEventOfEditEvent;
    private javax.swing.JTextField textFieldTimeEventOfAddEvent;
    private javax.swing.JTextField textFieldTimeEventOfEditEvent;
    private javax.swing.JTextField textFieldTimeOfTimeline;
    private javax.swing.JLabel titleLaberBigEventOfAddEvent;
    private javax.swing.JLabel titleLaberBigEventOfEditEvent;
    // End of variables declaration//GEN-END:variables

}

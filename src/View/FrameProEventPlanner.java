/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Event;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameProEventPlanner extends javax.swing.JFrame {
    private List<Event> nameListEvent = new LinkedList<>();
    
    public void addEventToList(String nameEvent, String timeEvent, String dateEvent, String placeEvent, String statusEvent) {
        Event event = new Event();
        event.setDateEvent(dateEvent);
        event.setNameEvent(nameEvent);
        event.setPlaceEvent(placeEvent);
        event.setStatusEvent(statusEvent);
        event.setTimeEvent(timeEvent);
        nameListEvent.add(event);
    }
    
    public FrameProEventPlanner() {
        initComponents();
        PanelAddEvent.setVisible(false);
        PanelListEvent.setVisible(false);
        PanelEditEvent.setVisible(false);
        PanelSuccessEvent.setVisible(false);
        PanelStart.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelStart = new javax.swing.JPanel();
        buttonStartProEventPlanner = new javax.swing.JButton();
        PanelEditEvent = new javax.swing.JPanel();
        panelOfEditEvent1 = new javax.swing.JPanel();
        textFieldNameEventOfEditEvent = new javax.swing.JTextField();
        labelNameEventOfEditEvent = new javax.swing.JLabel();
        labelTimeEventOfEditEvent = new javax.swing.JLabel();
        labelDateEventOfEditEvent = new javax.swing.JLabel();
        textFieldDateEventOfEditEvent = new javax.swing.JTextField();
        textFieldTimeEventOfEditEvent = new javax.swing.JTextField();
        labelPlaceEventOfEditEvent = new javax.swing.JLabel();
        textFieldPlaceEventOfEditEvent = new javax.swing.JTextField();
        labelStatusOfEditEvent = new javax.swing.JLabel();
        comboBoxStatusOfEditEvent = new javax.swing.JComboBox<>();
        buttonUpdateEvent = new javax.swing.JButton();
        titleLaberBigEventOfEditEvent = new javax.swing.JLabel();
        buttonEditEventGoBackListEvent = new javax.swing.JButton();
        PanelListEvent = new javax.swing.JPanel();
        ListEvent = new javax.swing.JPanel();
        labelListEvent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListEvent = new javax.swing.JTable();
        OptionEvent = new javax.swing.JPanel();
        buttonGoAddEvent = new javax.swing.JButton();
        buttonGoDeleteEvent = new javax.swing.JButton();
        buttonGoEditEvent = new javax.swing.JButton();
        buttonGoSuccessEvent = new javax.swing.JButton();
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
        PanelSuccessEvent = new javax.swing.JPanel();
        buttonSuccessEventGoBackListEvent = new javax.swing.JButton();
        labelNameEventOfSuccessEvent = new javax.swing.JLabel();
        TabbedPaneSuccessEvent = new javax.swing.JTabbedPane();
        PanelTimeline = new javax.swing.JPanel();
        PanelTask = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProEventPlaner");
        setPreferredSize(new java.awt.Dimension(900, 500));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        PanelStart.setPreferredSize(new java.awt.Dimension(900, 500));

        buttonStartProEventPlanner.setText("Bắt Đầu");
        buttonStartProEventPlanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartProEventPlannerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelStartLayout = new javax.swing.GroupLayout(PanelStart);
        PanelStart.setLayout(PanelStartLayout);
        PanelStartLayout.setHorizontalGroup(
            PanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStartLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(buttonStartProEventPlanner, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        PanelStartLayout.setVerticalGroup(
            PanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStartLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(buttonStartProEventPlanner, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        PanelEditEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        panelOfEditEvent1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), null, null));
        panelOfEditEvent1.setPreferredSize(new java.awt.Dimension(719, 444));

        textFieldNameEventOfEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameEventOfEditEventActionPerformed(evt);
            }
        });

        labelNameEventOfEditEvent.setText("Tên Sự Kiện");

        labelTimeEventOfEditEvent.setText("Thời Gian");

        labelDateEventOfEditEvent.setText("Ngày");

        textFieldDateEventOfEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDateEventOfEditEventActionPerformed(evt);
            }
        });

        textFieldTimeEventOfEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTimeEventOfEditEventActionPerformed(evt);
            }
        });

        labelPlaceEventOfEditEvent.setText("Địa điểm");

        labelStatusOfEditEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfEditEvent.setText("Status");

        comboBoxStatusOfEditEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfEditEvent.setToolTipText("");
        comboBoxStatusOfEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusOfEditEventActionPerformed(evt);
            }
        });

        buttonUpdateEvent.setText("Cập Nhật Sự Kiện");
        buttonUpdateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOfEditEvent1Layout = new javax.swing.GroupLayout(panelOfEditEvent1);
        panelOfEditEvent1.setLayout(panelOfEditEvent1Layout);
        panelOfEditEvent1Layout.setHorizontalGroup(
            panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textFieldDateEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUpdateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(textFieldNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelNameEventOfEditEvent)))
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                        .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(labelPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldTimeEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(210, 213, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                                .addComponent(labelTimeEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(labelDateEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                                .addComponent(labelStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        panelOfEditEvent1Layout.setVerticalGroup(
            panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfEditEvent1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNameEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateEventOfEditEvent)
                    .addComponent(labelTimeEventOfEditEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDateEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTimeEventOfEditEvent))
                .addGap(5, 5, 5)
                .addComponent(labelStatusOfEditEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxStatusOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlaceEventOfEditEvent))
                .addGroup(panelOfEditEvent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textFieldPlaceEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfEditEvent1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(buttonUpdateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );

        titleLaberBigEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfEditEvent.setText("Sự Kiện Lớn");

        buttonEditEventGoBackListEvent.setText("Danh sách Sự Kiện");
        buttonEditEventGoBackListEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditEventGoBackListEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditEventLayout = new javax.swing.GroupLayout(PanelEditEvent);
        PanelEditEvent.setLayout(PanelEditEventLayout);
        PanelEditEventLayout.setHorizontalGroup(
            PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditEventLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addComponent(buttonEditEventGoBackListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(titleLaberBigEventOfEditEvent))
                    .addComponent(panelOfEditEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PanelEditEventLayout.setVerticalGroup(
            PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditEventLayout.createSequentialGroup()
                .addGroup(PanelEditEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditEventLayout.createSequentialGroup()
                        .addComponent(titleLaberBigEventOfEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditEventLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonEditEventGoBackListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOfEditEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        PanelListEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        labelListEvent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelListEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListEvent.setText("Danh Sách Sự Kiện");

        tableListEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableListEvent.setColumnSelectionAllowed(true);
        tableListEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableListEvent.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableListEvent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableListEvent);
        tableListEvent.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout ListEventLayout = new javax.swing.GroupLayout(ListEvent);
        ListEvent.setLayout(ListEventLayout);
        ListEventLayout.setHorizontalGroup(
            ListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
            .addGroup(ListEventLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(labelListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListEventLayout.setVerticalGroup(
            ListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListEventLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        buttonGoAddEvent.setText("Thêm Sự Kiện");
        buttonGoAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoAddEventActionPerformed(evt);
            }
        });

        buttonGoDeleteEvent.setText("Xóa Sự Kiện");
        buttonGoDeleteEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGoDeleteEventMouseClicked(evt);
            }
        });
        buttonGoDeleteEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoDeleteEventActionPerformed(evt);
            }
        });

        buttonGoEditEvent.setText("Sửa Sự Kiện");
        buttonGoEditEvent.setToolTipText("");
        buttonGoEditEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGoEditEventMouseClicked(evt);
            }
        });
        buttonGoEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoEditEventActionPerformed(evt);
            }
        });

        buttonGoSuccessEvent.setText("Truy Cập Sự Kiện");
        buttonGoSuccessEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoSuccessEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionEventLayout = new javax.swing.GroupLayout(OptionEvent);
        OptionEvent.setLayout(OptionEventLayout);
        OptionEventLayout.setHorizontalGroup(
            OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionEventLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGoEditEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGoAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGoDeleteEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGoSuccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OptionEventLayout.setVerticalGroup(
            OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionEventLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGoAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGoDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(OptionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGoEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGoSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
        );

        javax.swing.GroupLayout PanelListEventLayout = new javax.swing.GroupLayout(PanelListEvent);
        PanelListEvent.setLayout(PanelListEventLayout);
        PanelListEventLayout.setHorizontalGroup(
            PanelListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListEventLayout.createSequentialGroup()
                .addComponent(ListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OptionEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListEventLayout.setVerticalGroup(
            PanelListEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListEventLayout.createSequentialGroup()
                .addComponent(ListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelListEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptionEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelAddEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        titleLaberBigEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfAddEvent.setText("Sự Kiện Lớn");

        buttonAddEventGoBackListEvent.setText("Danh Sách Sự Kiện");
        buttonAddEventGoBackListEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddEventGoBackListEventActionPerformed(evt);
            }
        });

        panelOfAddEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), null, null));

        textFieldNameEventOfAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameEventOfAddEventActionPerformed(evt);
            }
        });

        labelNameEventOfAddEvent.setText("Tên Sự Kiện");

        labelTimeEventOfAddEvent.setText("Thời Gian");

        labelDateEventOfAddEvent.setText("Ngày");

        textFieldDateEventOfAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDateEventOfAddEventActionPerformed(evt);
            }
        });

        textFieldTimeEventOfAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTimeEventOfAddEventActionPerformed(evt);
            }
        });

        labelPlaceEventOfAddEvent.setText("Địa điểm");

        labelStatusOfAddEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfAddEvent.setText("Status");

        comboBoxStatusOfAddEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfAddEvent.setToolTipText("");
        comboBoxStatusOfAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusOfAddEventActionPerformed(evt);
            }
        });

        buttonAddEvent.setText("Thêm Sự Kiện");
        buttonAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddEventActionPerformed(evt);
            }
        });

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
                        .addGap(210, 213, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddEventLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddEventLayout.createSequentialGroup()
                        .addComponent(panelOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(PanelAddEventLayout.createSequentialGroup()
                        .addGroup(PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAddEventGoBackListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAddEventLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(titleLaberBigEventOfAddEvent)))
                        .addGap(246, 246, 246))))
        );
        PanelAddEventLayout.setVerticalGroup(
            PanelAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLaberBigEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAddEventGoBackListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        PanelSuccessEvent.setPreferredSize(new java.awt.Dimension(900, 500));

        buttonSuccessEventGoBackListEvent.setText("Danh Sách Sự Kiện");
        buttonSuccessEventGoBackListEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuccessEventGoBackListEventActionPerformed(evt);
            }
        });

        labelNameEventOfSuccessEvent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNameEventOfSuccessEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNameEventOfSuccessEvent.setText("Tên Sự Kiện");

        javax.swing.GroupLayout PanelTimelineLayout = new javax.swing.GroupLayout(PanelTimeline);
        PanelTimeline.setLayout(PanelTimelineLayout);
        PanelTimelineLayout.setHorizontalGroup(
            PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelTimelineLayout.setVerticalGroup(
            PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        TabbedPaneSuccessEvent.addTab("Timeline", PanelTimeline);

        javax.swing.GroupLayout PanelTaskLayout = new javax.swing.GroupLayout(PanelTask);
        PanelTask.setLayout(PanelTaskLayout);
        PanelTaskLayout.setHorizontalGroup(
            PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelTaskLayout.setVerticalGroup(
            PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        TabbedPaneSuccessEvent.addTab("Task", PanelTask);

        javax.swing.GroupLayout PanelSuccessEventLayout = new javax.swing.GroupLayout(PanelSuccessEvent);
        PanelSuccessEvent.setLayout(PanelSuccessEventLayout);
        PanelSuccessEventLayout.setHorizontalGroup(
            PanelSuccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuccessEventLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(labelNameEventOfSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSuccessEventGoBackListEvent)
                .addContainerGap())
            .addComponent(TabbedPaneSuccessEvent)
        );
        PanelSuccessEventLayout.setVerticalGroup(
            PanelSuccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuccessEventLayout.createSequentialGroup()
                .addGroup(PanelSuccessEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNameEventOfSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelSuccessEventLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonSuccessEventGoBackListEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPaneSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(PanelEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelStart, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 167, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelListEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(PanelEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelSuccessEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddEventGoBackListEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEventGoBackListEventActionPerformed
        PanelAddEvent.setVisible(false);
        PanelListEvent.setVisible(true);
        
        // thêm dữ liệu từ list vào jTable
        displayTableListEvent();
    }//GEN-LAST:event_buttonAddEventGoBackListEventActionPerformed

    private void textFieldNameEventOfAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameEventOfAddEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameEventOfAddEventActionPerformed

    private void textFieldDateEventOfAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDateEventOfAddEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDateEventOfAddEventActionPerformed

    private void textFieldTimeEventOfAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTimeEventOfAddEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTimeEventOfAddEventActionPerformed

    private void comboBoxStatusOfAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusOfAddEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatusOfAddEventActionPerformed
    
    private void buttonAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEventActionPerformed
        // thêm vào danh sách trong controller
        
        setNoneInfor();
        addEventToList(textFieldNameEventOfAddEvent.getText(), textFieldTimeEventOfAddEvent.getText(), textFieldDateEventOfAddEvent.getText(),
                textFieldPlaceEventOfAddEvent.getText(), String.valueOf(comboBoxStatusOfAddEvent.getSelectedItem()));
        
        
        resetAddEvent();
        JOptionPane.showMessageDialog(this, "Thêm Sự Kiện Thành Công", "Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonAddEventActionPerformed

    private void buttonGoAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoAddEventActionPerformed
        PanelListEvent.setVisible(false);
        PanelAddEvent.setVisible(true);
    }//GEN-LAST:event_buttonGoAddEventActionPerformed

    private void buttonGoEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoEditEventActionPerformed
        //
    }//GEN-LAST:event_buttonGoEditEventActionPerformed

    private void buttonStartProEventPlannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartProEventPlannerActionPerformed
        PanelStart.setVisible(false);
        PanelListEvent.setVisible(true);
    }//GEN-LAST:event_buttonStartProEventPlannerActionPerformed

    private void buttonGoDeleteEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoDeleteEventActionPerformed
        
        
    }//GEN-LAST:event_buttonGoDeleteEventActionPerformed
    
    private void buttonGoDeleteEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoDeleteEventMouseClicked
        int LineCurrent = -1;
        LineCurrent = tableListEvent.getSelectedRow();
        if(LineCurrent != - 1 && !"".equals(nameListEvent.get(LineCurrent).getNameEvent())){
            
            nameListEvent.remove(LineCurrent);
            displayTableListEvent();
            JOptionPane.showMessageDialog(PanelListEvent, "Xóa Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(PanelListEvent, "Hãy Chọn Sự Kiện Để Thực Hiện", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonGoDeleteEventMouseClicked
    int lineEventOfEdit = -1;
    private void buttonGoEditEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoEditEventMouseClicked
        
        lineEventOfEdit = tableListEvent.getSelectedRow();
        if(lineEventOfEdit != -1 && !"".equals(nameListEvent.get(lineEventOfEdit).getNameEvent())) {
            PanelListEvent.setVisible(false);
            PanelEditEvent.setVisible(true);
            
            Event event = nameListEvent.get(lineEventOfEdit);
            textFieldDateEventOfEditEvent.setText(event.getDateEvent());
            textFieldNameEventOfEditEvent.setText(event.getNameEvent());
            textFieldPlaceEventOfEditEvent.setText(event.getPlaceEvent());
            textFieldTimeEventOfEditEvent.setText(event.getTimeEvent());
            comboBoxStatusOfEditEvent.setSelectedItem(event.getStatusEvent());
        }
        else{
            JOptionPane.showMessageDialog(PanelListEvent, "Hãy Chọn Sự Kiện Để Thực Hiện","Thông Báo",JOptionPane.ERROR_MESSAGE);
         
        }
    }//GEN-LAST:event_buttonGoEditEventMouseClicked

    private void textFieldNameEventOfEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameEventOfEditEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameEventOfEditEventActionPerformed

    private void textFieldDateEventOfEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDateEventOfEditEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDateEventOfEditEventActionPerformed

    private void textFieldTimeEventOfEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTimeEventOfEditEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTimeEventOfEditEventActionPerformed

    private void comboBoxStatusOfEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusOfEditEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatusOfEditEventActionPerformed

    private void buttonUpdateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateEventActionPerformed
        Event event = nameListEvent.get(lineEventOfEdit);
        event.setNameEvent(textFieldNameEventOfEditEvent.getText());
        event.setDateEvent(textFieldDateEventOfEditEvent.getText());
        event.setPlaceEvent(textFieldPlaceEventOfEditEvent.getText());
        event.setTimeEvent(textFieldTimeEventOfEditEvent.getText());
        event.setStatusEvent((String)comboBoxStatusOfEditEvent.getSelectedItem());
        JOptionPane.showMessageDialog(PanelEditEvent, "Cập Nhật Thành Công","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonUpdateEventActionPerformed

    private void buttonEditEventGoBackListEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditEventGoBackListEventActionPerformed
        PanelEditEvent.setVisible(false);
        PanelListEvent.setVisible(true);
        displayTableListEvent();
    }//GEN-LAST:event_buttonEditEventGoBackListEventActionPerformed

    private void buttonGoSuccessEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoSuccessEventActionPerformed
        PanelListEvent.setVisible(false);
        PanelSuccessEvent.setVisible(true);
    }//GEN-LAST:event_buttonGoSuccessEventActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void buttonSuccessEventGoBackListEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuccessEventGoBackListEventActionPerformed
        PanelSuccessEvent.setVisible(false);
        PanelListEvent.setVisible(true);
    }//GEN-LAST:event_buttonSuccessEventGoBackListEventActionPerformed

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
    public void resetAddEvent(){
        textFieldTimeEventOfAddEvent.setText("");
        textFieldNameEventOfAddEvent.setText("");
        textFieldPlaceEventOfAddEvent.setText("");
        textFieldDateEventOfAddEvent.setText("");
        comboBoxStatusOfAddEvent.setSelectedIndex(0);
    }
    public void setNoneInfor(){
        if("".equals(textFieldNameEventOfAddEvent.getText())) textFieldNameEventOfAddEvent.setText("None");
        if("".equals(textFieldTimeEventOfAddEvent.getText())) textFieldTimeEventOfAddEvent.setText("None");
        if("".equals(textFieldDateEventOfAddEvent.getText())) textFieldDateEventOfAddEvent.setText("None");
        if("".equals(textFieldPlaceEventOfAddEvent.getText())) textFieldPlaceEventOfAddEvent.setText("None");
        if("".equals(String.valueOf(comboBoxStatusOfAddEvent.getSelectedItem()))) comboBoxStatusOfAddEvent.setSelectedIndex(1);
    }
    
    public void displayTableListEvent(){
        DefaultTableModel model = (DefaultTableModel) tableListEvent.getModel();
        model.setRowCount(0);
        for(Event x : nameListEvent){
            model.addRow(new Object[] {x.getNameEvent(),x.getTimeEvent(),x.getDateEvent(),x.getPlaceEvent(),x.getStatusEvent()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListEvent;
    private javax.swing.JPanel OptionEvent;
    private javax.swing.JPanel PanelAddEvent;
    private javax.swing.JPanel PanelEditEvent;
    private javax.swing.JPanel PanelListEvent;
    private javax.swing.JPanel PanelStart;
    private javax.swing.JPanel PanelSuccessEvent;
    private javax.swing.JPanel PanelTask;
    private javax.swing.JPanel PanelTimeline;
    private javax.swing.JTabbedPane TabbedPaneSuccessEvent;
    private javax.swing.JButton buttonAddEvent;
    private javax.swing.JButton buttonAddEventGoBackListEvent;
    private javax.swing.JButton buttonEditEventGoBackListEvent;
    private javax.swing.JButton buttonGoAddEvent;
    private javax.swing.JButton buttonGoDeleteEvent;
    private javax.swing.JButton buttonGoEditEvent;
    private javax.swing.JButton buttonGoSuccessEvent;
    private javax.swing.JButton buttonStartProEventPlanner;
    private javax.swing.JButton buttonSuccessEventGoBackListEvent;
    private javax.swing.JButton buttonUpdateEvent;
    private javax.swing.JComboBox<String> comboBoxStatusOfAddEvent;
    private javax.swing.JComboBox<String> comboBoxStatusOfEditEvent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDateEventOfAddEvent;
    private javax.swing.JLabel labelDateEventOfEditEvent;
    private javax.swing.JLabel labelListEvent;
    private javax.swing.JLabel labelNameEventOfAddEvent;
    private javax.swing.JLabel labelNameEventOfEditEvent;
    private javax.swing.JLabel labelNameEventOfSuccessEvent;
    private javax.swing.JLabel labelPlaceEventOfAddEvent;
    private javax.swing.JLabel labelPlaceEventOfEditEvent;
    private javax.swing.JLabel labelStatusOfAddEvent;
    private javax.swing.JLabel labelStatusOfEditEvent;
    private javax.swing.JLabel labelTimeEventOfAddEvent;
    private javax.swing.JLabel labelTimeEventOfEditEvent;
    private javax.swing.JPanel panelOfAddEvent;
    private javax.swing.JPanel panelOfEditEvent1;
    private javax.swing.JTable tableListEvent;
    private javax.swing.JTextField textFieldDateEventOfAddEvent;
    private javax.swing.JTextField textFieldDateEventOfEditEvent;
    private javax.swing.JTextField textFieldNameEventOfAddEvent;
    private javax.swing.JTextField textFieldNameEventOfEditEvent;
    private javax.swing.JTextField textFieldPlaceEventOfAddEvent;
    private javax.swing.JTextField textFieldPlaceEventOfEditEvent;
    private javax.swing.JTextField textFieldTimeEventOfAddEvent;
    private javax.swing.JTextField textFieldTimeEventOfEditEvent;
    private javax.swing.JLabel titleLaberBigEventOfAddEvent;
    private javax.swing.JLabel titleLaberBigEventOfEditEvent;
    // End of variables declaration//GEN-END:variables

   
}

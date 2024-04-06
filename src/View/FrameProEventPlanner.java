/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Event;
import Model.Task;
import Model.Timeline;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public final class FrameProEventPlanner extends javax.swing.JFrame {
    
    public FrameProEventPlanner() {
        initComponents();
        // xét icon cho frame
        URL urlIconFrame = FrameProEventPlanner.class.getResource("iconFrame.png");
        Image image = Toolkit.getDefaultToolkit().createImage(urlIconFrame);
        this.setIconImage(image);
        
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
        jLabel8 = new javax.swing.JLabel();
        dialogNoticeTask = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        buttonDeleteThisLineOfTask = new javax.swing.JButton();
        buttonNoteDeleteThisLineOfTask = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PanelStart = new javax.swing.JPanel();
        labelStart = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelListEvent = new javax.swing.JPanel();
        labelListEvent = new javax.swing.JLabel();
        buttonGoAddEvent = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableListEvent = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();

        dialogNoticeTimeline.setTitle("Thông báo");
        dialogNoticeTimeline.setPreferredSize(new java.awt.Dimension(400, 200));
        dialogNoticeTimeline.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bạn muốn xóa timeline này ?");
        dialogNoticeTimeline.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 70));

        buttonDeleteThislineOfTimeline.setText("Đúng Vậy!");
        dialogNoticeTimeline.getContentPane().add(buttonDeleteThislineOfTimeline, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 40));

        buttonNotDeleteThisLineOfTimeline.setText("Hông");
        dialogNoticeTimeline.getContentPane().add(buttonNotDeleteThisLineOfTimeline, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/dialog.jpg"))); // NOI18N
        dialogNoticeTimeline.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dialogNoticeTimeline.getAccessibleContext().setAccessibleDescription("");

        dialogNoticeTask.setMinimumSize(new java.awt.Dimension(461, 260));
        dialogNoticeTask.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Bạn muốn xóa công việc này ?");
        dialogNoticeTask.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 46));

        buttonDeleteThisLineOfTask.setText("Đúng vậy!");
        dialogNoticeTask.getContentPane().add(buttonDeleteThisLineOfTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, 30));

        buttonNoteDeleteThisLineOfTask.setText("Hông");
        dialogNoticeTask.getContentPane().add(buttonNoteDeleteThisLineOfTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 100, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/dialog.jpg"))); // NOI18N
        jLabel9.setDisabledIcon(null);
        dialogNoticeTask.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProEventPlaner");
        setResizable(false);

        PanelStart.setBackground(new java.awt.Color(153, 204, 255));
        PanelStart.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        PanelStart.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelStart.setPreferredSize(new java.awt.Dimension(900, 500));
        PanelStart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelStart.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        labelStart.setForeground(new java.awt.Color(102, 0, 102));
        labelStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStart.setText("Bắt Đầu");
        labelStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelStartMouseClicked(evt);
            }
        });
        PanelStart.add(labelStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 320, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Start.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        PanelStart.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelListEvent.setBackground(new java.awt.Color(153, 204, 255));
        PanelListEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        PanelListEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelListEvent.setPreferredSize(new java.awt.Dimension(900, 500));
        PanelListEvent.setVerifyInputWhenFocusTarget(false);
        PanelListEvent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelListEvent.setBackground(new java.awt.Color(255, 255, 255));
        labelListEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        labelListEvent.setForeground(new java.awt.Color(204, 255, 153));
        labelListEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListEvent.setText("Danh Sách Sự Kiện");
        PanelListEvent.add(labelListEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 904, 61));

        buttonGoAddEvent.setBackground(new java.awt.Color(153, 204, 255));
        buttonGoAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        buttonGoAddEvent.setForeground(new java.awt.Color(0, 0, 0));
        buttonGoAddEvent.setText("Thêm Sự Kiện");
        PanelListEvent.add(buttonGoAddEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 202, 52));

        tableListEvent.setBackground(new java.awt.Color(204, 204, 255));
        tableListEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableListEvent.setFont(new java.awt.Font("JetBrains Mono ExtraLight", 0, 12)); // NOI18N
        tableListEvent.setForeground(new java.awt.Color(0, 0, 0));
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

        PanelListEvent.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 904, 329));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Start.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        PanelListEvent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelEditEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelEditEvent.setPreferredSize(new java.awt.Dimension(900, 500));
        PanelEditEvent.setVerifyInputWhenFocusTarget(false);
        PanelEditEvent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLaberBigEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfEditEvent.setForeground(new java.awt.Color(204, 255, 153));
        titleLaberBigEventOfEditEvent.setText("Sự Kiện Lớn");
        PanelEditEvent.add(titleLaberBigEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 160, 40));

        buttonEditEventGoBackListEvent.setText("Go Back");
        PanelEditEvent.add(buttonEditEventGoBackListEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonAccessEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        buttonAccessEvent.setText("Truy Cập Sự Kiện");
        PanelEditEvent.add(buttonAccessEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 180, 60));

        buttonDeleteEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        buttonDeleteEvent.setText("Xóa Sự Kiện");
        PanelEditEvent.add(buttonDeleteEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, 60));

        buttonUpdateEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        buttonUpdateEvent.setText("Cập Nhật Sự Kiện");
        PanelEditEvent.add(buttonUpdateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 180, 60));

        textFieldPlaceEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        PanelEditEvent.add(textFieldPlaceEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 390, 40));

        textFieldNameEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        PanelEditEvent.add(textFieldNameEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 30));

        labelNameEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelNameEventOfEditEvent.setForeground(new java.awt.Color(204, 255, 153));
        labelNameEventOfEditEvent.setText("Tên Sự Kiện");
        PanelEditEvent.add(labelNameEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, 30));

        labelPlaceEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelPlaceEventOfEditEvent.setForeground(new java.awt.Color(0, 0, 0));
        labelPlaceEventOfEditEvent.setText("Địa điểm");
        PanelEditEvent.add(labelPlaceEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 80, 40));

        textFieldTimeEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        PanelEditEvent.add(textFieldTimeEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 30));

        labelTimeEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelTimeEventOfEditEvent.setForeground(new java.awt.Color(0, 0, 0));
        labelTimeEventOfEditEvent.setText("Thời Gian");
        PanelEditEvent.add(labelTimeEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 80, 40));

        textFieldDateEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        PanelEditEvent.add(textFieldDateEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 130, 30));

        labelDateEventOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelDateEventOfEditEvent.setForeground(new java.awt.Color(0, 0, 0));
        labelDateEventOfEditEvent.setText("Ngày");
        PanelEditEvent.add(labelDateEventOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 40, 40));

        comboBoxStatusOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        comboBoxStatusOfEditEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfEditEvent.setToolTipText("");
        PanelEditEvent.add(comboBoxStatusOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 197, 130, -1));

        labelStatusOfEditEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelStatusOfEditEvent.setForeground(new java.awt.Color(204, 255, 153));
        labelStatusOfEditEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfEditEvent.setText("Status");
        PanelEditEvent.add(labelStatusOfEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 80, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Start.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        PanelEditEvent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelAddEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelAddEvent.setPreferredSize(new java.awt.Dimension(900, 500));
        PanelAddEvent.setVerifyInputWhenFocusTarget(false);
        PanelAddEvent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLaberBigEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLaberBigEventOfAddEvent.setForeground(new java.awt.Color(204, 255, 153));
        titleLaberBigEventOfAddEvent.setText("Sự Kiện Lớn");
        PanelAddEvent.add(titleLaberBigEventOfAddEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 6, -1, 81));

        buttonAddEventGoBackListEvent.setText("Go Back");
        PanelAddEvent.add(buttonAddEventGoBackListEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panelOfAddEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), null, null));

        textFieldNameEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        labelNameEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelNameEventOfAddEvent.setText("Tên Sự Kiện");

        labelTimeEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelTimeEventOfAddEvent.setText("Thời Gian");

        labelDateEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelDateEventOfAddEvent.setText("Ngày");

        textFieldDateEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        textFieldTimeEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        labelPlaceEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelPlaceEventOfAddEvent.setText("Địa điểm");

        textFieldPlaceEventOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        labelStatusOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        labelStatusOfAddEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusOfAddEvent.setText("Status");

        comboBoxStatusOfAddEvent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        comboBoxStatusOfAddEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pending", "Done", "Reject" }));
        comboBoxStatusOfAddEvent.setToolTipText("");

        buttonAddEvent.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        buttonAddEvent.setText("Thêm Sự Kiện");

        javax.swing.GroupLayout panelOfAddEventLayout = new javax.swing.GroupLayout(panelOfAddEvent);
        panelOfAddEvent.setLayout(panelOfAddEventLayout);
        panelOfAddEventLayout.setHorizontalGroup(
            panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPlaceEventOfAddEvent)
                .addGap(222, 222, 222)
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxStatusOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddEvent))
                .addGap(23, 23, 23))
            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(textFieldNameEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(labelNameEventOfAddEvent)))
                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                                .addComponent(labelStatusOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOfAddEventLayout.createSequentialGroup()
                                .addComponent(textFieldDateEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237))))
                    .addGroup(panelOfAddEventLayout.createSequentialGroup()
                        .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(labelTimeEventOfAddEvent)
                                .addGap(195, 195, 195)
                                .addComponent(labelDateEventOfAddEvent))
                            .addGroup(panelOfAddEventLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(panelOfAddEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPlaceEventOfAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                    .addComponent(textFieldTimeEventOfAddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(237, 237, 237))))
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

        PanelAddEvent.add(panelOfAddEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, -1, 292));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Start.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        PanelAddEvent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        PanelAccessEvent.setBackground(new java.awt.Color(153, 204, 255));
        PanelAccessEvent.setMinimumSize(new java.awt.Dimension(900, 500));
        PanelAccessEvent.setPreferredSize(new java.awt.Dimension(900, 500));
        PanelAccessEvent.setVerifyInputWhenFocusTarget(false);
        PanelAccessEvent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNameEventOfAccessEvent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNameEventOfAccessEvent.setForeground(new java.awt.Color(153, 255, 102));
        labelNameEventOfAccessEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNameEventOfAccessEvent.setText("Tên Sự Kiện");
        PanelAccessEvent.add(labelNameEventOfAccessEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 6, 460, 43));

        TabbedPaneAccessEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabbedPaneAccessEvent.setAutoscrolls(true);

        tableTask.setBackground(new java.awt.Color(255, 255, 255));
        tableTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
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
        tableTask.setToolTipText("");
        tableTask.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableTask.setFillsViewportHeight(true);
        tableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTaskMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableTask);

        labelOrdinalNumberOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelOrdinalNumberOfTask.setText("Số Thứ Tự");

        labelContentOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelContentOfTask.setText("Nội Dung");

        labelLeadOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelLeadOfTask.setText("Lead");

        labelDeadlineOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelDeadlineOfTask.setText("Deadline");

        labelNoteOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelNoteOfTask.setText("Note");

        textFieldOrdinalNumberOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        textFieldContentOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        textFieldLeadOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        textFieldDeadlineOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        textAreaNoteOfTask.setColumns(20);
        textAreaNoteOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        textAreaNoteOfTask.setLineWrap(true);
        textAreaNoteOfTask.setRows(5);
        jScrollPane3.setViewportView(textAreaNoteOfTask);

        buttonAddOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonAddOfTask.setText("Thêm");

        buttonUpdateOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonUpdateOfTask.setText("Cập Nhật");

        buttonDeleteAllOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonDeleteAllOfTask.setText("Làm Mới Các Công Việc");

        labelStatusOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelStatusOfTask.setText("Trạng Thái");

        comboBoxStatusOfTask.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        comboBoxStatusOfTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Done" }));

        javax.swing.GroupLayout PanelTaskLayout = new javax.swing.GroupLayout(PanelTask);
        PanelTask.setLayout(PanelTaskLayout);
        PanelTaskLayout.setHorizontalGroup(
            PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaskLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaskLayout.createSequentialGroup()
                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTaskLayout.createSequentialGroup()
                                .addComponent(labelOrdinalNumberOfTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
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
                        .addGroup(PanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTaskLayout.createSequentialGroup()
                                .addComponent(buttonAddOfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUpdateOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(buttonDeleteAllOfTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tableTimeLine.setAutoCreateRowSorter(true);
        tableTimeLine.setBackground(new java.awt.Color(255, 255, 255));
        tableTimeLine.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
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

        labelTimeOfTimeLine.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelTimeOfTimeLine.setText("Thời Gian");

        textFieldTimeOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        labelContentOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelContentOfTimeline.setText("Nội dung");

        textFieldContentOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        labelNoteOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        labelNoteOfTimeline.setText("Note");

        textAreaNoteOfTimeline.setColumns(20);
        textAreaNoteOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        textAreaNoteOfTimeline.setLineWrap(true);
        textAreaNoteOfTimeline.setRows(5);
        jScrollPane5.setViewportView(textAreaNoteOfTimeline);

        buttonAddOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonAddOfTimeline.setText("Thêm");

        buttonUpdateOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonUpdateOfTimeline.setText("Cập Nhật");

        buttonDeleteAllOfTimeline.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        buttonDeleteAllOfTimeline.setText("Làm Mới Timeline");

        javax.swing.GroupLayout PanelTimelineLayout = new javax.swing.GroupLayout(PanelTimeline);
        PanelTimeline.setLayout(PanelTimelineLayout);
        PanelTimelineLayout.setHorizontalGroup(
            PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimelineLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimelineLayout.createSequentialGroup()
                        .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTimeOfTimeLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelContentOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNoteOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldTimeOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(textFieldContentOfTimeline))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimelineLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimelineLayout.createSequentialGroup()
                        .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonDeleteAllOfTimeline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTimelineLayout.createSequentialGroup()
                                .addComponent(buttonAddOfTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonUpdateOfTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
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
                .addGap(56, 56, 56)
                .addGroup(PanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddOfTimeline)
                    .addComponent(buttonUpdateOfTimeline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDeleteAllOfTimeline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPaneAccessEvent.addTab("Timeline", PanelTimeline);

        PanelAccessEvent.add(TabbedPaneAccessEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 909, 445));

        buttonAccessEventGoBackListEvent.setText("Go Back");
        PanelAccessEvent.add(buttonAccessEventGoBackListEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Start.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        PanelAccessEvent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelAccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAddEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelListEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelEditEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelAccessEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        dialogNoticeTask.setSize(463, 252);
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
        
        dialogNoticeTimeline.setSize(463, 252);
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
        if(row == -1) JOptionPane.showMessageDialog(PanelAccessEvent, "Không thể truy cập","Thông báo",JOptionPane.ERROR_MESSAGE);
        else{
            textFieldContentOfTimeline.setText((String) tableTimeLine.getValueAt(row, 1));
        textFieldTimeOfTimeline.setText((String) tableTimeLine.getValueAt(row, 0));
        textAreaNoteOfTimeline.setText((String) tableTimeLine.getValueAt(row, 2));
        }
        
    }//GEN-LAST:event_tableTimeLineMouseClicked

    private void tableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTaskMouseClicked
        int row = tableTask.getSelectedRow();
        if(row == -1) JOptionPane.showMessageDialog(PanelAccessEvent, "Không thể truy cập","Thông báo",JOptionPane.ERROR_MESSAGE);
        else{
            textFieldOrdinalNumberOfTask.setText((String) tableTask.getValueAt(row, 0));
        textFieldContentOfTask.setText((String)tableTask.getValueAt(row, 1));
        textFieldLeadOfTask.setText((String)tableTask.getValueAt(row, 2));
        textFieldDeadlineOfTask.setText((String)tableTask.getValueAt(row, 3));
        textAreaNoteOfTask.setText((String)tableTask.getValueAt(row, 4));
        comboBoxStatusOfTask.setSelectedItem(tableTask.getValueAt(row, 5));
        }
    }//GEN-LAST:event_tableTaskMouseClicked

    private void labelStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelStartMouseClicked
        PanelStart.setVisible(false);
        PanelListEvent.setVisible(true);
    }//GEN-LAST:event_labelStartMouseClicked
    
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JLabel labelOrdinalNumberOfTask;
    private javax.swing.JLabel labelPlaceEventOfAddEvent;
    private javax.swing.JLabel labelPlaceEventOfEditEvent;
    private javax.swing.JLabel labelStart;
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

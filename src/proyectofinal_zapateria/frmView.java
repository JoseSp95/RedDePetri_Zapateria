package proyectofinal_zapateria;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Transition;

public class frmView extends javax.swing.JFrame {

    private ArrayList<JLabel> listTransitionsSlow;
    private ArrayList<JLabel> listTransitionsFast;
    private ArrayList<JLabel> listTokensFast;
    private ArrayList<JLabel> listTokensSlow;
    private ArrayList<JLabel> listOperators;
    private ArrayList<Integer> listData;
    private ArrayList<JLabel> results;
    
    public frmView() {
        initComponents();
        setLocationRelativeTo(null);
        addTransitions();
        radioSlow.setSelected(true);
        buttonGroup1.add(radioSlow);
        buttonGroup1.add(radioSpeed);
        addTokens();
        visibleTokens();
        addResults();
        showResults();
    }

    public void addTransitions(){
        listTransitionsFast = new ArrayList<>();
        listTransitionsFast.addAll(Arrays.asList(t2,t3,t4,t5,t9,t10,t11,t12,t13,t14,t7));
        
        listTransitionsSlow = new ArrayList<>();
        listTransitionsSlow.addAll(Arrays.asList(t2,t3,t4,t5,t6,t8,t9,t10,t11,t12,t13,t14));
        
    }
    
    public void addTokens(){
        listTokensSlow = new ArrayList<>();
        listTokensSlow.addAll(Arrays.asList(p_2,p_4,p_5,p_7,p_8,p_10,p_11,p_13,p_14,p_16,p_17,p_19));
    
        listTokensFast = new ArrayList<>();
        listTokensFast.addAll(Arrays.asList(p_2,p_4,p_5,p_7,p_11,p_13,p_14,p_16,p_17,p_19,p_10));
    
        listOperators = new ArrayList<>();
        listOperators.addAll(Arrays.asList(p_3,p_6,p_9,p_12,p_15,p_18));
        
    }
    
    public boolean addData(){
        try {
            listData = new ArrayList<>();
            listData.addAll(Arrays.asList(
                Integer.parseInt(txtR1.getText()),
                Integer.parseInt(txtR2.getText()),
                Integer.parseInt(txtR3.getText()),
                Integer.parseInt(txtR4.getText()),
                Integer.parseInt(txtR5.getText()),
                Integer.parseInt(txtR6.getText())
            ));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifique lo campos");
            return false;
        }
        return true;
    }
    
    public void visibleTokens(){
        ArrayList<JLabel> listLabels = 
                new ArrayList<>(Arrays.asList(p_2,p_3,p_4,p_5,p_6,p_7,p_8,p_9,p_10,p_11,p_12,p_13,p_14,p_15,p_16,p_17,p_18,p_19)); 
        
        listLabels.forEach((l)->{
            l.setVisible(false);
        });
        
    }
    
    public void addResults(){
        results = new ArrayList<>();
        results.addAll(Arrays.asList(txtResultR1,txtResultR2,txtResultR3,txtResultR4,txtResultR5,txtResultR6,txtResultShoes));
    }
    
    public void showResults(){
        results.forEach((r)->{
            r.setText("0");
        });
    }
    
    private void startThread(){
        if(!addData())
            return;
        if(radioSlow.isSelected()){
            Transition transition = new Transition(listTransitionsSlow, listTokensSlow, listOperators,listData,results);
            transition.start();
        }
        else{
            Transition transition = new Transition(listTransitionsFast, listTokensFast, listOperators,listData,results);
            transition.start();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        p_9 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        p_4 = new javax.swing.JLabel();
        p_5 = new javax.swing.JLabel();
        p_6 = new javax.swing.JLabel();
        p_7 = new javax.swing.JLabel();
        p_12 = new javax.swing.JLabel();
        p_8 = new javax.swing.JLabel();
        p_10 = new javax.swing.JLabel();
        p_15 = new javax.swing.JLabel();
        p_11 = new javax.swing.JLabel();
        p_13 = new javax.swing.JLabel();
        p_18 = new javax.swing.JLabel();
        p_14 = new javax.swing.JLabel();
        p_16 = new javax.swing.JLabel();
        p_19 = new javax.swing.JLabel();
        p_17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tachuelas10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tachuelas8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tachuelas11 = new javax.swing.JLabel();
        tachuelas9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        p_2 = new javax.swing.JLabel();
        p_3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtR1 = new javax.swing.JTextField();
        txtR2 = new javax.swing.JTextField();
        txtR3 = new javax.swing.JTextField();
        txtR4 = new javax.swing.JTextField();
        txtR5 = new javax.swing.JTextField();
        txtR6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        radioSlow = new javax.swing.JRadioButton();
        radioSpeed = new javax.swing.JRadioButton();
        btnInit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtResultR1 = new javax.swing.JLabel();
        txtResultR2 = new javax.swing.JLabel();
        txtResultR3 = new javax.swing.JLabel();
        txtResultR4 = new javax.swing.JLabel();
        txtResultR6 = new javax.swing.JLabel();
        txtResultR5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtResultShoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_9.setBackground(new java.awt.Color(0, 0, 204));
        p_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 47, 20, 20));

        t2.setBackground(new java.awt.Color(0, 51, 204));
        t2.setOpaque(true);
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 200, 7, 50));

        t3.setBackground(new java.awt.Color(0, 51, 204));
        t3.setOpaque(true);
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 200, 7, 50));

        t4.setBackground(new java.awt.Color(0, 51, 204));
        t4.setOpaque(true);
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 201, 7, 50));

        t5.setBackground(new java.awt.Color(0, 51, 204));
        t5.setOpaque(true);
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 201, 7, 50));

        t6.setBackground(new java.awt.Color(0, 51, 204));
        t6.setOpaque(true);
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 108, 7, 50));

        t7.setBackground(new java.awt.Color(0, 51, 204));
        t7.setOpaque(true);
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 288, 7, 50));

        t8.setBackground(new java.awt.Color(0, 51, 204));
        t8.setOpaque(true);
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 110, 7, 50));

        t9.setBackground(new java.awt.Color(0, 51, 204));
        t9.setOpaque(true);
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 202, 7, 50));

        t10.setBackground(new java.awt.Color(0, 51, 204));
        t10.setOpaque(true);
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 203, 7, 50));

        t11.setBackground(new java.awt.Color(0, 51, 204));
        t11.setOpaque(true);
        jPanel1.add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 450, 7, 50));

        t12.setBackground(new java.awt.Color(0, 51, 204));
        t12.setOpaque(true);
        jPanel1.add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 450, 7, 50));

        t14.setBackground(new java.awt.Color(0, 51, 204));
        t14.setOpaque(true);
        jPanel1.add(t14, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 451, 7, 50));

        t13.setBackground(new java.awt.Color(0, 51, 204));
        t13.setOpaque(true);
        jPanel1.add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 451, 7, 50));

        p_4.setBackground(new java.awt.Color(0, 0, 204));
        p_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 218, 20, 20));

        p_5.setBackground(new java.awt.Color(0, 0, 204));
        p_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 220, 20, 20));

        p_6.setBackground(new java.awt.Color(0, 0, 204));
        p_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 140, 20, 20));

        p_7.setBackground(new java.awt.Color(0, 0, 204));
        p_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 219, 20, 20));

        p_12.setBackground(new java.awt.Color(0, 0, 204));
        p_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle_1.png"))); // NOI18N
        jPanel1.add(p_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 140, 20, 20));

        p_8.setBackground(new java.awt.Color(0, 0, 204));
        p_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 125, 20, 20));

        p_10.setBackground(new java.awt.Color(0, 0, 204));
        p_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 218, 20, 20));

        p_15.setBackground(new java.awt.Color(0, 0, 204));
        p_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 386, 20, 20));

        p_11.setBackground(new java.awt.Color(0, 0, 204));
        p_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 221, 20, 20));

        p_13.setBackground(new java.awt.Color(0, 0, 204));
        p_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 465, 20, 20));

        p_18.setBackground(new java.awt.Color(0, 0, 204));
        p_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 390, 20, 20));

        p_14.setBackground(new java.awt.Color(0, 0, 204));
        p_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 463, 20, 20));

        p_16.setBackground(new java.awt.Color(0, 0, 204));
        p_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 465, 20, 20));

        p_19.setBackground(new java.awt.Color(0, 0, 204));
        p_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 469, 20, 20));

        p_17.setBackground(new java.awt.Color(0, 0, 204));
        p_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 465, 20, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LEYENDA");
        jLabel11.setOpaque(true);

        tachuelas10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tachuelas10.setText("16 Tachuelas");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("R3");

        tachuelas8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tachuelas8.setText("2 suelas");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("R6");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("R2");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("R1");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("3m Nylon");

        tachuelas11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tachuelas11.setText("3 Bisuteria");

        tachuelas9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tachuelas9.setText("1 Pegamento 100ml ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("R5");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("2 m de cuero");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("R4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tachuelas8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tachuelas11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tachuelas10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tachuelas9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tachuelas11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tachuelas10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tachuelas9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tachuelas8))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 220));

        p_2.setBackground(new java.awt.Color(0, 0, 204));
        p_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circleRed.png"))); // NOI18N
        jPanel1.add(p_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 215, 20, 20));

        p_3.setBackground(new java.awt.Color(0, 0, 204));
        p_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 150, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rdpZapateria3.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        p15.setBackground(new java.awt.Color(0, 0, 204));
        p15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.png"))); // NOI18N
        jPanel1.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 465, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("R1 : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("R2 : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("R3 : ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("R4 : ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("R5 : ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("R6 : ");

        txtR1.setBackground(new java.awt.Color(102, 102, 102));
        txtR1.setForeground(new java.awt.Color(255, 255, 255));
        txtR1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR1.setCaretColor(new java.awt.Color(255, 255, 255));

        txtR2.setBackground(new java.awt.Color(102, 102, 102));
        txtR2.setForeground(new java.awt.Color(255, 255, 255));
        txtR2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR2.setCaretColor(new java.awt.Color(255, 255, 255));

        txtR3.setBackground(new java.awt.Color(102, 102, 102));
        txtR3.setForeground(new java.awt.Color(255, 255, 255));
        txtR3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR3.setCaretColor(new java.awt.Color(255, 255, 255));

        txtR4.setBackground(new java.awt.Color(102, 102, 102));
        txtR4.setForeground(new java.awt.Color(255, 255, 255));
        txtR4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR4.setCaretColor(new java.awt.Color(255, 255, 255));

        txtR5.setBackground(new java.awt.Color(102, 102, 102));
        txtR5.setForeground(new java.awt.Color(255, 255, 255));
        txtR5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR5.setCaretColor(new java.awt.Color(255, 255, 255));

        txtR6.setBackground(new java.awt.Color(102, 102, 102));
        txtR6.setForeground(new java.awt.Color(255, 255, 255));
        txtR6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtR6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtR6.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DATOS");
        jLabel13.setOpaque(true);

        radioSlow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioSlow.setForeground(new java.awt.Color(255, 255, 255));
        radioSlow.setText("Lento");
        radioSlow.setFocusPainted(false);
        radioSlow.setOpaque(false);

        radioSpeed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioSpeed.setForeground(new java.awt.Color(255, 255, 255));
        radioSpeed.setText("Rápido");
        radioSpeed.setFocusPainted(false);
        radioSpeed.setOpaque(false);

        btnInit.setBackground(new java.awt.Color(102, 153, 255));
        btnInit.setForeground(new java.awt.Color(255, 255, 255));
        btnInit.setText("INICIAR");
        btnInit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInit.setFocusPainted(false);
        btnInit.setFocusable(false);
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("R4 : ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("R1 : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("R2 : ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("R5 : ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("R6 : ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("R3 : ");

        txtResultR1.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtResultR2.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtResultR3.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtResultR4.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtResultR6.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtResultR5.setForeground(new java.awt.Color(255, 255, 255));
        txtResultR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultR5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel33.setBackground(new java.awt.Color(153, 153, 153));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("RESULTADO");
        jLabel33.setOpaque(true);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Pares Zapatos");

        txtResultShoes.setForeground(new java.awt.Color(255, 255, 255));
        txtResultShoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResultShoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel15)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultR4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultR3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultR6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultR5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtResultR1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtResultR2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultR3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultR4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultR5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel28))
                    .addComponent(txtResultR6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel34))
                    .addComponent(txtResultShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioSlow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtR2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtR3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtR4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtR5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtR6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtR1))))
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(radioSlow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSpeed)
                .addGap(18, 18, 18)
                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        startThread();
    }//GEN-LAST:event_btnInitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel p15;
    private javax.swing.JLabel p_10;
    private javax.swing.JLabel p_11;
    private javax.swing.JLabel p_12;
    private javax.swing.JLabel p_13;
    private javax.swing.JLabel p_14;
    private javax.swing.JLabel p_15;
    private javax.swing.JLabel p_16;
    private javax.swing.JLabel p_17;
    private javax.swing.JLabel p_18;
    private javax.swing.JLabel p_19;
    private javax.swing.JLabel p_2;
    private javax.swing.JLabel p_3;
    private javax.swing.JLabel p_4;
    private javax.swing.JLabel p_5;
    private javax.swing.JLabel p_6;
    private javax.swing.JLabel p_7;
    private javax.swing.JLabel p_8;
    private javax.swing.JLabel p_9;
    private javax.swing.JRadioButton radioSlow;
    private javax.swing.JRadioButton radioSpeed;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JLabel tachuelas10;
    private javax.swing.JLabel tachuelas11;
    private javax.swing.JLabel tachuelas8;
    private javax.swing.JLabel tachuelas9;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    private javax.swing.JTextField txtR4;
    private javax.swing.JTextField txtR5;
    private javax.swing.JTextField txtR6;
    private javax.swing.JLabel txtResultR1;
    private javax.swing.JLabel txtResultR2;
    private javax.swing.JLabel txtResultR3;
    private javax.swing.JLabel txtResultR4;
    private javax.swing.JLabel txtResultR5;
    private javax.swing.JLabel txtResultR6;
    private javax.swing.JLabel txtResultShoes;
    // End of variables declaration//GEN-END:variables
}

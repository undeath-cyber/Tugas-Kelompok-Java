/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rental;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author parasite
 */
public class Cars extends javax.swing.JFrame {
    
    /**
     * Creates new form Cars
     */
    public Cars() {
        initComponents();
        DisplayCars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        DataMobil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataCustomer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RentalMobil = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReturnMobil = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        RegNumTb = new javax.swing.JTextField();
        BrandTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        StatusTb = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        ModelTb = new javax.swing.JTextField();
        HargaTb = new javax.swing.JTextField();
        SimpanBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        HapusBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        DataMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        DataMobil.setForeground(new java.awt.Color(255, 204, 102));
        DataMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataMobil.setText("Data Mobil");
        DataMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMobilMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("__________________________");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("__________________________");

        DataCustomer.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        DataCustomer.setForeground(new java.awt.Color(255, 255, 255));
        DataCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataCustomer.setText("Data Customer");
        DataCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataCustomerMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("__________________________");

        RentalMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        RentalMobil.setForeground(new java.awt.Color(255, 255, 255));
        RentalMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RentalMobil.setText("Rental Mobil");
        RentalMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentalMobilMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("__________________________");

        LogOut.setBackground(new java.awt.Color(255, 0, 51));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("LogOut");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/image/car (1).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rental Mobil Kami");

        ReturnMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        ReturnMobil.setForeground(new java.awt.Color(255, 255, 255));
        ReturnMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReturnMobil.setText("Pengembalian Mobil");
        ReturnMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMobilMouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("__________________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RentalMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReturnMobil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DataMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DataCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RentalMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReturnMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(542, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel11.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(97, 122, 85));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Data Mobil");

        jLabel15.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(97, 122, 85));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Close");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(97, 122, 85));
        jLabel14.setText("Plat_Nomor");

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        BrandTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTbActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(97, 122, 85));
        jLabel16.setText("Brand Mobil");

        jLabel17.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(97, 122, 85));
        jLabel17.setText("Model Mobil");

        jLabel18.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(97, 122, 85));
        jLabel18.setText("Status");

        StatusTb.setFont(new java.awt.Font("FreeMono", 0, 12)); // NOI18N
        StatusTb.setForeground(new java.awt.Color(0, 102, 102));
        StatusTb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Dipesan" }));
        StatusTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusTbActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(97, 122, 85));
        jLabel19.setText("Harga");

        ModelTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTbActionPerformed(evt);
            }
        });

        HargaTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTbActionPerformed(evt);
            }
        });

        SimpanBtn.setBackground(new java.awt.Color(255, 255, 255));
        SimpanBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        SimpanBtn.setForeground(new java.awt.Color(0, 102, 102));
        SimpanBtn.setText("Simpan");
        SimpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 204, 102));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        HapusBtn.setBackground(new java.awt.Color(255, 255, 255));
        HapusBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        HapusBtn.setForeground(new java.awt.Color(255, 0, 51));
        HapusBtn.setText("Hapus");
        HapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResetBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(51, 51, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(97, 122, 85));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Daftar Mobil");

        CarsTable.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Registrasi", "Brand", "Model", "Status", "Harga"
            }
        ));
        CarsTable.setRowHeight(25);
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CarsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(HapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(501, 501, 501)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(RegNumTb))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ModelTb)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusTb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HargaTb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(40, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BrandTb)
                    .addComponent(RegNumTb)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StatusTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HargaTb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
        new Login().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_LogOutActionPerformed

    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void BrandTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTbActionPerformed

    private void StatusTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusTbActionPerformed

    private void ModelTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTbActionPerformed

    private void HargaTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaTbActionPerformed

        Connection Con = null;
        Statement St = null;
        ResultSet Rs = null;
        private void DisplayCars()
        {
            try{
                 Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
                 St = (Statement) Con.createStatement();
                 Rs = St.executeQuery("select * from cartbl");
                 CarsTable.setModel(DbUtils.resultSetToTableModel(Rs));
            } catch (SQLException ex) {
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    private void SimpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBtnActionPerformed
        if (RegNumTb.getText().isEmpty() || HargaTb.getText().isEmpty() || BrandTb.getText().isEmpty() || ModelTb.getText().isEmpty() || StatusTb.getSelectedIndex() == -1) 
        {
              JOptionPane.showMessageDialog(this, "Isi data dengan lengkap!");
        } else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        
        // Tambahkan pengecekan apakah nomor registrasi sudah ada di database
        PreparedStatement checkDuplicate = Con.prepareStatement("SELECT * FROM cartbl WHERE Plat_Nomor = ?");
        checkDuplicate.setString(1, RegNumTb.getText());
        ResultSet rs = checkDuplicate.executeQuery();
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Plat nomor sudah terdaftar!");
            return; // Menghentikan eksekusi selanjutnya jika nomor registrasi sudah ada
        }
        
        
        PreparedStatement add = Con.prepareStatement("INSERT INTO cartbl VALUES (?, ?, ?, ?, ?)");
        add.setString(1, RegNumTb.getText());
        add.setString(2, BrandTb.getText());
        add.setString(3, ModelTb.getText());
        add.setString(4, StatusTb.getSelectedItem().toString());
        add.setInt(5, Integer.valueOf(HargaTb.getText()));
        int row = add.executeUpdate();
        JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Mobil");
        DisplayCars();
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }//GEN-LAST:event_SimpanBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (RegNumTb.getText().isEmpty() || HargaTb.getText().isEmpty() || BrandTb.getText().isEmpty() || ModelTb.getText().isEmpty() || StatusTb.getSelectedIndex() == -1)  
        {
              JOptionPane.showMessageDialog(this, "Pilih Mobil Yang Akan Di Update");
        } else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        String Reg = RegNumTb.getText();
        String Query = "UPDATE RentalDb.cartbl SET Brand='"+BrandTb.getText()+"', Model='"+ModelTb.getText()+"', Status='"+StatusTb.getSelectedItem().toString()+"', Harga='"+HargaTb.getText()+"' WHERE Plat_Nomor='"+Reg+"'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Berhasil Mengubah Mobil");
        DisplayCars();
        Reset();
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }//GEN-LAST:event_EditBtnActionPerformed

    private void HapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBtnActionPerformed
        if (RegNumTb.getText().isEmpty()) 
        {
              JOptionPane.showMessageDialog(this, "Pilih Mobil Yang Akan Di Hapus");
        } else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        String Reg = RegNumTb.getText();
        String Query = "Delete from RentalDb.cartbl where Plat_Nomor='"+Reg+"'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Berhasil Menghapus Mobil");
        DisplayCars();
        Reset();
        
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }//GEN-LAST:event_HapusBtnActionPerformed

    
    private void Reset(){
        RegNumTb.setText("");
        ModelTb.setText("");
        BrandTb.setText("");
        StatusTb.setSelectedIndex(0);
        HargaTb.setText("");
    }
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();
       int MyIndex = CarsTable.getSelectedRow();
       RegNumTb.setText(model.getValueAt(MyIndex, 0).toString());
       BrandTb.setText(model.getValueAt(MyIndex, 1).toString());
       ModelTb.setText(model.getValueAt(MyIndex, 2).toString());
       StatusTb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       HargaTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_CarsTableMouseClicked

    private void DataCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DataCustomerMouseClicked

    private void RentalMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentalMobilMouseClicked
        new Rental().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RentalMobilMouseClicked

    private void ReturnMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMobilMouseClicked
        new Returns().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMobilMouseClicked

    private void DataMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataMobilMouseClicked
        new Cars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DataMobilMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BrandTb;
    private javax.swing.JTable CarsTable;
    private javax.swing.JLabel DataCustomer;
    private javax.swing.JLabel DataMobil;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton HapusBtn;
    private javax.swing.JTextField HargaTb;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField ModelTb;
    private javax.swing.JTextField RegNumTb;
    private javax.swing.JLabel RentalMobil;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ReturnMobil;
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JComboBox<String> StatusTb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
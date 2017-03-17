/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cika Andini
 */
public class Main_Frame extends javax.swing.JFrame {

    private Object ex;

    /**
     * Creates new form Main_Frame
     */
    public Main_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNO = new javax.swing.JTextField();
        txtNAMA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtALAMAT = new javax.swing.JTextField();
        cmbJENIS = new javax.swing.JComboBox<>();
        txtJUDUL = new javax.swing.JTextField();
        jdcPINJAM = new com.toedter.calendar.JDateChooser();
        jdcKEMBALI = new com.toedter.calendar.JDateChooser();
        rdPINJAM = new javax.swing.JRadioButton();
        rdKEMBALI = new javax.swing.JRadioButton();
        btnCLEAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDATA = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnPRINT = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        btnSAVE = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHITUNG = new javax.swing.JButton();
        txtDENDA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtHARI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\JAVA NETBEANS\\IMG-20161118-WA0005 - Copy.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 130, 120);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setText("FORM PENGEMBALIAN BUKU ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 40, 380, 40);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setText("PERPUSTAKAAN SMK TELKOM MALANG");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 70, 510, 40);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel4.setText("No Anggota");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 160, 90, 20);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel5.setText("Nama Peminjam");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 220, 130, 20);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setText("Alamat Peminjam");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 280, 140, 20);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setText("Jenis Buku");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 340, 110, 19);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel8.setText("Judul Buku");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 400, 90, 20);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel9.setText("Tanggal Pinjam");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 460, 140, 19);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel10.setText("Tanggal Kembali");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 520, 160, 20);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel11.setText("Status");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 580, 70, 20);
        jPanel1.add(txtNO);
        txtNO.setBounds(30, 180, 180, 30);
        jPanel1.add(txtNAMA);
        txtNAMA.setBounds(30, 240, 180, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 260, 100, 0);

        txtALAMAT.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jPanel1.add(txtALAMAT);
        txtALAMAT.setBounds(30, 300, 180, 30);

        cmbJENIS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbJENIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelajaran", "Fiksi", "Komik/Novel" }));
        jPanel1.add(cmbJENIS);
        cmbJENIS.setBounds(30, 360, 180, 30);
        jPanel1.add(txtJUDUL);
        txtJUDUL.setBounds(30, 420, 180, 30);
        jPanel1.add(jdcPINJAM);
        jdcPINJAM.setBounds(30, 480, 180, 30);
        jPanel1.add(jdcKEMBALI);
        jdcKEMBALI.setBounds(30, 540, 180, 30);

        buttonGroup1.add(rdPINJAM);
        rdPINJAM.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        rdPINJAM.setText("Pinjam");
        jPanel1.add(rdPINJAM);
        rdPINJAM.setBounds(30, 600, 70, 23);

        buttonGroup1.add(rdKEMBALI);
        rdKEMBALI.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        rdKEMBALI.setText("Kembali");
        jPanel1.add(rdKEMBALI);
        rdKEMBALI.setBounds(140, 600, 93, 23);

        btnCLEAR.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnCLEAR.setText("CLEAR");
        btnCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLEARActionPerformed(evt);
            }
        });
        jPanel1.add(btnCLEAR);
        btnCLEAR.setBounds(740, 180, 100, 40);

        tbDATA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Anggota", "Nama Peminjam", "Alamat Peminjam", "Jenis Buku", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali", "Status", "Telat "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDATA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDATAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDATA);
        if (tbDATA.getColumnModel().getColumnCount() > 0) {
            tbDATA.getColumnModel().getColumn(0).setResizable(false);
            tbDATA.getColumnModel().getColumn(1).setResizable(false);
            tbDATA.getColumnModel().getColumn(2).setResizable(false);
            tbDATA.getColumnModel().getColumn(3).setResizable(false);
            tbDATA.getColumnModel().getColumn(4).setResizable(false);
            tbDATA.getColumnModel().getColumn(5).setResizable(false);
            tbDATA.getColumnModel().getColumn(6).setResizable(false);
            tbDATA.getColumnModel().getColumn(7).setResizable(false);
            tbDATA.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 410, 580, 260);

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 180, 100, 40);

        btnPRINT.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnPRINT.setText("PRINT");
        btnPRINT.setToolTipText("");
        btnPRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRINTActionPerformed(evt);
            }
        });
        jPanel1.add(btnPRINT);
        btnPRINT.setBounds(500, 180, 100, 40);

        btnDELETE.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnDELETE.setText("DELETE");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });
        jPanel1.add(btnDELETE);
        btnDELETE.setBounds(620, 180, 100, 40);

        btnSAVE.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnSAVE.setText("SAVE");
        btnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAVEActionPerformed(evt);
            }
        });
        jPanel1.add(btnSAVE);
        btnSAVE.setBounds(260, 180, 100, 40);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnHITUNG.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnHITUNG.setText("HITUNG DENDA");
        btnHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHITUNGActionPerformed(evt);
            }
        });

        txtDENDA.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DENDA YANG HARUS DIBAYAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnHITUNG))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtDENDA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDENDA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHITUNG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(540, 240, 290, 150);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TELAT PENGEMBALIAN");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(40, 20, 190, 40);
        jPanel4.add(txtHARI);
        txtHARI.setBounds(60, 70, 50, 40);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HARI");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(120, 70, 80, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(260, 240, 260, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 880, 710);

        setBounds(0, 0, 860, 713);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLEARActionPerformed
        txtNO.setText("");
        txtNAMA.setText("");
        txtALAMAT.setText("");
        txtJUDUL.setText("");
        jdcKEMBALI.setDate(null);
        jdcPINJAM.setDate(null);
        buttonGroup1.clearSelection();
        cmbJENIS.setSelectedItem("Pelajaran");
        txtHARI.setText("");
    }//GEN-LAST:event_btnCLEARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         selectData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        int baris = tbDATA.getSelectedRow();
        if (baris != -1) {
            String NO = tbDATA.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_kembali WHERE No_Anggota='"+NO+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnPRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRINTActionPerformed
        MessageFormat header = new MessageFormat("Form Pengembalian Perpustakaan SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page{0, number,integer}");
        try {
            tbDATA.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (Exception e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPRINTActionPerformed

    private void btnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAVEActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal_pinjam = dateFormat.format(jdcPINJAM.getDate());
        String tanggal_kembali = dateFormat.format(jdcKEMBALI.getDate());
        String status_buku = "";
        if (rdPINJAM.isSelected()) {
            status_buku = "Pinjam";
        } else {
            status_buku = "Kembali";
        }
        String jenis_buku = cmbJENIS.getSelectedItem().toString();

        if ("".equals(txtNO.getText()) || "".equals(txtNAMA.getText()) || "".equals(txtALAMAT.getText()) || "".equals(txtHARI.getText()) || "".equals(txtJUDUL.getText()))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String SQL = "INSERT INTO tb_kembali (No_Anggota,Nama_Peminjam,Alamat_Peminjam,Jenis_Buku,Judul_Buku,Tanggal_Pinjam,Tanggal_Kembali,Status,Telat_Pengembalian)"
            + "VALUES('"+txtNO.getText()+"','"+txtNAMA.getText()+"','"+txtALAMAT.getText()+"',"
            + "'"+jenis_buku+"','"+txtJUDUL.getText()+"','"+tanggal_pinjam+"','"+tanggal_kembali+"','"+status_buku+"',"
            + "'"+txtHARI.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSAVEActionPerformed

    private void tbDATAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDATAMouseClicked
       int baris = tbDATA.getSelectedRow();
        if (baris != -1) {
            txtNO.setText(tbDATA.getValueAt(baris, 0).toString());
            txtNAMA.setText(tbDATA.getValueAt(baris, 1).toString());
            txtALAMAT.setText(tbDATA.getValueAt(baris, 2).toString());
            cmbJENIS.setSelectedItem(tbDATA.getValueAt(baris, 3));
            txtJUDUL.setText(tbDATA.getValueAt(baris, 4).toString());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try {
                dateFormat = (Date) date.parse(tbDATA.getValueAt(baris, 5).toString());
            } catch (Exception e) {
                Logger.getLogger(Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jdcPINJAM.setDate(dateFormat);
            try {
                dateFormat = (Date) date.parse(tbDATA.getValueAt(baris, 6).toString());
            } catch (Exception e) {
                Logger.getLogger(Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jdcKEMBALI.setDate(dateFormat);
            String Status = tbDATA.getValueAt(baris, 7).toString();
            if (Status.equals("Pinjam")) {
                rdPINJAM.setSelected(true);
            } else {
                rdKEMBALI.setSelected(true);
            }
            txtHARI.setText(tbDATA.getValueAt(baris, 8).toString());
        }
    }//GEN-LAST:event_tbDATAMouseClicked

    private void btnHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHITUNGActionPerformed
        int lama_pinjam = Integer.parseInt(txtHARI.getText().toString());
        int total_denda = lama_pinjam*500;
        txtDENDA.setText(""+total_denda);
    }//GEN-LAST:event_btnHITUNGActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCLEAR;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnHITUNG;
    private javax.swing.JButton btnPRINT;
    private javax.swing.JButton btnSAVE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbJENIS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcKEMBALI;
    private com.toedter.calendar.JDateChooser jdcPINJAM;
    private javax.swing.JRadioButton rdKEMBALI;
    private javax.swing.JRadioButton rdPINJAM;
    private javax.swing.JTable tbDATA;
    private javax.swing.JTextField txtALAMAT;
    private javax.swing.JTextField txtDENDA;
    private javax.swing.JTextField txtHARI;
    private javax.swing.JTextField txtJUDUL;
    private javax.swing.JTextField txtNAMA;
    private javax.swing.JTextField txtNO;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"No_Anggota","Nama_Peminjam","Alamat_Peminjam","Jenis_Buku","Judul_Buku","Tanggal_Pinjam","Tanggal_Kembali","Status","Telat_Pengembalian"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_kembali";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while (rs.next()) {
                String No_Anggota = rs.getString(1);
                String Nama_Peminjam = rs.getString(2);
                String Alamat_Peminjam = rs.getString(3);
                String Jenis_Buku = rs.getString(4);
                String Judul_Buku = rs.getString(5);
                String Tanggal_Pinjam = rs.getString(6);
                String Tanggal_Kembali = rs.getString(7);
                String Status = "";
                if ("Pinjam".equals(rs.getString(8))) {
                    Status = "Pinjam";
                } else {
                    Status = "Kembali";
                }
                String Telat_Pengembalian = rs.getString(9);
                String data[] = {No_Anggota,Nama_Peminjam,Alamat_Peminjam,Jenis_Buku,Judul_Buku,Tanggal_Pinjam,Tanggal_Kembali,Status,Telat_Pengembalian};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbDATA.setModel(dtm);
    }
}

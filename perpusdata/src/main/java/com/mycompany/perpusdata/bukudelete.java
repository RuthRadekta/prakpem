package com.mycompany.perpusdata;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class bukudelete extends javax.swing.JFrame {

    /**
     * Creates new form bukudelete
     */
    public bukudelete() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFFF"));
        setDefaultCloseOperation(bukudelete.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasil = new javax.swing.JDialog();
        labeldelete1 = new javax.swing.JLabel();
        labelberhasil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labeldelete2 = new javax.swing.JLabel();
        lagi = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        anggota1 = new javax.swing.JButton();
        buku1 = new javax.swing.JButton();
        peminjaman1 = new javax.swing.JButton();
        pengembalian1 = new javax.swing.JButton();
        statkini1 = new javax.swing.JButton();
        riwayat1 = new javax.swing.JButton();
        bg3 = new javax.swing.JPanel();
        kembali1 = new javax.swing.JButton();
        hover1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        anggota = new javax.swing.JButton();
        buku = new javax.swing.JButton();
        peminjaman = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();
        statkini = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        hover = new javax.swing.JPanel();
        labelmasukkanid = new javax.swing.JLabel();
        cekidb = new javax.swing.JTextField();
        buttoncek = new javax.swing.JButton();
        labelupdate1 = new javax.swing.JLabel();

        hasil.setMaximumSize(new java.awt.Dimension(830, 450));
        hasil.setMinimumSize(new java.awt.Dimension(830, 450));
        hasil.setPreferredSize(new java.awt.Dimension(830, 450));
        hasil.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeldelete1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labeldelete1.setForeground(new java.awt.Color(190, 196, 205));
        labeldelete1.setText("MENGHAPUS DATA");
        hasil.getContentPane().add(labeldelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        labelberhasil.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelberhasil.setForeground(new java.awt.Color(155, 164, 180));
        labelberhasil.setText("DATA BERHASIL DIHAPUS");
        hasil.getContentPane().add(labelberhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 390, -1));
        hasil.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 360, 10));

        labeldelete2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labeldelete2.setForeground(new java.awt.Color(155, 164, 180));
        labeldelete2.setText("DELETE");
        hasil.getContentPane().add(labeldelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        lagi.setBackground(new java.awt.Color(216, 219, 227));
        lagi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lagi.setForeground(new java.awt.Color(155, 164, 180));
        lagi.setText("Delete Data Lain");
        lagi.setBorder(null);
        lagi.setBorderPainted(false);
        lagi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(lagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 140, 40));

        home1.setBackground(new java.awt.Color(241, 244, 246));
        home1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home1.setForeground(new java.awt.Color(255, 255, 255));
        home1.setText("HOME");
        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota1.setBackground(new java.awt.Color(241, 244, 246));
        anggota1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota1.setForeground(new java.awt.Color(255, 255, 255));
        anggota1.setText("ANGGOTA");
        anggota1.setBorderPainted(false);
        anggota1.setContentAreaFilled(false);
        anggota1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(anggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku1.setBackground(new java.awt.Color(241, 244, 246));
        buku1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku1.setForeground(new java.awt.Color(255, 255, 255));
        buku1.setText("BUKU");
        buku1.setBorderPainted(false);
        buku1.setContentAreaFilled(false);
        buku1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(buku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman1.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman1.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman1.setText("PEMINJAMAN");
        peminjaman1.setBorderPainted(false);
        peminjaman1.setContentAreaFilled(false);
        peminjaman1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(peminjaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian1.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian1.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian1.setText("PENGEMBALIAN");
        pengembalian1.setBorderPainted(false);
        pengembalian1.setContentAreaFilled(false);
        pengembalian1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(pengembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini1.setBackground(new java.awt.Color(241, 244, 246));
        statkini1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini1.setForeground(new java.awt.Color(255, 255, 255));
        statkini1.setText("STATUS TERKINI");
        statkini1.setBorderPainted(false);
        statkini1.setContentAreaFilled(false);
        statkini1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(statkini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        riwayat1.setBackground(new java.awt.Color(241, 244, 246));
        riwayat1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        riwayat1.setForeground(new java.awt.Color(255, 255, 255));
        riwayat1.setText("RIWAYAT");
        riwayat1.setBorderPainted(false);
        riwayat1.setContentAreaFilled(false);
        riwayat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(riwayat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 150, -1));

        bg3.setBackground(new java.awt.Color(155, 164, 180));
        bg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali1.setForeground(new java.awt.Color(255, 255, 255));
        kembali1.setText("kembali");
        kembali1.setBorderPainted(false);
        kembali1.setContentAreaFilled(false);
        kembali1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg3.add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover1.setBackground(new java.awt.Color(190, 196, 205));
        bg3.add(hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        hasil.getContentPane().add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 450));
        setMinimumSize(new java.awt.Dimension(830, 450));
        setPreferredSize(new java.awt.Dimension(830, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(241, 244, 246));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota.setBackground(new java.awt.Color(241, 244, 246));
        anggota.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota.setForeground(new java.awt.Color(255, 255, 255));
        anggota.setText("ANGGOTA");
        anggota.setBorderPainted(false);
        anggota.setContentAreaFilled(false);
        anggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggotaActionPerformed(evt);
            }
        });
        getContentPane().add(anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku.setBackground(new java.awt.Color(241, 244, 246));
        buku.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku.setForeground(new java.awt.Color(255, 255, 255));
        buku.setText("BUKU");
        buku.setBorderPainted(false);
        buku.setContentAreaFilled(false);
        buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuActionPerformed(evt);
            }
        });
        getContentPane().add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman.setText("PEMINJAMAN");
        peminjaman.setBorderPainted(false);
        peminjaman.setContentAreaFilled(false);
        peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian.setText("PENGEMBALIAN");
        pengembalian.setBorderPainted(false);
        pengembalian.setContentAreaFilled(false);
        pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini.setBackground(new java.awt.Color(241, 244, 246));
        statkini.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini.setForeground(new java.awt.Color(255, 255, 255));
        statkini.setText("STATUS TERKINI");
        statkini.setBorderPainted(false);
        statkini.setContentAreaFilled(false);
        statkini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statkini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statkiniActionPerformed(evt);
            }
        });
        getContentPane().add(statkini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        riwayat.setBackground(new java.awt.Color(241, 244, 246));
        riwayat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        riwayat.setForeground(new java.awt.Color(255, 255, 255));
        riwayat.setText("RIWAYAT");
        riwayat.setBorderPainted(false);
        riwayat.setContentAreaFilled(false);
        riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 150, -1));

        bg2.setBackground(new java.awt.Color(155, 164, 180));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("kembali");
        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        bg2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover.setBackground(new java.awt.Color(190, 196, 205));
        bg2.add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        labelmasukkanid.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        labelmasukkanid.setForeground(new java.awt.Color(155, 164, 180));
        labelmasukkanid.setText("Masukkan ID Buku");
        getContentPane().add(labelmasukkanid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        cekidb.setBackground(new java.awt.Color(216, 219, 227));
        cekidb.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cekidb.setForeground(new java.awt.Color(155, 164, 180));
        cekidb.setBorder(null);
        cekidb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(cekidb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 160, 40));

        buttoncek.setBackground(new java.awt.Color(155, 164, 180));
        buttoncek.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        buttoncek.setForeground(new java.awt.Color(255, 255, 255));
        buttoncek.setText("Cek");
        buttoncek.setBorder(null);
        buttoncek.setBorderPainted(false);
        buttoncek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttoncek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncekActionPerformed(evt);
            }
        });
        getContentPane().add(buttoncek, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, 30));

        labelupdate1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelupdate1.setForeground(new java.awt.Color(190, 196, 205));
        labelupdate1.setText("MENGHAPUS DATA");
        getContentPane().add(labelupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        new bukupage().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        dispose();
        new mainpage().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggotaActionPerformed
        // TODO add your handling code here:
        dispose();
        new anggotapage().setVisible(true);
    }//GEN-LAST:event_anggotaActionPerformed

    private void bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bukuActionPerformed

    private void peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanActionPerformed
        // TODO add your handling code here:
        dispose();
        new pinjampage().setVisible(true);
    }//GEN-LAST:event_peminjamanActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        // TODO add your handling code here:
        dispose();
        new kembalipage().setVisible(true);
    }//GEN-LAST:event_pengembalianActionPerformed

    private void statkiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statkiniActionPerformed
        // TODO add your handling code here:
        dispose();
        new statuspage().setVisible(true);
    }//GEN-LAST:event_statkiniActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        dispose();
        new riwayatpage().setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void buttoncekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncekActionPerformed
        // TODO add your handling code here:
        try {
            update cek = new update();
            String id_buku = String.valueOf(cekidb.getText());
            
            cek.idb2(id_buku);
            if (cek.ida(id_buku)){
                dispose();
                hasil.getContentPane().setBackground(Color.decode("0xFFFFFF"));
                hasil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "ID Buku tidak ditemukan!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttoncekActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void bukudelete(String args[]) {
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
            java.util.logging.Logger.getLogger(bukudelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bukudelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bukudelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bukudelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bukudelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggota;
    private javax.swing.JButton anggota1;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel bg3;
    private javax.swing.JButton buku;
    private javax.swing.JButton buku1;
    private javax.swing.JButton buttoncek;
    private javax.swing.JTextField cekidb;
    private javax.swing.JDialog hasil;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JPanel hover;
    private javax.swing.JPanel hover1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kembali;
    private javax.swing.JButton kembali1;
    private javax.swing.JLabel labelberhasil;
    private javax.swing.JLabel labeldelete1;
    private javax.swing.JLabel labeldelete2;
    private javax.swing.JLabel labelmasukkanid;
    private javax.swing.JLabel labelupdate1;
    private javax.swing.JButton lagi;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton peminjaman1;
    private javax.swing.JButton pengembalian;
    private javax.swing.JButton pengembalian1;
    private javax.swing.JButton riwayat;
    private javax.swing.JButton riwayat1;
    private javax.swing.JButton statkini;
    private javax.swing.JButton statkini1;
    // End of variables declaration//GEN-END:variables
}

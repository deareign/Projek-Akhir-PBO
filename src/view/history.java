/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTable;
import javax.swing.*;
import controller.controllerHistory;

/**
 *
 * @author HP
 */
public class history extends javax.swing.JFrame {

    /**
     * Creates new form history
     */
   
    
    controllerHistory ch;
    public history() {
        initComponents();
      ch = new controllerHistory(this);
      ch.isiHistory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHistory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTxtJumlah = new javax.swing.JTextField();
        btnRegis = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Servis", "Nama Pelanggan", "Tanggal", "No Telepon", "Jenis Device", "Nama Device", "Jenis Service", "Deskripsi", "Total Biaya", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 690, 350));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Jumlah Data");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 97, -1, 30));

        jTxtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 130, 30));

        btnRegis.setBackground(new java.awt.Color(63, 125, 118));
        btnRegis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegis.setForeground(new java.awt.Color(255, 255, 255));
        btnRegis.setText("Registrasi Servis");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 49));

        btnBayar.setBackground(new java.awt.Color(63, 125, 118));
        btnBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Pembayaran");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 49));

        btnRiwayat.setBackground(new java.awt.Color(63, 125, 118));
        btnRiwayat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        btnRiwayat.setText("Riwayat");
        getContentPane().add(btnRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 49));

        btnExit.setBackground(new java.awt.Color(63, 125, 118));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 49));

        jPanel1.setBackground(new java.awt.Color(182, 196, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setBackground(new java.awt.Color(182, 196, 190));
        id.setForeground(new java.awt.Color(182, 196, 190));
        id.setText("jTextField1");
        id.setBorder(null);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 49, 71, -1));

        jLabel8.setBackground(new java.awt.Color(183, 201, 200));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 39, 39));
        jLabel8.setText("Riwayat Servis");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 300, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -20, 740, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 150));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ADMIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        new pembayaran().show();
        dispose();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        new home().show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisActionPerformed

    private void jTxtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtJumlahActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtJumlah;
    private javax.swing.JTable tabelHistory;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelHistory() {
        return tabelHistory;
    }

    public void setTabelHistory(JTable tabelHistory) {
        this.tabelHistory = tabelHistory;
    }

    public JTextField getjTxtJumlah() {
        return jTxtJumlah;
    }

    public void setjTxtJumlah(JTextField jTxtJumlah) {
        this.jTxtJumlah = jTxtJumlah;
    }
    
    

    
}
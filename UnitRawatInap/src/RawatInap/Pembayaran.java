package RawatInap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAPTAIN
 */
public class Pembayaran extends javax.swing.JFrame {
private DefaultTableModel model;
    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
        model = new DefaultTableModel();
        TabelPembayaran.setModel(model);
        model.addColumn("No. Transaksi");
        model.addColumn("Tanggal");
        model.addColumn("Kode Pasien");
        model.addColumn("Nama Pasien");
        model.addColumn("Kode Kamar");
        model.addColumn("Kelas Kamar");
        model.addColumn("Lama Menginap");
        model.addColumn("Harga Perhari");
        model.addColumn("Total Bayar");
        
        loadData();
    }
public void loadData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = KoneksiDatabase.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM pembayaran ";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[9];
                o[0] = r.getString("no_transaksi");
                o[1] = r.getString("tgl");
                o[2] = r.getString("kode_pasien");
                o[3] = r.getString("nama_pasien");
                o[4] = r.getString("kode_kamar");
                o[5] = r.getString("kelas_kamar");
                o[6] = r.getString("lama_menginap");
                o[7] = r.getString("harga_perhari");
                o[8] = r.getString("total_bayar");
                
                model.addRow(o);
            }

            r.close();
            s.close();
        } catch (SQLException e) {
        }
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        kd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        lm = new javax.swing.JTextField();
        tb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPembayaran = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        kl = new javax.swing.JComboBox();
        hrg = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        kdk = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("No");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Kode Pasien");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("RINCIAN PEMBAYARAN");

        jLabel5.setText("Nama Pasien");

        jLabel6.setText("Kelas Kamar");

        jLabel7.setText("Lama Menginap");

        jLabel8.setText("Total Bayar");

        TabelPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPembayaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelPembayaran);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Bersihkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Harga/hari");

        kl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VIP", "Kelas 1", "Kelas 2", "Kelas 3" }));

        hrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "500000", "300000", "200000", "100000" }));

        jLabel10.setText("Kode Kamar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nm)
                            .addComponent(kd)
                            .addComponent(tgl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(no, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lm)
                                    .addComponent(tb)
                                    .addComponent(hrg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(kdk))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3)
                        .addGap(38, 38, 38)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(kdk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(kl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int data1 = Integer.parseInt(hrg.getSelectedItem().toString());
        int data2 = Integer.parseInt(lm.getText());
        int hasil = data1*data2;
        tb.setText(String.valueOf(hasil));
        String nomor = no.getText();
        String tanggal = tgl.getText();
        String kode = kd.getText();
        String nama = nm.getText();
        String kamar = kdk.getText();
        String kelas = kl.getSelectedItem().toString();
        String lama = lm.getText();
        String harga = hrg.getSelectedItem().toString();
        String total = tb.getText();
        
        tb.setText(String.valueOf(hasil));
        
        try {
            Connection c = KoneksiDatabase.getKoneksi();

            String sql = "INSERT INTO pembayaran VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, nomor);
            p.setString(2, tanggal);
            p.setString(3, kode);
            p.setString(4, nama);
            p.setString(5, kamar);
            p.setString(6, kelas);
            p.setString(7, lama);
            p.setString(8, harga);
            p.setString(9, total);


            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error" + e);
        } finally {
            loadData();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         no.setText("");
         tgl.setText("");
         kd.setText("");
         kdk.setText("");
         nm.setText("");
         lm.setText("");
         tb.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int i = TabelPembayaran.getSelectedRow();
        if (i == -1) {
            return;
        }
        String nomor = (String) model.getValueAt(i, 0);
        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sq = "DELETE FROM pembayaran WHERE no_transaksi = ?";
            PreparedStatement l = c.prepareStatement(sq);

            l.setString(1, nomor);

            l.executeUpdate();
            l.close();
        } catch (SQLException e) {
            System.err.println("Terjadi Error" + e);
        } finally {
            loadData();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int i = TabelPembayaran.getSelectedRow();
        if (i == -1) {
            return;
        }
        String nomor = (String) model.getValueAt(i, 0);
        String tanggal = tgl.getText();
        String kode = kd.getText();
        String nama = nm.getText();
        String kamar = kdk.getText();
        String kelas = kl.getSelectedItem().toString();
        String lama = lm.getText();
        String harga = hrg.getSelectedItem().toString();
        String total = tb.getText();
        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "UPDATE pembayaran SET "
                    + "total_bayar =?"
                    + "harga_perhari =?"
                    + "lama_menginap =?"
                    + "kelas_kamar =?"
                    + "kode_kamar =?"
                    + "nama_pasien =?"
                    + "kode_pasien =?"
                    + "tgl =?"
                    + " WHERE no_transaksi= ?";
            
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, total);
            p.setString(2, harga);
            p.setString(3, lama);
            p.setString(4, kelas);
            p.setString(5, kamar);
            p.setString(6, nama);
            p.setString(7, kode);
            p.setString(8, tanggal);
            p.setString(9, nomor);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error" + e);

        } finally {
            loadData();
        }              // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TabelPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPembayaranMouseClicked
int i = TabelPembayaran.getSelectedRow();
        if (i == -1) {
            return;
        }
        String nomor = (String) model.getValueAt(i, 0);
        no.setText(nomor);
        
        String tanggal = (String) model.getValueAt(i, 1);
        tgl.setText(tanggal);
        
        String kode = (String) model.getValueAt(i, 2);
        kd.setText(kode);

        String nama = (String) model.getValueAt(i, 3);
        nm.setText(nama);
        
        String kamar = (String) model.getValueAt(i, 4);
        kdk.setText(kamar);
        
        String kelas = (String) model.getValueAt(i, 5);
        kl.addItem(kelas);
        
        String lama = (String) model.getValueAt(i, 6);
        lm.setText(lama);
        
        String harga = (String) model.getValueAt(i, 7);
        hrg.addItem(harga);
        
        String total= (String) model.getValueAt(i, 8);
        tb.setText(total);
        
    }//GEN-LAST:event_TabelPembayaranMouseClicked

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPembayaran;
    private javax.swing.JComboBox hrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kd;
    private javax.swing.JTextField kdk;
    private javax.swing.JComboBox kl;
    private javax.swing.JTextField lm;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField no;
    private javax.swing.JTextField tb;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}

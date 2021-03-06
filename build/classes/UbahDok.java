
import java.io.File;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiseka
 */
public class UbahDok extends javax.swing.JPanel {
    Data dok;
    String filename = null;
    
    public UbahDok(Data d) {
        initComponents();
        
        dok = d;
        txtNama.setText(dok.getNama());
        txtKategori.setText(dok.getKategori());
        txtLokasi.setText(dok.getLokasi());
        txtDeskripsi.setText(dok.getDeskripsi());
        txtTanggal.setText(dok.getTanggal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        txtKode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 255));
        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(52, 82, 111));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Dokumen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 202, 40));

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(52, 82, 111));
        btnUbah.setText("Ubah Data");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, 43));
        jPanel1.add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 200, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Dokumen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));
        jPanel1.add(txtKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kategori Dokumen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lokasi Dokumen");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deskripsi Dokumen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(txtLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 200, 40));
        jPanel1.add(txtDeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, 40));
        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 40));

        btnChoose.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnChoose.setForeground(new java.awt.Color(52, 82, 111));
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        
        String nama = txtNama.getText();
        String kategori = txtKategori.getText();
        String lokasi = txtLokasi.getText();
        String deskripsi = txtDeskripsi.getText();
        String tanggal = txtTanggal.getText();
        if(nama.isEmpty()) {
        } else {
            try {
                java.sql.Connection c = Connection.MySQL();
                Statement st = c.createStatement();
                String query = "UPDATE dokumen set nama = '"+nama+"',kategori = '"+kategori+"',lokasi = '"+lokasi+"',deskripsi='"+deskripsi+"',tanggal = '"+tanggal+"' WHERE kode ="+dok.getKode()+"";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Data telah diubah");
                halamanUtama.addComp(new DataDokumen());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txtLokasi.setText(filename);
    }//GEN-LAST:event_btnChooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}

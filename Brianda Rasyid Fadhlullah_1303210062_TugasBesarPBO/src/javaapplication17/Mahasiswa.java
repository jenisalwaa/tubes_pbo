package javaapplication17;

import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

public class Mahasiswa extends javax.swing.JFrame {

    String user_id, nama, username, password, usertype, cariuserid;
    public Mahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldnama = new javax.swing.JTextField();
        jTextFieldnim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFielduname = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldcari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtoncari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 55));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Dashboard", jPanel1);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nama : ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("User Id:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Username: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Password: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Usertype:");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        DefaultListModel listModel = new DefaultListModel();
        try {
            JDBC.con = DriverManager.getConnection(JDBC.DB_URL, JDBC.DB_USER, JDBC.DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            JDBC.stmt = JDBC.con.createStatement();
            String sql = "SELECT nama FROM multiuser WHERE usertype ='mahasiswa'";
            JDBC.rs = JDBC.stmt.executeQuery(sql);
            while(JDBC.rs.next()){
                String nama = JDBC.rs.getString("nama");
                listModel.addElement(nama);
            }
            jList1.setModel(listModel);
            ListenerClass listener = new ListenerClass();
            jList1.addListSelectionListener(listener);

        } catch (Exception e) {
            e.printStackTrace();
        }
        jScrollPane2.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Dosen", "Mahasiswa" }));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari User"));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("User Id:");

        jButtoncari.setText("Cari");
        jButtoncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldcari, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButtoncari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtoncari)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFielduname, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldnama)
                                .addComponent(jTextFieldnim, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFielduname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntambah)
                            .addComponent(btnupdate)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(131, 131, 131))
        );

        jTabbedPane1.addTab("Edit", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(jTextFieldnama.getText().isEmpty() || jTextFieldnim.getText().isEmpty() || jTextFielduname.getText().isEmpty() || jPasswordField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Error! Isi semua data!", "Status", JOptionPane.PLAIN_MESSAGE);
        }
        if(jList1.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Error! Pilih mahasiswa terlebih dahulu!", "Status", JOptionPane.PLAIN_MESSAGE);
        } else {
            
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        user_id = jTextFieldnim.getText();
        nama = jTextFieldnama.getText();
        username = jTextFielduname.getText();
        password = jPasswordField1.getText();
        usertype = jComboBox1.getSelectedItem().toString();

        insertData();
        clearForm();

    }//GEN-LAST:event_btntambahActionPerformed

    private void jButtoncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncariActionPerformed
        cariuserid = jTextFieldcari.getText();
        cariUser();
        tampilData();
        
    }//GEN-LAST:event_jButtoncariActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }
    
    private class ListenerClass implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            try {
		Class.forName("com.mysql.jdbc.Driver");
                DatabaseClass.stmt = DatabaseClass.con.createStatement();
                String pilihanList = jList1.getSelectedValue();
                String sql2 = "SELECT * FROM multiuser where nama='" + pilihanList + "'";
                DatabaseClass.rs = DatabaseClass.stmt.executeQuery(sql2);
                while(DatabaseClass.rs.next()){
                    String user_id = DatabaseClass.rs.getString("user_id");
                    String nama = DatabaseClass.rs.getString("nama");
                    String username = DatabaseClass.rs.getString("username");
                    String password = DatabaseClass.rs.getString("password");
                    String usertype= DatabaseClass.rs.getString("usertype");
                    
                    
                    jTextFieldnim.setText(user_id);
                    jTextFieldnama.setText(nama);
                    jTextFielduname.setText(username);
                    jPasswordField1.setText(password);
                    jComboBox1.setActionCommand(usertype);
                }
                DatabaseClass.stmt.close();
            } catch (Exception en) {
                en.printStackTrace();
            }        
        }
    }
    
    public void checkNama(){
        boolean checkNama;
        nama = jTextFieldnama.getText().toString();
        String errorNama = "Nama hanya terdiri dari karakter huruf A-Z.";
        
        checkNama = nama.matches("[a-zA-Z]+");
        
        
    }
    
    public boolean insertData(){
        try{
            DatabaseClass.stmt = DatabaseClass.con.createStatement();
            
            int insert = DatabaseClass.stmt.executeUpdate("INSERT INTO `multiuser`"
                    + "(`user_id`, `nama`, `username`, `password`, `usertype`) VALUES (user_id, nama, username, password, usertype)");
            
            if(insert == 1){
                JOptionPane.showMessageDialog(rootPane, "Data Tersimpan");
            }
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error : " +ex.getMessage());
        }
        return false;
    }
    
    private void clearForm(){
        jTextFieldnim.setText("");
        jTextFieldnama.setText("");
        jTextFielduname.setText("");
        jPasswordField1.setText("");
        jComboBox1.setSelectedIndex(0);
    }
    
    public void cariUser(){
        String sql = "SELECT * FROM `multiuser` WHERE user_id= '" + cariuserid + "'";
        
        try{
            DatabaseClass.stmt = DatabaseClass.con.createStatement();
            DatabaseClass.rs = DatabaseClass.stmt.executeQuery(sql);
            
            while(DatabaseClass.rs.next()){
                if(DatabaseClass.rs.getString(sql).isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "User ID tidak ditemukan.");
                }else{
                    user_id = DatabaseClass.rs.getString("user_id");
                    nama = DatabaseClass.rs.getString("nama");
                    username = DatabaseClass.rs.getString("username");
                    password = DatabaseClass.rs.getString("password");
                    usertype = DatabaseClass.rs.getString("usertype");
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void tampilData(){
       jTextFieldnim.setText(user_id);
       jTextFieldnama.setText(nama);
       jTextFielduname.setText(username);
       jPasswordField1.setText(password);
       jComboBox1.setSelectedItem(usertype);
    }
    
    private boolean updateData(){
        try {
                DatabaseClass.stmt = DatabaseClass.con.createStatement();
                
                int update = DatabaseClass.stmt.executeUpdate("UPDATE multiuser SET user_id='" + user_id + "',"
                        + "nama = '" + nama + "', "
                        + "username = '" +username + "', "
                        + "password = '" + password + "', "
                        + "usertype = '" + usertype +"'," 
                        + "WHERE user_id = '" + cariuserid + "'") ;
                
                if(update == 1){
                    JOptionPane.showMessageDialog(this, "Data berhasil di-update di database", "Status", JOptionPane.PLAIN_MESSAGE);
                }
                return true;
                
            } catch (Exception en) {
                JOptionPane.showMessageDialog(null, "error : " + en.getMessage());
            }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtoncari;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldcari;
    private javax.swing.JTextField jTextFieldnama;
    private javax.swing.JTextField jTextFieldnim;
    private javax.swing.JTextField jTextFielduname;
    // End of variables declaration//GEN-END:variables
}

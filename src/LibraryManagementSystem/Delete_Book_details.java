/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Delete_Book_details extends javax.swing.JFrame {
    public Delete_Book_details() {
        initComponents();
        ComboBox1();
    }

    public void ComboBox1(){
            try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS");
            Statement st = cn.createStatement();
            String str = "Select ISBN from Book_Info";
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                cmb.addItem(rs.getString("Isbn"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
    
    String imgPath = null;
     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
           MyImage = new ImageIcon(ImagePath);
        }else
        {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblphoto = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtan = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 187, 210, 255));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 318, 190, -1));

        txtedition.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 366, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 316, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Edition :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 364, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 412, 120, 30));

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        getContentPane().add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 414, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ISBN No :.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 128, 110, -1));

        txtbn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 174, 190, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Welcome To Library");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 43, -1, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 493, 95, 31));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 0, -1, -1));

        txtan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtan, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 222, 190, -1));

        txtpub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 270, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Book Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 172, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Publisher :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 268, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Author Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 220, 120, 30));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 493, 95, 31));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 121, 95, 31));

        getContentPane().add(cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 123, 190, 31));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/252095.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed

    }//GEN-LAST:event_txtqtyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection ct = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS");
            Statement st = ct.createStatement();
            String str = "delete from book_info where isbn ='"+cmb.getSelectedItem().toString()+"'";
            st.executeUpdate(str);
            JOptionPane.showMessageDialog(rootPane, "Successfully Deleted......................");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MainPanel mp = new MainPanel();
        mp.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtbn.setText("");
        txtan.setText("");
        txtpub.setText("");
        txtprice.setText("");
        txtedition.setText("");
        txtqty.setText("");
        lblphoto.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String isbnno = cmb.getSelectedItem().toString();
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS");
            String str = "Select * from Book_info where isbn='"+isbnno+"' ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                txtbn.setText(rs.getString("Book_name"));
                txtbn.setEnabled(false);
                txtan.setText(rs.getString("author_name"));
                txtan.setEnabled(false);
                txtpub.setText(rs.getString("publisher"));
                txtpub.setEnabled(false);
                txtprice.setText(rs.getString("price"));
                txtprice.setEnabled(false);
                txtedition.setText(rs.getString("edition"));
                txtedition.setEnabled(false);
                txtqty.setText(rs.getString("qty"));
                txtqty.setEnabled(false);
                lblphoto.setIcon(ResizeImage(null, rs.getBytes("img")));
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Book_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField txtan;
    private javax.swing.JTextField txtbn;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}

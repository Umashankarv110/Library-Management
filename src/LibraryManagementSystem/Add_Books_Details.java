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

public class Add_Books_Details extends javax.swing.JFrame {
    
    public Add_Books_Details() {
        initComponents();
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
    public void ImgbuttonActionPerformed(java.awt.event.ActionEvent evt){
        try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS");
        PreparedStatement ps=cn.prepareStatement("Insert into Book_Info values(?,?,?,?,?,?,?)"); 
        int i = ps.executeUpdate();
        System.out.println(i+"record affected");
        JOptionPane.showMessageDialog(rootPane, "Record Inserted");
        cn.close();
    }catch(Exception e){
        System.out.println(e); 
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtan = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        Btn_img = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Welcome To Library");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 43, -1, 30));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 487, 95, 31));

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
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 0, -1, -1));

        txtan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtan, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 221, 190, -1));

        txtpub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 269, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Publisher :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 267, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 315, 120, 30));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 317, 190, -1));

        txtedition.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditionActionPerformed(evt);
            }
        });
        getContentPane().add(txtedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 365, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Edition :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 363, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 411, 120, 30));

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        getContentPane().add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 413, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ISBN No :.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 123, 120, 30));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 123, 190, 30));

        txtbn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 173, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Book Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 171, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Author Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 219, 120, 30));

        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 156, 210, 255));

        Btn_img.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_img.setText("Browser");
        Btn_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_imgActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 429, -1, -1));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 487, 95, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/165831.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtno.setText("");
        txtbn.setText("");
        txtan.setText("");
        txtpub.setText("");
        txtprice.setText("");
        txtedition.setText("");
        txtqty.setText("");
        lblphoto.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MainPanel mp = new MainPanel();
        mp.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void Btn_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_imgActionPerformed
        // TODO add your handling code here:
        JFileChooser file=new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblphoto.setIcon(ResizeImage(path,null));
            imgPath = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_Btn_imgActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:

        String isbn = txtno.getText();
        String Book_Name = txtbn.getText();
        String Author_Name = txtan.getText();
        String Publisher = txtpub.getText();
        int Price = Integer.parseInt(txtprice.getText());
        String Edition = txtedition.getText();
        int Qty =  Integer.parseInt(txtqty.getText());
        if(imgPath != null)
        {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS");
            PreparedStatement ps=cn.prepareStatement("Insert into Book_Info values(?,?,?,?,?,?,?,?)");
            InputStream img = new FileInputStream(new File(imgPath));
            ps.setString(1,isbn);
            ps.setString(2,Book_Name);
            ps.setString(3,Author_Name);
            ps.setString(4,Publisher);
            ps.setInt(5, Price);
            ps.setString(6, Edition);
            ps.setInt(7,Qty);
            ps.setBlob(8,img);
            int i = ps.executeUpdate();
            System.out.println(i+"record affected");
            JOptionPane.showMessageDialog(rootPane, "Record Inserted");
            cn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
         }else{
            JOptionPane.showMessageDialog(null, "No Image Selected");
        }
        
        imgPath = null;

        
    }//GEN-LAST:event_btnaddActionPerformed

    private void txteditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteditionActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Books_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Books_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_img;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnadd;
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
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables

}

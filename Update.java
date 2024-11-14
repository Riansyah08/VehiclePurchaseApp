/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guifp;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Update extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect() {
    try {
        String host = "jdbc:mysql://localhost:3306/guifp";
        String uname = "root";
        String upass = "";
        con = DriverManager.getConnection(host, uname, upass);
    } catch (Exception e) {
      e.printStackTrace();
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

        jsaved2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jsaved4 = new javax.swing.JTextField();
        jsaved1 = new javax.swing.JTextField();
        jcan = new javax.swing.JButton();
        jcomb1 = new javax.swing.JComboBox<>();
        jcomb2 = new javax.swing.JComboBox<>();
        jupdate = new javax.swing.JButton();
        jwarn = new javax.swing.JLabel();
        jcomb4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jconf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsaved2.setEditable(false);

        jLabel5.setText("Color:");

        jsaved4.setEditable(false);
        jsaved4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaved4ActionPerformed(evt);
            }
        });

        jsaved1.setEditable(false);
        jsaved1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaved1ActionPerformed(evt);
            }
        });

        jcan.setText("Cancel");
        jcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcanActionPerformed(evt);
            }
        });

        jcomb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Motorcycle" }));
        jcomb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomb1ActionPerformed(evt);
            }
        });

        jcomb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yamaha", "Honda", "Suzuki", "Kawasaki", "Ducati" }));
        jcomb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomb2ActionPerformed(evt);
            }
        });

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jwarn.setForeground(new java.awt.Color(255, 0, 0));
        jwarn.setText(" ");

        jcomb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "Gray", "Blue", "Purple", "Red", "Yellow", "Green" }));
        jcomb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomb4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Buy Vehicle");

        jconf.setText("Confirm");
        jconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconfActionPerformed(evt);
            }
        });

        jLabel2.setText("Vehicle:");

        jLabel3.setText("Brand:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jconf))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcomb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcomb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcomb4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsaved2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsaved1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsaved4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(jupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jwarn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jsaved1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsaved2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsaved4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jupdate)
                    .addComponent(jwarn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jconf)
                    .addComponent(jcan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsaved4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaved4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsaved4ActionPerformed

    private void jsaved1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaved1ActionPerformed

    }//GEN-LAST:event_jsaved1ActionPerformed

    private void jcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcanActionPerformed
        dispose();
        ShoppingList sl = new ShoppingList();
        sl.setVisible(true);
        sl.pack();
        sl.setLocationRelativeTo(null);
        sl.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jcanActionPerformed

    private void jcomb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb1ActionPerformed

    }//GEN-LAST:event_jcomb1ActionPerformed

    private void jcomb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomb2ActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        jsaved1.setText(jcomb1.getSelectedItem().toString());
        jsaved2.setText(jcomb2.getSelectedItem().toString());
        jsaved4.setText(jcomb4.getSelectedItem().toString());
        
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE vehicledata set " 
                + "Vehicle='"       + jsaved1.getText() + "', "
                + "Brand='"      + jsaved2.getText() + "', "
                + "Color='"   + jsaved4.getText() + "'");
            JOptionPane.showMessageDialog(null, "Vehicle Data Updated");
          } catch (Exception e) {
            e.printStackTrace();
          }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jcomb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomb4ActionPerformed

    private void jconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconfActionPerformed
        if (!jsaved1.getText().isEmpty()) {
            dispose();
            ShoppingList sl = new ShoppingList();
            sl.setVisible(true);
            sl.pack();
            sl.setLocationRelativeTo(null);
            sl.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        } else {
            jwarn.setText("please input again");
        }
    }//GEN-LAST:event_jconfActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jcan;
    private javax.swing.JComboBox<String> jcomb1;
    private javax.swing.JComboBox<String> jcomb2;
    private javax.swing.JComboBox<String> jcomb4;
    private javax.swing.JButton jconf;
    private javax.swing.JTextField jsaved1;
    private javax.swing.JTextField jsaved2;
    private javax.swing.JTextField jsaved4;
    private javax.swing.JButton jupdate;
    private javax.swing.JLabel jwarn;
    // End of variables declaration//GEN-END:variables
}
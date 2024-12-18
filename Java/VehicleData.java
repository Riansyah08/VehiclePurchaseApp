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
public class VehicleData extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    /**
     * Creates new form VehicleData
     */
    public VehicleData() {
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
        jsaved4 = new javax.swing.JTextField();
        jcomb1 = new javax.swing.JComboBox<>();
        jcomb2 = new javax.swing.JComboBox<>();
        jsave = new javax.swing.JButton();
        jwarn = new javax.swing.JLabel();
        jcomb4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jconf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsaved1 = new javax.swing.JTextField();
        jcan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsaved2.setEditable(false);

        jsaved4.setEditable(false);
        jsaved4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaved4ActionPerformed(evt);
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

        jsave.setText("Save");
        jsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaveActionPerformed(evt);
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

        jLabel5.setText("Color:");

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
                        .addGap(104, 104, 104)
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
                            .addComponent(jsaved4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jsave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jwarn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
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
                    .addComponent(jsave)
                    .addComponent(jwarn))
                .addGap(18, 18, 18)
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

    private void jcomb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb1ActionPerformed

    }//GEN-LAST:event_jcomb1ActionPerformed

    private void jcomb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomb2ActionPerformed

    private void jsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaveActionPerformed
      try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO vehicledata VALUES('" 
                + jcomb1.getSelectedItem()+ "','"
                + jcomb2.getSelectedItem() + "','"
                + jcomb4.getSelectedItem() + "')");
            stmt.close();
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
      }
        
        jsaved1.setText(jcomb1.getSelectedItem().toString());
        jsaved2.setText(jcomb2.getSelectedItem().toString());
        jsaved4.setText(jcomb4.getSelectedItem().toString());
    }//GEN-LAST:event_jsaveActionPerformed

    private void jcomb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomb4ActionPerformed

    private void jconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconfActionPerformed
    if (!jsaved1.getText().isEmpty()) {
            BuyerData bd = new BuyerData();
            dispose();
            bd.setVisible(true);
            bd.pack();
            bd.setLocationRelativeTo(null);
            bd.setDefaultCloseOperation(VehicleData.EXIT_ON_CLOSE);
        } else {
            jwarn.setText("please input again");
        }
    }//GEN-LAST:event_jconfActionPerformed

    private void jsaved1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaved1ActionPerformed

    }//GEN-LAST:event_jsaved1ActionPerformed

    private void jcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcanActionPerformed
        dispose();
        Homes hms = new Homes();
        hms.setVisible(true);
        hms.pack();
        hms.setLocationRelativeTo(null);
        hms.setDefaultCloseOperation(Homes.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jcanActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleData().setVisible(true);
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
    private javax.swing.JButton jsave;
    private javax.swing.JTextField jsaved1;
    private javax.swing.JTextField jsaved2;
    private javax.swing.JTextField jsaved4;
    private javax.swing.JLabel jwarn;
    // End of variables declaration//GEN-END:variables
}

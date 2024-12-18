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
import javax.swing.table.DefaultTableModel;
public class ShoppingList extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    private DefaultTableModel tabModel;
    /**
     * Creates new form ShoppingList
     */
    public ShoppingList() {
        initComponents();
        DoConnect();
        title();
        showdata("");
  
        jdelete.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jhome = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JTable();
        jupd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Shopping List");

        jhome.setText("Home");
        jhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhomeActionPerformed(evt);
            }
        });

        jdelete.setText("Delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle", "Brand", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jlist.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlistAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlist);
        if (jlist.getColumnModel().getColumnCount() > 0) {
            jlist.getColumnModel().getColumn(0).setResizable(false);
            jlist.getColumnModel().getColumn(1).setResizable(false);
            jlist.getColumnModel().getColumn(2).setResizable(false);
        }

        jupd.setText("Update");
        jupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdelete)
                    .addComponent(jupd))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jhome)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jdelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jupd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jhome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlistAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlistAncestorAdded

    }//GEN-LAST:event_jlistAncestorAdded

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
    try {
    int delete;
    
    if ((delete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete it?", "Confirm", JOptionPane.YES_NO_OPTION)) == 0) {
      stmt = con.createStatement();
      stmt.executeUpdate("DELETE FROM vehicledata WHERE Vehicle='"
          + tabModel.getValueAt(jlist.getSelectedRow(), 0) + "'");
      showdata("");
    }
  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistMouseClicked
        String Vehicle = jlist.getValueAt(jlist.getSelectedRow(), 0).toString();
        String Brand = jlist.getValueAt(jlist.getSelectedRow(), 1).toString();
        String Color = jlist.getValueAt(jlist.getSelectedRow(), 2).toString();
        jdelete.setEnabled(true);
    }//GEN-LAST:event_jlistMouseClicked

    private void jhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhomeActionPerformed
        dispose();
        Homes hms = new Homes();
        hms.setVisible(true);
        hms.pack();
        hms.setLocationRelativeTo(null);
        hms.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jhomeActionPerformed

    private void jupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdActionPerformed
        dispose();
        Update Ud = new Update();
        Ud.setVisible(true);
        Ud.pack();
        Ud.setLocationRelativeTo(null);
        Ud.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jupdActionPerformed
private  void title() {
Object[] title = {
    "Vehicle", "Brand", "Color"
  };
  tabModel = new DefaultTableModel(null, title);
  jlist.setModel(tabModel);
}

public void showdata(String where) {
  try {
    stmt = con.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = stmt.executeQuery("SELECT * FROM vehicledata " + where);
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("Vehicle"),
        rs.getString("Brand"),
        rs.getString("Color"),
      };
        
        tabModel.addRow(data);
    }
  } catch(Exception e) {
    e.printStackTrace();
  }
}
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
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jhome;
    private javax.swing.JTable jlist;
    private javax.swing.JButton jupd;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JOptionPane;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MenuWindow extends javax.swing.JFrame  {
         
    
    
   
    /**
     * Creates new form MenuWindow
     */
    public MenuWindow() {
        initComponents();
        
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
        jMenuBar = new javax.swing.JMenuBar();
        jMnuUsers = new javax.swing.JMenu();
        jMnuItemNewUser = new javax.swing.JMenuItem();
        jMnuItemDeleteUser = new javax.swing.JMenuItem();
        jMenuItemViewUser = new javax.swing.JMenuItem();
        jMenuInventory = new javax.swing.JMenu();
        jMnuItemInput = new javax.swing.JMenuItem();
        jMnuItemViewTools = new javax.swing.JMenuItem();
        jMnuTasks = new javax.swing.JMenu();
        jMnuItemBorrow = new javax.swing.JMenuItem();
        jMnuTools = new javax.swing.JMenu();
        jMnuItemCalc = new javax.swing.JMenuItem();
        jMnuItemNotepad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jMenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMnuUsers.setMnemonic('U');
        jMnuUsers.setText("Users");

        jMnuItemNewUser.setText("AddNew User");
        jMnuItemNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemNewUserActionPerformed(evt);
            }
        });
        jMnuUsers.add(jMnuItemNewUser);

        jMnuItemDeleteUser.setText("Delete User");
        jMnuItemDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemDeleteUserActionPerformed(evt);
            }
        });
        jMnuUsers.add(jMnuItemDeleteUser);

        jMenuItemViewUser.setText("View Users");
        jMenuItemViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewUserActionPerformed(evt);
            }
        });
        jMnuUsers.add(jMenuItemViewUser);

        jMenuBar.add(jMnuUsers);

        jMenuInventory.setMnemonic('I');
        jMenuInventory.setText("Inventory");

        jMnuItemInput.setLabel("Input Tools");
        jMnuItemInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemInputActionPerformed(evt);
            }
        });
        jMenuInventory.add(jMnuItemInput);

        jMnuItemViewTools.setText("View Tools");
        jMnuItemViewTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemViewToolsActionPerformed(evt);
            }
        });
        jMenuInventory.add(jMnuItemViewTools);

        jMenuBar.add(jMenuInventory);

        jMnuTasks.setMnemonic('T');
        jMnuTasks.setText("Tasks");

        jMnuItemBorrow.setLabel("Borrow Tools");
        jMnuItemBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemBorrowActionPerformed(evt);
            }
        });
        jMnuTasks.add(jMnuItemBorrow);

        jMenuBar.add(jMnuTasks);

        jMnuTools.setMnemonic('O');
        jMnuTools.setLabel("Tools");

        jMnuItemCalc.setText("Calculator");
        jMnuItemCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemCalcActionPerformed(evt);
            }
        });
        jMnuTools.add(jMnuItemCalc);

        jMnuItemNotepad.setText("Notepad");
        jMnuItemNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemNotepadActionPerformed(evt);
            }
        });
        jMnuTools.add(jMnuItemNotepad);

        jMenuBar.add(jMnuTools);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuItemNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemNewUserActionPerformed
       new AddNewUser().setVisible(true);
      
    }//GEN-LAST:event_jMnuItemNewUserActionPerformed

    private void jMnuItemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemInputActionPerformed
        new InputTools (). setVisible(true);
        dispose();
    }//GEN-LAST:event_jMnuItemInputActionPerformed

    private void jMnuItemDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemDeleteUserActionPerformed
        new DeleteUser().setVisible(true);
        
    }//GEN-LAST:event_jMnuItemDeleteUserActionPerformed

    private void jMenuItemViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewUserActionPerformed
        new ViewUser().setVisible(true);
        
    }//GEN-LAST:event_jMenuItemViewUserActionPerformed

    private void jMnuItemBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemBorrowActionPerformed
        new BorrowTools().setVisible(true);
        
    }//GEN-LAST:event_jMnuItemBorrowActionPerformed

    private void jMnuItemViewToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemViewToolsActionPerformed
        new ViewTools().setVisible(true);
        
    }//GEN-LAST:event_jMnuItemViewToolsActionPerformed

    private void jMnuItemCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemCalcActionPerformed
       try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error,Cannot start calculator", "Applicaton Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jMnuItemCalcActionPerformed

    private void jMnuItemNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemNotepadActionPerformed
        try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error,Cannot start notepad", "Applicaton Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jMnuItemNotepadActionPerformed

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
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuInventory;
    private javax.swing.JMenuItem jMenuItemViewUser;
    private javax.swing.JMenuItem jMnuItemBorrow;
    private javax.swing.JMenuItem jMnuItemCalc;
    private javax.swing.JMenuItem jMnuItemDeleteUser;
    private javax.swing.JMenuItem jMnuItemInput;
    private javax.swing.JMenuItem jMnuItemNewUser;
    private javax.swing.JMenuItem jMnuItemNotepad;
    private javax.swing.JMenuItem jMnuItemViewTools;
    private javax.swing.JMenu jMnuTasks;
    private javax.swing.JMenu jMnuTools;
    private javax.swing.JMenu jMnuUsers;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

      
    
   public void LoginManager(){
      jMnuUsers.setEnabled(true);
      jMenuInventory.setEnabled(true);
      jMnuTasks.setEnabled(true);
      jMnuTools.setEnabled(true);
      //jMnuHelp.setEnabled(true);
   }
   
public void LoginLaborer(){
      jMnuUsers.setEnabled(false);
      jMenuInventory.setEnabled(false);
      jMnuTasks.setEnabled(true);
      jMnuTools.setEnabled(true);
      //jMnuHelp.setEnabled(true);
}

      }
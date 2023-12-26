/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.LoginController;
import Model.Sale;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis
 */
public class Login extends javax.swing.JFrame {
    LoginController controller;
    /**
     * Creates new form Login
     */
    public Login() throws IOException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        TxtUser.setBorder(BorderFactory.createCompoundBorder(TxtUser.getBorder(), BorderFactory.createEmptyBorder(0, 13, 0, 0)));
        TxtPass.setBorder(BorderFactory.createCompoundBorder(TxtPass.getBorder(), BorderFactory.createEmptyBorder(0, 13, 0, 0)));
        controller = new LoginController();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        BtnClose = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MainBtn = new javax.swing.JPanel();
        main = new javax.swing.JLabel();
        TxtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnClose.setBackground(new java.awt.Color(255, 255, 255));
        BtnClose.setPreferredSize(new java.awt.Dimension(42, 32));

        x.setFont(new java.awt.Font("AestheticIosevka Nerd Font", 0, 18)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 0));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("x");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BtnCloseLayout = new javax.swing.GroupLayout(BtnClose);
        BtnClose.setLayout(BtnCloseLayout);
        BtnCloseLayout.setHorizontalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BtnCloseLayout.setVerticalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MainPanel.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 0, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUser.setText("User");
        jLabelUser.setAlignmentX(108.75F);
        jLabelUser.setAlignmentY(44.0F);
        MainPanel.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 217, -1, -1));

        jLabelPass.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPass.setText("Sales Manager");
        jLabelPass.setAlignmentX(108.75F);
        jLabelPass.setAlignmentY(44.0F);
        MainPanel.add(jLabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SIGN IN");
        jLabel3.setAlignmentX(108.75F);
        jLabel3.setAlignmentY(44.0F);
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 113, -1, -1));

        TxtUser.setBackground(new java.awt.Color(255, 255, 255));
        TxtUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(0, 0, 0));
        TxtUser.setToolTipText("");
        TxtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        TxtUser.setPreferredSize(new java.awt.Dimension(415, 44));
        TxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserActionPerformed(evt);
            }
        });
        MainPanel.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 108, 108));
        jLabel4.setText("Enter your credentials to access your account");
        jLabel4.setAlignmentX(108.75F);
        jLabel4.setAlignmentY(44.0F);
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        jLabel5.setAlignmentX(108.75F);
        jLabel5.setAlignmentY(44.0F);
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 318, -1, -1));

        MainBtn.setBackground(new java.awt.Color(254, 175, 0));
        MainBtn.setPreferredSize(new java.awt.Dimension(415, 44));
        MainBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainBtnMouseExited(evt);
            }
        });

        main.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setText("SIGN IN");
        main.setPreferredSize(new java.awt.Dimension(415, 44));
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MainBtnLayout = new javax.swing.GroupLayout(MainBtn);
        MainBtn.setLayout(MainBtnLayout);
        MainBtnLayout.setHorizontalGroup(
            MainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(MainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MainBtnLayout.setVerticalGroup(
            MainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(MainBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainPanel.add(MainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 419, -1, -1));

        TxtPass.setBackground(new java.awt.Color(255, 255, 255));
        TxtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        TxtPass.setPreferredSize(new java.awt.Dimension(415, 44));
        MainPanel.add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 345, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        // TODO add your handling code here:
        BtnClose.setBackground(Color.decode("#FF4141"));
        x.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        // TODO add your handling code here:
        BtnClose.setBackground(Color.decode("#FFFFFF"));
        x.setForeground(Color.decode("#000000"));
    }//GEN-LAST:event_xMouseExited

    private void xMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xMousePressed

    private void TxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserActionPerformed

    private void mainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMousePressed
        try {
            // TODO add your handling code here:
            String username = TxtUser.getText();
            String pass = TxtPass.getText();
            if (controller.UserValidate(username, pass)) {
                Main main = new Main();
                main.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no registrado, contáctese con mazapan");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainMousePressed

    private void MainBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBtnMouseEntered
        // TODO add your handling code here:
        MainBtn.setBackground(Color.decode("#FFFFFF"));
        main.setForeground(Color.decode("#000000"));
    }//GEN-LAST:event_MainBtnMouseEntered

    private void MainBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainBtnMouseExited
        // TODO add your handling code here:
        MainBtn.setBackground(Color.decode("#FEAF00"));
        main.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_MainBtnMouseExited

    private void mainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseEntered
        // TODO add your handling code here:
        MainBtn.setBackground(Color.decode("#FFFFFF"));
        main.setForeground(Color.decode("#000000"));
    }//GEN-LAST:event_mainMouseEntered

    private void mainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseExited
        // TODO add your handling code here:
        MainBtn.setBackground(Color.decode("#FEAF00"));
        main.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_mainMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnClose;
    private javax.swing.JPanel MainBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel main;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Graphics;
import java.awt.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Luis
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws ClassNotFoundException, SQLException {
        initComponents();
        setResizable(false);
        setPanel(new Home());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtomsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnSales = new javax.swing.JLabel();
        BtnHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtomsPanel.setBackground(new java.awt.Color(242, 234, 225));
        ButtomsPanel.setPreferredSize(new java.awt.Dimension(270, 900));
        ButtomsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CRUD");
        ButtomsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 18, -1, -1));

        BtnSales.setForeground(new java.awt.Color(0, 0, 0));
        BtnSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SaleBtnInactive.png"))); // NOI18N
        BtnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSalesMousePressed(evt);
            }
        });
        ButtomsPanel.add(BtnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, -1));

        BtnHome.setForeground(new java.awt.Color(0, 0, 0));
        BtnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeBtnInactive.png"))); // NOI18N
        BtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnHomeMousePressed(evt);
            }
        });
        ButtomsPanel.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SignOut.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        ButtomsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 835, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pngwing 1.png"))); // NOI18N
        ButtomsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 175, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER");
        ButtomsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USER");
        ButtomsPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 120, -1));

        getContentPane().add(ButtomsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1170, 840));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1170, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean SalePressed = false;
    private void BtnSalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalesMousePressed
        try {
            // TODO add your handling code here:
            
            BtnSales.setIcon(new ImageIcon(getClass().getResource("/Images/SaleBtnActive.png")));
            BtnHome.setIcon(new ImageIcon(getClass().getResource("/Images/HomeBtnInactive.png")));
            SalePressed = true;
            
            setPanel(new Sales());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnSalesMousePressed
    boolean HomePressed = false;
    private void BtnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMousePressed
        try {
            // TODO add your handling code here:
            BtnHome.setIcon(new ImageIcon(getClass().getResource("/Images/HomeBtnActive.png")));
            BtnSales.setIcon(new ImageIcon(getClass().getResource("/Images/SaleBtnInactive.png")));
            HomePressed = true;
            setPanel(new Home());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnHomeMousePressed

    private void BtnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMouseEntered
        // TODO add your handling code here:
        if (HomePressed == false) {
            BtnHome.setIcon(new ImageIcon(getClass().getResource("/Images/HomeBtnHoverActive.png")));
        }
    }//GEN-LAST:event_BtnHomeMouseEntered

    private void BtnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMouseExited
        // TODO add your handling code here:
        if (HomePressed == false) {
            BtnHome.setIcon(new ImageIcon(getClass().getResource("/Images/HomeBtnInactive.png")));
        }
    }//GEN-LAST:event_BtnHomeMouseExited

    private void BtnSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalesMouseEntered
        // TODO add your handling code here:
        if (SalePressed == false) {
            BtnSales.setIcon(new ImageIcon(getClass().getResource("/Images/SaleBtnHoverActive.png")));
        }
    }//GEN-LAST:event_BtnSalesMouseEntered

    private void BtnSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalesMouseExited
        // TODO add your handling code here:
        if (SalePressed == false) {
            BtnSales.setIcon(new ImageIcon(getClass().getResource("/Images/SaleBtnInactive.png")));
        }
        
    }//GEN-LAST:event_BtnSalesMouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private void setPanel(JComponent com) {
        MainPanel.removeAll();
        MainPanel.add(com);
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnHome;
    private javax.swing.JLabel BtnSales;
    private javax.swing.JPanel ButtomsPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

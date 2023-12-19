/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ClientController;
import Controller.LoginController;
import Controller.ProductController;
import Controller.SupplierController;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class Home extends javax.swing.JPanel {

    LoginController loginController = new LoginController();
    SupplierController supplierController = new SupplierController();
    ClientController clientController = new ClientController();
    ProductController productController = new ProductController();
    /**
     * Creates new form Sales
     */
    public Home() throws ClassNotFoundException, SQLException {
        initComponents();
        UserCount.setText(String.valueOf(loginController.UsersCount()));
        SupplierCount.setText(String.valueOf(supplierController.CountSuppliers()));
        CustomerCount.setText(String.valueOf(clientController.CountClients()));
        ProductoCount.setText(String.valueOf(productController.CountProducts()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CountUsersPanel = new javax.swing.JPanel();
        UserCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CountSuppliersPanel = new javax.swing.JPanel();
        SupplierCount = new javax.swing.JLabel();
        CountCustomersPanel = new javax.swing.JPanel();
        CustomerCount = new javax.swing.JLabel();
        CountProductPanel = new javax.swing.JPanel();
        ProductoCount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CountUsersPanel.setBackground(new java.awt.Color(254, 175, 0));
        CountUsersPanel.setPreferredSize(new java.awt.Dimension(255, 157));
        CountUsersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserCount.setBackground(new java.awt.Color(0, 0, 0));
        UserCount.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        UserCount.setForeground(new java.awt.Color(0, 0, 0));
        UserCount.setText("00");
        CountUsersPanel.add(UserCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserIcon.png"))); // NOI18N
        CountUsersPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        add(CountUsersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 250, 130));

        CountSuppliersPanel.setBackground(new java.awt.Color(254, 251, 236));
        CountSuppliersPanel.setPreferredSize(new java.awt.Dimension(255, 157));
        CountSuppliersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SupplierCount.setBackground(new java.awt.Color(0, 0, 0));
        SupplierCount.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        SupplierCount.setForeground(new java.awt.Color(0, 0, 0));
        SupplierCount.setText("00");
        CountSuppliersPanel.add(SupplierCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        add(CountSuppliersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 250, 130));

        CountCustomersPanel.setBackground(new java.awt.Color(254, 246, 251));
        CountCustomersPanel.setPreferredSize(new java.awt.Dimension(255, 157));
        CountCustomersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerCount.setBackground(new java.awt.Color(0, 0, 0));
        CustomerCount.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        CustomerCount.setForeground(new java.awt.Color(0, 0, 0));
        CustomerCount.setText("00");
        CountCustomersPanel.add(CustomerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        add(CountCustomersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 250, 130));

        CountProductPanel.setBackground(new java.awt.Color(240, 249, 255));
        CountProductPanel.setPreferredSize(new java.awt.Dimension(255, 157));
        CountProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductoCount.setBackground(new java.awt.Color(0, 0, 0));
        ProductoCount.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        ProductoCount.setForeground(new java.awt.Color(0, 0, 0));
        ProductoCount.setText("00");
        CountProductPanel.add(ProductoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        add(CountProductPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 130));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CountCustomersPanel;
    private javax.swing.JPanel CountProductPanel;
    private javax.swing.JPanel CountSuppliersPanel;
    private javax.swing.JPanel CountUsersPanel;
    private javax.swing.JLabel CustomerCount;
    private javax.swing.JLabel ProductoCount;
    private javax.swing.JLabel SupplierCount;
    private javax.swing.JLabel UserCount;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

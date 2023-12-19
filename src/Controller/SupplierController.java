/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Supplier;
import Model.SupplierDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class SupplierController {
    SupplierDAO dao ;
    
    public SupplierController() {
        dao = new SupplierDAO();
    }
    public ArrayList<Supplier> getAllSuppliers() throws ClassNotFoundException, SQLException {
        return dao.getAllSuppliers();
    }
    
    public int CountSuppliers() throws ClassNotFoundException, SQLException{
        return dao.getAllSuppliers().size();
    }
}

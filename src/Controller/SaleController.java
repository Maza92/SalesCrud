/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Sale;
import Model.SaleDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class SaleController {
    SaleDAO dao;
    
    public SaleController() {
        dao = new SaleDAO();
    }
    public boolean addSale(Sale sale) throws ClassNotFoundException, SQLException {
        return dao.registerSale(sale);
    }
    public ArrayList<Sale> getAllSales() throws ClassNotFoundException, SQLException {
        return dao.getAllSales();
    }
    public int CountSales() throws ClassNotFoundException, SQLException {
        return dao.getAllSales().size();
    }
}

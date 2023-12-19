/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Product;
import Model.ProductDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class ProductController {
    ProductDAO dao;
    public ProductController() {
        dao = new ProductDAO();
    }
    
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        return dao.getAllProducts();
    }
    
    public int CountProducts() throws SQLException, ClassNotFoundException {
        return dao.getAllProducts().size();
    }
}

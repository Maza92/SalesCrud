/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Luis
 */
public class ProductDAO {
    DatabaseConnector conector = new DatabaseConnector();
    
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        ArrayList<Product> list = new ArrayList<>();
        Connection con = conector.getConnection();
        String consult = "SELECT * FROM Product";
        PreparedStatement ps = con.prepareStatement(consult);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Product product = new Product();
            product.setId(rs.getInt("id_Product"));
            product.setName(rs.getString("product_Name"));
            product.setDescription(rs.getString("product_Description"));
            product.setPrice(rs.getDouble("price"));
            product.setStock(rs.getInt("stock"));
            product.setDate(rs.getDate("product_Date").toLocalDate());
            product.setState(rs.getString("product_State"));
            product.setIdCategory(rs.getInt("id_Category"));
            product.setIdSupplier(rs.getInt("id_Supplier"));
            list.add(product);
        }
        return list;
    }
}

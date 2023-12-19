/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Luis
 */
public class SupplierDAO {
    DatabaseConnector conector = new DatabaseConnector();
    
    public ArrayList<Supplier> getAllSuppliers() throws ClassNotFoundException, SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection con = conector.getConnection();
        String consult = "SELECT * FROM Supplier";
        
        PreparedStatement ps = con.prepareStatement(consult);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            Supplier supplier = new Supplier();
            supplier.setId(rs.getInt("id_Supplier"));
            supplier.setCompanyName(rs.getString("company_Name"));
            supplier.setAddress(rs.getString("supplier_Address"));
            supplier.setCity(rs.getString("city"));
            supplier.setCountry(rs.getString("coutry"));
            supplier.setPhone(rs.getString("phone"));
            list.add(supplier);
        }
        return list;
    }
}

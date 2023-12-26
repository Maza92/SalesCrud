/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author Luis
 */
public class SaleDAO {
    DatabaseConnector conection = new DatabaseConnector();

    public boolean registerSale(Sale sale) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection con = conection.getConnection();
        String sql = "INSERT INTO Sales(date_sale, unit_price, total_sale, id_product, id_payment_method, shipping_Address, state_sale) VALUES (?, ?, ?, ?, ?, ?, ?)";

        ps = con.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(sale.getDate()));
        ps.setBigDecimal(2, BigDecimal.valueOf(sale.getUnitPrice())); 
        ps.setBigDecimal(3, BigDecimal.valueOf(sale.getTotalSale()));
        ps.setInt(4, sale.getIdProduct());
        ps.setInt(5, sale.getIdpaymentMethod());
        ps.setString(6, sale.getShippingAddress());
        ps.setString(7, sale.getState());

        return ps.executeUpdate() > 0; 
    }
    public ArrayList<Sale> getAllSales() throws ClassNotFoundException, SQLException {
        ArrayList<Sale> list = new ArrayList<>();
        Connection con = conection.getConnection();
        String cosult = "SELECT * FROM Sales";
        
        PreparedStatement ps = con.prepareStatement(cosult);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            Sale sale = new Sale();
            sale.setId(rs.getInt("id_Sale"));
            sale.setDate(rs.getDate("date_Sale").toLocalDate());
            sale.setUnitPrice(rs.getDouble("unit_Price"));
            sale.setTotalSale(rs.getDouble("total_Sale"));
            sale.setIdProduct(rs.getInt("id_product"));
            sale.setIdpaymentMethod(rs.getInt("id_Payment_method"));
            sale.setShippingAddress(rs.getString("shipping_Address"));
            sale.setState(rs.getString("state_Sale"));
            
            list.add(sale);
        }
        return list;
    }

}

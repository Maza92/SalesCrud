/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class SaleDAO {
    DatabaseConnector conection = new DatabaseConnector();

    public boolean registerSale(Sale sale) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection con = conection.getConnection();
        String sql = "INSERT INTO Sales(date_sale, unit_price, total_sale, id_client, id_payment_method, shipping_Address, state_sale) VALUES (?, ?, ?, ?, ?, ?, ?)";

        ps = con.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(sale.getDate()));
        ps.setBigDecimal(2, BigDecimal.valueOf(sale.getUnitPrice())); 
        ps.setBigDecimal(3, BigDecimal.valueOf(sale.getTotalSale()));
        ps.setInt(4, sale.getIdClient());
        ps.setInt(5, sale.getIdpaymentMethod());
        ps.setString(6, sale.getShippingAddress());
        ps.setString(7, sale.getState());

        return ps.executeUpdate() > 0; 
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 *
 * @author Luis
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SaleDAO dao = new SaleDAO();
        
        Sale sale = new Sale();
        sale.setDate(LocalDate.now());
        sale.setUnitPrice(10);
        sale.setTotalSale(10);
        sale.setIdClient(2);
        sale.setIdpaymentMethod(2);
        sale.setShippingAddress("blablabla");
        sale.setState("pendiente");
        
        
        
        if (dao.registerSale(sale) == true) {
            System.out.println("Sale registrado");
        } else {
            System.out.println("sale no registrado!!!!!");
        }
    }
}

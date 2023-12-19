/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Luis
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SupplierDAO dao = new SupplierDAO();
        ArrayList<Supplier> list = dao.getAllSuppliers();
        
        for (Supplier user : list) {
            System.out.println(user.getCompanyName());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Luis
 */
public class ClientDAO {
    DatabaseConnector conector = new DatabaseConnector();
    
    public ArrayList<Client> getAllClients() throws ClassNotFoundException, SQLException {
        ArrayList<Client> list = new ArrayList<>();
        Connection con = conector.getConnection();
        String consult = "SELECT * FROM Customer";
        
        PreparedStatement ps = con.prepareStatement(consult);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            Client client = new Client();
            
            client.setId(rs.getInt("id_Customer"));
            client.setName(rs.getString("customer_name"));
            client.setLasName(rs.getString("lastname"));
            client.setEmail(rs.getString("mail"));
            client.setPhone(rs.getString("phone"));
            client.setAddress(rs.getString("adress"));
            client.setCity(rs.getString("city"));
            client.setCountry(rs.getString("country"));
            client.setSaleId(rs.getInt("id_Sale"));
            list.add(client);
        }
        return list;
    }
    
}

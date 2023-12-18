/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class UserDAO {
    
    public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException {
        ArrayList<User> user_List = new ArrayList<>();
        DatabaseConnector conector = new DatabaseConnector();
        Connection con = conector.getConnection();
        String consult = "SELECT * FROM User_Admin";
        
        PreparedStatement ps = con.prepareStatement(consult);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            User user = new User();
            user.setId(rs.getInt("id_User"));
            user.setUserName(rs.getString("name_User"));
            user.setPassword(rs.getString("user_Password"));
            user.setEntriDate(rs.getDate("entri_Date").toLocalDate());
            user.setExitDate(rs.getDate("exit_Date").toLocalDate());
            
            user_List.add(user);
        }
        
        return user_List;
    }
}

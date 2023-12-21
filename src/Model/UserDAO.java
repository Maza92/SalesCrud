/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */

public class UserDAO {
    DatabaseConnector conector = new DatabaseConnector();
    
    public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException {
        ArrayList<User> user_List = new ArrayList<>();
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
    public Client getUser(int id) throws ClassNotFoundException, SQLException {
        Connection con = conector.getConnection();
        //String consult = "SELECT * FORM User_Admin WHERE User_Admin.id_User = "
        return null;
    }
    public boolean setUser(User user) throws ClassNotFoundException, SQLException {
        Connection con = conector.getConnection();
        String consult = "INSER INTO User_Admin(name_User,userPassword,entri_Date,exit_Date) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(consult);
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getPassword());
        ps.setDate(3, java.sql.Date.valueOf(user.getEntriDate()));
        ps.setDate(4, java.sql.Date.valueOf(user.getExitDate()));
        
        return ps.executeUpdate() > 0; 
    }
    public boolean UserValidate(String userName, String password) throws ClassNotFoundException, SQLException {
        Connection con = conector.getConnection();
        String consult = "{call UserValidate(?,?)}";
        CallableStatement cs = con.prepareCall(consult);
        cs.setString(1, userName);
        cs.setString(2, password);
        ResultSet rs = cs.executeQuery();
        
        if (rs.next()) {
            if (rs.getInt("UsuarioValido") == 1) {
                return true;
            } 
        }
        return false;
    }
}

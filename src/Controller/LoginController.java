/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import Model.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Luis
 */
public class LoginController {
    private UserDAO dao;
    public LoginController() {
        dao = new UserDAO();
    }
    public ArrayList<User> getUsers() throws ClassNotFoundException, SQLException {
        return dao.getAllUsers();
    }
    
    public boolean setUser(User user) throws ClassNotFoundException, SQLException {
        return dao.setUser(user);
    }
    public boolean UserValidate(String name, String pass) throws ClassNotFoundException, SQLException {
        ArrayList<User> usersList = getUsers();
        
        for (User user : usersList) {
            if (name.equals(user.getUserName()) && pass.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
    public int UsersCount() throws ClassNotFoundException, SQLException {
        ArrayList<User> usersList = getUsers();
        return usersList.size();
    }
}

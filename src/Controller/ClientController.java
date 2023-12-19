/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Client;
import Model.ClientDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class ClientController {
    ClientDAO dao;
    
    public ClientController() {
        dao = new ClientDAO();
    }
    
    public ArrayList<Client> getAllClients() throws ClassNotFoundException, SQLException {
        return dao.getAllClients();
    }
    
    public int CountClients() throws ClassNotFoundException, SQLException {
        return dao.getAllClients().size();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import  java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author Luis
 */
public class DatabaseConnector {
    private String base = "SalesManager";
    private String url = "jdbc:sqlserver://DESKTOP-FG8MLK9;databaseName=" + base + ";integratedSecurity=true;encrypt=false;";

    private Connection con = null;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = (Connection) DriverManager.getConnection(this.url, "", "");
            
        return con;
    }
}
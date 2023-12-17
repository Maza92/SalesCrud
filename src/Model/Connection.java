/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Luis
 */
public class Connection {
    private String base = "SalesManager";
    private String user = "mazapandb";
    private String password = "edison12";
    private String url = "jdbc:sqlserver://localhost:1433;databasename=" + base;
    private Connection con = null;
    
    public Connection getConnection() throws ClassNotFoundException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(this.url, this.user, this.password);
            
        return con;
    }
}

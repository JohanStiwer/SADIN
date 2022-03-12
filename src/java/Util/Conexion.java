package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private String driver, user, pass, url;
    private Connection cnt;
    
    
    public Conexion(){
        
        driver = "com.mysql.cj.jdbc.Driver";
        user = "root";
        pass = "";
        url = "jdbc:mysql://localhost:3306/sadin";
        
        try {
            Class.forName(driver);
            cnt = DriverManager.getConnection(url,user,pass);
            System.out.println("Connect...");
        } catch (Exception ex) {
            System.out.println("Oop, Error...");
        }
    }
    
    public Connection conectar(){
        return cnt;
    }
    
    public Connection cerrar() throws Exception{
        cnt.close();
        return null;
    }
    
    public static void main(String[] args){
        new Conexion();
    }
}

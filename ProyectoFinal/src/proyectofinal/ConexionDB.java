/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Marco
 */
public class ConexionDB {
    public Connection con;
    
    public ConexionDB(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mifinaldb","root","nicareu20");  
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }
    
    public void cerrar(){
        try{ 
            con.close();
        }catch(Exception e){ 
            System.out.println(e);
        }
    }
    
    
    public void insertUpdate(String sql){
        try{

           Statement stmt = con.createStatement();
           stmt.executeUpdate(sql);
        }catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public ResultSet select(String sql){
        try{ 

            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery(sql);  
            return rs;
        }catch(Exception e){ 
            System.out.println(e);
        }
        return null;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Koneksi {
    static Connection con;
    public static Connection getConnection()
    {
        if(con == null)
        {
            MysqlDataSource data = new MysqlDataSource(); 
           data.setDatabaseName("db_dutacoding");
           data.setUser("root");
           data.setPassword("");
           
           try 
           {
               con = data.getConnection();
               System.out.println("Connection Succes! ");
           } catch(SQLException e)
               
           {
               System.out.println("Failed connect");
           }
        }
        return con;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql.project;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Jaanvi
 */
public class Mysqlcon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
            while(rs.next())
                System.out.println(rs.getString("first_name"));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
    
}

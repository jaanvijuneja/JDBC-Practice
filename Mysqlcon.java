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
             Scanner s = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
            Statement stmt = con.createStatement();
            char gender1 = s.next().charAt(0);
            String dept1 = s.next();
            ResultSet rs = stmt.executeQuery("select * from employee where gender like '"+gender1+"' && dept like '"+dept1+"'");
            while(rs.next()==true)
                System.out.println("Employee id:"+rs.getString("emp_no")+" Name:"+rs.getString("first_name")+" "+rs.getString("last_name"));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
    
}

package Employeee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","");
            s = c.createStatement();
            
            if(c != null)
                System.out.println("connected");
                
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 





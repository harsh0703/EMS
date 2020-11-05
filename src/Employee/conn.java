/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.sql.*; //Importing sql library for using MySQL commands

/**
 *
 * @author HARSH PAGARIA
 */
public class conn {
    
    //2 interfaces c(Connection) and s(Statement)
    public Connection c; // For establishing connection with MySQL
    public Statement s;//For executing MySQL queries
    
    public conn(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");//Registering MySQL drivers in the project
            //Now, using connection interface
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root","");//setting up the connection
            s = c.createStatement();//Generating statement
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

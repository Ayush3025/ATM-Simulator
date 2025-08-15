package bank.management.system;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/*************************************************************
 Developer Name : Ayush Tiwari
 Developer Contact : ayushtiwari3012004@gmail.com
 Created on : 09-06-2025 21:03
 Project Name : Bank Management System
 *************************************************************/
public class DBCon {
    Connection connection;
    Statement statement;

    public DBCon(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","root");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package br.com.kingsman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Database {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.oracle.database.jdbc");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/root","root","99154700");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

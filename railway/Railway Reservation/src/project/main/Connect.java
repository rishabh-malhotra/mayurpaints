/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.main;

/**
 *
 * @author VIKAS KUMAR
 */
import java.sql.*;
public class Connect
{
public Connection con;
public Connect()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Railway.mdb;DriverID=22");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}
}

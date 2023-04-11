package com.nacre.cust.daoImpl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 *  driverClassName="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/cust_service_desk"
    username="root" 
    password="admin"
 */
public class ConnectionTest {
	public static Connection putConnection(){
		Connection con=null;
		try{
	    		 Class.forName("com.mysql.jdbc.Driver");
	    		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cust_service_desk","root","admin");
		}
		catch(ClassNotFoundException | SQLException e){
	    		 e.printStackTrace();
	    }//catch
		return con;
	}//putConnection

}




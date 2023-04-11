package com.nacre.cust.daoImpl;
/*
 * CREATE TABLE ser_cust_domain (
              ser_cust_dom_id INT NOT NULL AUTO_INCREMENT,
              ser_cust_dom_phno BIGINT(10) NOT NULL,
              ser_cust_dom_name VARCHAR(45) NOT NULL,
              ser_cust_dom_email VARCHAR(65) NOT NULL,
              ser_cust_dom_addr VARCHAR(245) NOT NULL,
              ser_cust_id INT NOT NULL,
              PRIMARY KEY (ser_cust_dom_id),
              FOREIGN KEY ( ser_cust_id) REFERENCES service_cust(ser_cust_id)
            );
 */
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.cust.dto.CustServiceDomDto;


public class CustServiceDomDao {
        private static final String INSERT_SER_CUST_DOM_SQL = "INSERT INTO ser_cust_domain" + 
	           "(ser_cust_dom_phno,ser_cust_dom_name,ser_cust_dom_email,ser_cust_dom_addr,ser_cust_id) VALUES " +
		        " (?,?,?,?,?);";

		 private static final String SELECT_ALL_SER_CUST_DOM= "select  ser_cust_dom_id,ser_cust_dom_phno,ser_cust_dom_name,ser_cust_dom_email,ser_cust_dom_addr from ser_cust_domain";
		 
		 public void insertserdom(CustServiceDomDto serdom) throws SQLException {
		        // System.out.println(INSERT_USERS_SQL);
		        // try-with-resource statement will auto close the connection.
		        try (Connection connection =ConnectionTest.putConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SER_CUST_DOM_SQL)) {
		            preparedStatement.setLong(1,serdom.getSer_cust_dom_phno());
		            preparedStatement.setString(2,serdom.getSer_cust_dom_name());
		            preparedStatement.setString(3, serdom.getSer_cust_dom_email());
		            preparedStatement.setString(4, serdom.getSer_cust_dom_addr());		        
		            preparedStatement.setInt(5, serdom.getSer_cust_id());
		            
		            //System.out.println(preparedStatement);
		            preparedStatement.executeUpdate();
		            } 
		        catch (SQLException e) {
		        	printSQLException(e);
		        }
		    }
		 public List < CustServiceDomDto > selectAllCustServiceDom() {

		        // using try-with-resources to avoid closing resources 
		        List < CustServiceDomDto  > serdom = new ArrayList < > ();
		        // Step 1: Establishing a Connection
		        try (Connection connection = ConnectionTest.putConnection();

		        // Step 2:Create a statement using connection object
		        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SER_CUST_DOM);) {
		     
		        // Step 3: Execute the query or update query
		        ResultSet rs = preparedStatement.executeQuery();

		        // Step 4: Process the ResultSet object.
		        //ser_cust_dom_id,ser_cust_dom_phno,ser_cust_dom_name,ser_cust_dom_email,ser_cust_dom_addr
		           while (rs.next()) {
		        	    int ser_cust_dom_id=rs.getInt("ser_cust_dom_id");
		        	    Long ser_cust_dom_phno =rs.getLong("ser_cust_dom_phno");
		                String ser_cust_dom_name= rs.getString("ser_cust_dom_name");
		                String ser_cust_dom_email = rs.getString("ser_cust_dom_email");		               
		                String ser_cust_dom_addr = rs.getString("ser_cust_dom_addr");
		                
		                serdom.add(new CustServiceDomDto(ser_cust_dom_id, ser_cust_dom_name, ser_cust_dom_phno,ser_cust_dom_email,ser_cust_dom_addr));
		            }
		        } 
		        catch (SQLException e) {
		            printSQLException(e);
		        }
		        return serdom;
		    }
		 private void printSQLException(SQLException ex) {
		        for (Throwable e: ex) {
		            if (e instanceof SQLException) {
		                e.printStackTrace(System.err);
		                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
		                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
		                System.err.println("Message: " + e.getMessage());
		                Throwable t = ex.getCause();
		                while (t != null) {
		                    System.out.println("Cause: " + t);
		                    t = t.getCause();
		                }
		            }
		        }
		    }
}

package com.nacre.cust.daoImpl;
/*
 * CREATE TABLE service_cust (
                  ser_cust_id INT NOT NULL AUTO_INCREMENT,
                  ser_cust_name VARCHAR(45) NOT NULL,
                  ser_cust_dor DATE NOT NULL,
                  ser_cust_addr VARCHAR(255) NOT NULL,
                  ser_cust_phno BIGINT(10) NOT NULL,
                  ser_cust_email VARCHAR(55) NOT NULL,
                  cust_id INT ,
                  PRIMARY KEY (ser_cust_id),
                  FOREIGN KEY ( cust_id) REFERENCES cust_master(cust_id)
             );
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.cust.dto.CustServiceDto;


public class CustServiceDao {
	     private static final String INSERT_SER_CUST_SQL = "INSERT INTO service_cust" + 
	           "(ser_cust_name,ser_cust_dor,ser_cust_addr ,ser_cust_phno,ser_cust_email,cust_id) VALUES " +
		        " (?,?,?,?,?,?);";

		 private static final String SELECT_ALL_SER_CUST= "select  ser_cust_id,ser_cust_name,ser_cust_dor,ser_cust_addr,ser_cust_phno,ser_cust_email from service_cust";
		 
		 public void insertser(CustServiceDto ser) throws SQLException {
		        // System.out.println(INSERT_USERS_SQL);
		        // try-with-resource statement will auto close the connection.
			    java.util.Date date=new java.util.Date();
			 
			    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		        try (Connection connection =ConnectionTest.putConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SER_CUST_SQL)) {
		            preparedStatement.setString(1,ser.getSer_cust_name());
		            preparedStatement.setDate(2,sqlDate);
		            preparedStatement.setString(3, ser.getSer_cust_addr());
		            preparedStatement.setLong(4, ser.getSer_cust_phno());
		            preparedStatement.setString(5, ser.getSer_cust_email());
		            preparedStatement.setInt(6, ser.getCust_id());
		            System.out.println(preparedStatement);
		            preparedStatement.executeUpdate();
		            } 
		        catch (SQLException e) {
		        	printSQLException(e);
		        }
		    }
		 public List < CustServiceDto > selectAllCustServices() {

		        // using try-with-resources to avoid closing resources (boiler plate code)
		        List < CustServiceDto  > ser = new ArrayList < > ();
		        // Step 1: Establishing a Connection
		        try (Connection connection = ConnectionTest.putConnection();

		        // Step 2:Create a statement using connection object
		        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SER_CUST);) {
		     
		        // Step 3: Execute the query or update query
		        ResultSet rs = preparedStatement.executeQuery();

		        // Step 4: Process the ResultSet object.
		        //public FeedbackDto(Date feedback_date, String feedback_text, String email_id, int cust_id, int comp_reg_id) {
		           while (rs.next()) {
		        	    int ser_cust_id=rs.getInt("ser_cust_id");
		        	    String ser_cust_name =rs.getString("ser_cust_name");
		                Date ser_cust_dor= rs.getDate("ser_cust_dor");
		                String ser_cust_addr = rs.getString("ser_cust_addr");
		                long ser_cust_phno=rs.getLong("ser_cust_phno");
		                String ser_cust_email = rs.getString("ser_cust_email");
		                
		                ser.add(new CustServiceDto(ser_cust_id, ser_cust_name, ser_cust_dor,ser_cust_addr,ser_cust_phno,ser_cust_email));
		            }
		        } 
		        catch (SQLException e) {
		            printSQLException(e);
		        }
		        return ser;
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

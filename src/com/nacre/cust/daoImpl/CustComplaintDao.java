package com.nacre.cust.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.cust.dto.ComplaintDto;


/*
 * CREATE TABLE cust_comp_reg (
             cust_comp_reg_id INT NOT NULL AUTO_INCREMENT,
             comp_date DATE NOT NULL,
             text_of_comp VARCHAR(225) NOT NULL,
             cust_id INT NOT NULL,
             ser_cust_dom_id INT NOT NULL,
             PRIMARY KEY (cust_comp_reg_id),
             FOREIGN KEY ( cust_id) REFERENCES cust_master(cust_id),
             FOREIGN KEY ( ser_cust_dom_id) REFERENCES ser_cust_domain(ser_cust_dom_id)
             );
 */

public class CustComplaintDao {
	     private static final String INSERT_COMPLAINT_SQL = "INSERT INTO cust_comp_reg" + 
	           "(comp_date,text_of_comp,cust_id,ser_cust_dom_id) VALUES " +
		        " (?,?,?,?);";

		 private static final String SELECT_ALL_COMPLAINTS = "select  cust_comp_reg_id,comp_date,text_of_comp,cust_id from cust_comp_reg";
		 
		 public void insertcomp(ComplaintDto comp) throws SQLException {
		        // System.out.println(INSERT_USERS_SQL);
		        // try-with-resource statement will auto close the connection.
			    java.util.Date date=new java.util.Date();
			 
			    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		        try (Connection connection =ConnectionTest.putConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COMPLAINT_SQL)) {
		            preparedStatement.setDate(1,sqlDate);
		            preparedStatement.setString(2, comp.getText_of_comp());
		            preparedStatement.setInt(3, comp.getCust_id());
		            preparedStatement.setInt(4, comp.getSer_cust_dom_id());
		            System.out.println(preparedStatement);
		            preparedStatement.executeUpdate();
		            } 
		        catch (SQLException e) {
		        	printSQLException(e);
		        }
		    }
		 public List < ComplaintDto > selectAllComplaints() {

		        // using try-with-resources to avoid closing resources (boiler plate code)
		        List < ComplaintDto > comp = new ArrayList < > ();
		        // Step 1: Establishing a Connection
		        try (Connection connection = ConnectionTest.putConnection();

		        // Step 2:Create a statement using connection object
		        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COMPLAINTS);) {
		     
		        // Step 3: Execute the query or update query
		        ResultSet rs = preparedStatement.executeQuery();

		        // Step 4: Process the ResultSet object.
		        //public FeedbackDto(Date feedback_date, String feedback_text, String email_id, int cust_id, int comp_reg_id) {
		           while (rs.next()) {
		        	    int cust_comp_reg_id= rs.getInt("cust_comp_reg_id");
		                Date comp_date= rs.getDate("comp_date");
		                String text_of_comp = rs.getString("text_of_comp");
		                int cust_id = rs.getInt("cust_id");
		                
		                comp.add(new ComplaintDto(cust_comp_reg_id, comp_date, text_of_comp,cust_id));
		            }
		        } 
		        catch (SQLException e) {
		            printSQLException(e);
		        }
		        return comp;
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

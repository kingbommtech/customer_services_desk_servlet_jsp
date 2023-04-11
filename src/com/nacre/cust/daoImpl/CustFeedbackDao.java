package com.nacre.cust.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.cust.dto.FeedbackDto;

/*
 *              CREATE TABLE cust_feedback_master (
                              feedback_id  INT NOT NULL AUTO_INCREMENT,
                              feedback_date  DATE NOT NULL,
                              feedback_text  VARCHAR(225) NOT NULL,
                              email_id  VARCHAR(60) NOT NULL,
                              cust_id int,
                              cust_comp_reg_id INT,
                              PRIMARY KEY (feedback_id),
                              FOREIGN KEY ( cust_id) REFERENCES cust_master( cust_id),
                              FOREIGN KEY ( cust_comp_reg_id) REFERENCES cust_comp_reg( cust_comp_reg_id)
                              );
 */

public class CustFeedbackDao {
     private static final String INSERT_FEEDBACK_SQL = "INSERT INTO cust_feedback_master" + 
           "(feedback_date,feedback_text,email_id,cust_id,cust_comp_reg_id) VALUES " +
	        " (?,?,?,?,?);";

	 private static final String SELECT_ALL_FEEDBACKS = "select  feedback_date,feedback_text,email_id,cust_id,cust_comp_reg_id from cust_feedback_master";
	 
	 public void insertfb(FeedbackDto fb) throws SQLException {
	        // System.out.println(INSERT_USERS_SQL);
	        // try-with-resource statement will auto close the connection.
		    java.util.Date date=new java.util.Date();
		 
		    java.sql.Date sqlDate=new java.sql.Date(date.getTime());
	        try (Connection connection =ConnectionTest.putConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FEEDBACK_SQL)) {
	            preparedStatement.setDate(1,sqlDate);
	            preparedStatement.setString(2, fb.getFeedback_text());
	            preparedStatement.setString(3, fb.getEmail_id());
	            preparedStatement.setInt(4, fb.getCust_id());
	            preparedStatement.setInt(5, fb.getComp_reg_id());
	            System.out.println(preparedStatement);
	            preparedStatement.executeUpdate();
	            } 
	        catch (SQLException e) {
	        	printSQLException(e);
	        }
	    }
	 public List < FeedbackDto > selectAllFeedbacks() {

	        // using try-with-resources to avoid closing resources (boiler plate code)
	        List < FeedbackDto > fbs = new ArrayList < > ();
	        // Step 1: Establishing a Connection
	        try (Connection connection = ConnectionTest.putConnection();

	        // Step 2:Create a statement using connection object
	        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FEEDBACKS);) {
	     
	        // Step 3: Execute the query or update query
	        ResultSet rs = preparedStatement.executeQuery();

	        // Step 4: Process the ResultSet object.
	        //public FeedbackDto(Date feedback_date, String feedback_text, String email_id, int cust_id, int comp_reg_id) {
	           while (rs.next()) {
	                Date feedback_date= rs.getDate("feedback_date");
	                String feedback_text = rs.getString("feedback_text");
	                String email_id = rs.getString("email_id");
	                int cust_id = rs.getInt("cust_id");
	                int comp_reg_id= rs.getInt("cust_comp_reg_id");
	                fbs.add(new FeedbackDto(feedback_date, feedback_text, email_id,cust_id,comp_reg_id));
	            }
	        } 
	        catch (SQLException e) {
	            printSQLException(e);
	        }
	        return fbs;
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

package com.nacre.cust.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.cust.dto.CustDto;



public class CustDao {
	private static final String SELECT_ALL_CUST = "select cust_id,Cust_name,Cust_phno,cust_addr from cust_master";
	public List < CustDto > selectAllCust() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < CustDto > cust = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection =ConnectionTest.putConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUST);) {
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("cust_id");
                String name = rs.getString("Cust_name");
                long phno = rs.getLong("Cust_phno");
                String addr=rs.getString("cust_addr");
                cust.add(new CustDto(id, name, phno,addr));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return cust;
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

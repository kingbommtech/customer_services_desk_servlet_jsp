package com.nacre.cust.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nacre.cust.bo.CustRegistrationBo;


public class CustRegitrationDao {
	Connection con=null;
	PreparedStatement ps=null;
	static final String INSERT_QUERY1="insert into cust_master"+
	     "(cust_name,cust_phno,cust_photo,cust_dob,cust_email,cust_addr,cust_uname,cust_pass)"+
		 " values(?,?,?,?,?,?,?,?)";
	
	public int insert(CustRegistrationBo custregBo){
		int res=0;
		con=ConnectionTest.putConnection();
		try {
			ps=con.prepareStatement(INSERT_QUERY1);
			ps.setString(1, custregBo.getFname());
			ps.setLong(2, custregBo.getPhone());
			ps.setString(5, custregBo.getEmail());
			ps.setBinaryStream(3, custregBo.getPhoto(), (int)custregBo.getFile().length());
			ps.setDate(4, custregBo.getDob());
			ps.setString(6,custregBo.getAddr() );
			ps.setString(7, custregBo.getUname());
			ps.setString(8, custregBo.getPass());
			res=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}

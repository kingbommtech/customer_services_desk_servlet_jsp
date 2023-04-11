package com.nacre.cust.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.cust.daoImpl.CustServiceDao;
import com.nacre.cust.dto.CustServiceDto;



@WebServlet("/serinsert")
public class CustServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CustServiceDao serDao=new CustServiceDao(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cust_id=Integer.parseInt(request.getParameter("id"));
        String ser_cust_name = request.getParameter("name");
        String ser_cust_addr = request.getParameter("addr");
        long phno=Long.parseLong(request.getParameter("phno"));
        String ser_cust_email = request.getParameter("email");
       
        CustServiceDto  newser = new CustServiceDto(ser_cust_name,ser_cust_addr,phno,ser_cust_email,cust_id);
        try {
			serDao.insertser(newser);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        response.sendRedirect("Cust_service_list.jsp");	
	}
	

}

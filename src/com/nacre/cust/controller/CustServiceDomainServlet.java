package com.nacre.cust.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nacre.cust.daoImpl.CustServiceDomDao;
import com.nacre.cust.dto.CustServiceDomDto;



@WebServlet("/serdominsert")
public class CustServiceDomainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustServiceDomDao serdomDao=new CustServiceDomDao(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ser_cust_id=Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String addr = request.getParameter("addr");
        long phno=Long.parseLong(request.getParameter("phno"));
        String email = request.getParameter("email");
       
        CustServiceDomDto  newserdom = new CustServiceDomDto(name,phno,email,addr,ser_cust_id);
        try {
			serdomDao.insertserdom(newserdom);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        response.sendRedirect("Cust_service_domain_list.jsp");	
	}
}

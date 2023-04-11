package com.nacre.cust.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.cust.daoImpl.CustServiceDao;

import com.nacre.cust.dto.CustServiceDto;


@WebServlet("/serlist")
public class CustServiceListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustServiceDao serDao=new CustServiceDao() ;  
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List < CustServiceDto > listService =serDao.selectAllCustServices() ;
        request.setAttribute("listService",listService);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_service_list.jsp");
        dispatcher.forward(request, response);
	}
	

}

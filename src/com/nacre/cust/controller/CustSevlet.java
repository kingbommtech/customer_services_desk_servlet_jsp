package com.nacre.cust.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.cust.daoImpl.CustDao;
import com.nacre.cust.dto.CustDto;



@WebServlet("/cust")
public class CustSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustDao custDao;   
	public void init() {
		custDao=new CustDao();
		
	}
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {

		    	List < CustDto > listCust =custDao.selectAllCust() ;
		    	request.setAttribute("listCust", listCust);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_list.jsp");
		        dispatcher.forward(request, response);
		    	
		
	        
	}

}

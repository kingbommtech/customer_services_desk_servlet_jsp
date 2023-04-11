package com.nacre.cust.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.cust.delegatesImpl.CustRegistrationDelegates;
import com.nacre.cust.vo.CustRegistrationVo;

@WebServlet("/custRegistrationServlet")
public class CustRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //local variable
		 String fname;
		 String phone;
		 String email;
		 String photo;
		 String dob;
		 String addr;
		 String uname;
		 String pass;
		 boolean res=false;
		 CustRegistrationVo custregVo=null;
		 CustRegistrationDelegates custregDel=null;
		
		 //accepting logic
		 fname=request.getParameter("fname");
		 
		 phone=request.getParameter("phone");
		 email=request.getParameter("email");
		 photo=request.getParameter("photo");
		 dob=request.getParameter("dob");
		 addr=request.getParameter("addr");
		 uname=request.getParameter("uname");
		 pass=request.getParameter("pass");
		 
		 //out.println(photo);
		//creating object CustRegistrationVO
		custregVo=new CustRegistrationVo();
			
		//setting values in vo object
		custregVo.setFname(fname);
		custregVo.setPhone(phone);
		custregVo.setEmail(email);
		custregVo.setPhoto(photo);
		custregVo.setDob(dob);
		custregVo.setAddr(addr);
		custregVo.setUname(uname);
		custregVo.setPass(pass);
		
		//creating object in RegistrationDelegates
		custregDel=new CustRegistrationDelegates();
		res=custregDel.pars(custregVo);
		if(res==true){
			RequestDispatcher rd=request.getRequestDispatcher("Cust_login.jsp");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("Cust_register.jsp");
		    rd.forward(request, response);
		}
		
		 
	}

}

package com.nacre.cust.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.cust.daoImpl.CustComplaintDao;
import com.nacre.cust.daoImpl.CustFeedbackDao;
import com.nacre.cust.dto.ComplaintDto;
import com.nacre.cust.dto.FeedbackDto;




@WebServlet("/")
public class CustComplantsFeedbacksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustFeedbackDao feedbackDao;
    private CustComplaintDao compDao;
	
	public void init() {
		feedbackDao=new CustFeedbackDao();
		compDao= new CustComplaintDao();
	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        doGet(request, response);
	 }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String action = request.getServletPath();

	        try {
	            switch (action) {
	                case "/fbnew":
	                    showNewForm(request, response);
	                    break;
	                case "/fbinsert":
	                    insertFeedback(request, response);
	                    break;
	                case "/fblist":
	                	listFeedback(request, response);
	                    break;
	                case "/compnew":
	                    showNewFormComp(request, response);
	                    break;
	                case "/compinsert":
	                	insertComplaint(request, response);
	                    break;
	                default:
	                	listComplaint(request, response);
	                    break;
	                    
	            }
	        }        catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	        
		}
	 private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_add_feedback.jsp");
			        dispatcher.forward(request, response);
	 }
	 private void listFeedback(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException, ServletException {
			        List < FeedbackDto > listFeedback =feedbackDao.selectAllFeedbacks() ;
			        request.setAttribute("listFeedback", listFeedback);
			        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_feedback_list.jsp");
			        dispatcher.forward(request, response);
			        
	 }
	 private void insertFeedback(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
			    	int cust_id=Integer.parseInt(request.getParameter("id"));
			        String feedback_text = request.getParameter("fbtext");
			        String email_id=request.getParameter("fbemail");
			        int comp_reg_id=Integer.parseInt(request.getParameter("fbcompid"));
			        FeedbackDto newfb = new FeedbackDto(cust_id,feedback_text, email_id,comp_reg_id);
       		        feedbackDao.insertfb(newfb);
			        response.sendRedirect("fblist");
	 }
	 private void showNewFormComp(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_add_complant.jsp");
			        dispatcher.forward(request, response);
	 }
	 private void listComplaint(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException, ServletException {
			        List < ComplaintDto > listComplaint =compDao.selectAllComplaints() ;
			        request.setAttribute("listComplaint",listComplaint);
			        RequestDispatcher dispatcher = request.getRequestDispatcher("Cust_complant_list.jsp");
			        dispatcher.forward(request, response);
			        
	 }
	 private void insertComplaint(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
			    	int cust_id=Integer.parseInt(request.getParameter("id"));
			        String text_of_comp = request.getParameter("comptext");
			        int dom_id=Integer.parseInt(request.getParameter("dom_id"));
			        System.out.println( dom_id);
			        ComplaintDto newcomp = new ComplaintDto(text_of_comp,cust_id,dom_id);
			        compDao.insertcomp(newcomp);
			        response.sendRedirect("complist");
	 }

}

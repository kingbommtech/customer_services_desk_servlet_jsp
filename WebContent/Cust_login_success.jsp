<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    if ((session.getAttribute("custid") == null) || (session.getAttribute("custid") == "")) {

%>
<center>
    <p align="center" style="font-size:45px">Customer service desk</p>
    Session expired.
    <a href="Cust_login.jsp" style="color:#616161;padding-top:23px">Sign in here</a>
</center>
<%  } 
    else {

%>
<html>
    <head><title>Customer Service Desk</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
        <link rel="stylesheet" href="css1.css" type="text/css">
        <link rel="stylesheet" href="w3.css" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
              crossorigin="anonymous">
    </head>
    <body>
        <header >
             <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
             <div>
               <span class="navbar-brand"><img src="images/happy_logo.png" width="60" height="60">
                     <span style="font-family:Script MT;color: rgb(173, 255, 47);font-size: 50px"></span>
               </span>       
             </div>
                <ul class="navbar-nav">
                   <li><a href="Cust_list.jsp" class="nav-link">&nbsp&nbsp Customer List</a></li>
                   <li><a href="Cust_complant_list.jsp" class="nav-link">&nbsp&nbsp&nbspComplaints</a></li>
                   <li><a href="Cust_feedback_list.jsp" class="nav-link">&nbsp&nbspFeedback</a></li>
                   <li><a href="Cust_service_list.jsp" class="nav-link">&nbsp&nbspCustomer Service</a></li>
                   <li><a href="Cust_service_domain_list.jsp" class="nav-link">&nbsp&nbspCustomer Service Domain</a></li>
                   <li>
                       <a href="logout.jsp" class="nav-link">&nbsp&nbspLog out <i>(<%out.print(session.getAttribute("custid")); %>)</i></a>
                   </li>  
                   
                </ul>
            </nav>
         </header>
         <footer>
             <div class="jumbotron text-center" style="margin-bottom:0">
                 <p class="">Made with love by nacre@kinshuk@fs22.</p>
             </div>
         </footer>
  <%
        }
   %>

    </body>
</html>
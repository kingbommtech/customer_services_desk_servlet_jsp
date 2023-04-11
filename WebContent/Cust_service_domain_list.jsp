<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
        <head>
            <title>Customer Services Domain List</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>
             <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="http://www.nacreservices.com" class="navbar-brand"> Customer Services Desk </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/serdomlist" class="nav-link">Service Domain Customer</a></li>
                        <li><a href="Cust_login_success.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspCustomer</a></li>
                    </ul>
                </nav>
            </header>
            
            <div class="row">
               
                <div class="container">
                    <h3 class="text-center">List of Service Domain Customers</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="Cust_add_service_domain.jsp" class="btn btn-success">Add New Service Domain Customer</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Service Customer Domain Id</th>
                                <th>Service Customer Domain name</th>
                                <th>Phone No</th>
                                
                                <th>Email</th> 
                                <th>Address</th>                            
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="serdom" items="${listServiceDomain}">

                                <tr>
                                    <td>
                                        <c:out value="${serdom.ser_cust_dom_id}" />
                                    </td>
                                    <td>
                                        <c:out value="${serdom.ser_cust_dom_name}" />
                                    </td>
                                    <td>
                                        <c:out value="${serdom.ser_cust_dom_phno}" />
                                    </td>
                                    <td>
                                        <c:out value="${serdom.ser_cust_dom_email}" />
                                    </td>
                                    <td>
                                        <c:out value="${serdom.ser_cust_dom_addr}" />
                                    </td>                                    
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
        <head>
            <title>Customer Service Desk</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>
             <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="http://www.nacreservices.com" class="navbar-brand"> Customer Service Desk </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/cust" class="nav-link">Customer List</a></li>
                        <li><a href="Cust_login_success.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspCustomer</a></li>
                    </ul>
                </nav>
            </header>
            <div class="container">
                    <h3 class="text-center">List of Customer</h3>
                    <hr>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Customer ID</th>
                                <th> Name</th>
                                <th> PhoneNo</th>
                                <th>Address</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="cust" items="${listCust}">

                                <tr>
                                    <td>
                                        <c:out value="${cust.cust_id}" />
                                    </td>
                                    <td>
                                        <c:out value="${cust.cust_fname}" />
                                    </td>
                                    <td>
                                        <c:out value="${cust.cust_phno}" />
                                    </td>
                                    <td>
                                        <c:out value="${cust.cust_addr}" />
                                    </td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
        </body>
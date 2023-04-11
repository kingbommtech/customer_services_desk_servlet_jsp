<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
        <head>
            <title>Customer complaints list</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>
             <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="http://www.nacreservices.com" class="navbar-brand"> Customer Services Desk </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/complist" class="nav-link">Complaints</a></li>
                        <li><a href="Cust_login_success.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspCustomer</a></li>
                    </ul>
                </nav>
            </header>
            
            <div class="row">
               
                <div class="container">
                    <h3 class="text-center">List of Complaints</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="<%=request.getContextPath()%>/compnew" class="btn btn-success">Add New Complaints</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Complaints Id</th>
                                <th>Complaints Date</th>
                                <th>Complaints</th>
                                <th>Customer Id</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="comp" items="${listComplaint}">

                                <tr>
                                    <td>
                                        <c:out value="${comp.comp_reg_id}" />
                                    </td>
                                    <td>
                                        <c:out value="${comp.comp_date}" />
                                    </td>
                                    <td>
                                        <c:out value="${comp.text_of_comp}" />
                                    </td>
                                    <td>
                                        <c:out value="${comp.cust_id}" />
                                    </td>
                          
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>
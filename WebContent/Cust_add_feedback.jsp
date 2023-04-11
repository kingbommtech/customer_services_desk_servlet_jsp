<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

        <head>
            <title>Customer Service Desk</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
                  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
                  crossorigin="anonymous">
        </head>
        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="#" class="navbar-brand"> Customer Service Desk </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/fblist" class="nav-link">Feedback</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                            <form action="fbinsert" method="post">

                        <caption>
                            <h2>
                                 Feedback
                            </h2>
                        </caption>
                        <fieldset class="form-group">
                            <label>Enter your Customer Id :</label> 
                            <input type="number" value="<c:out value='${fb.name}' />" class="form-control" name="id" required="required">
                        </fieldset>        
                        <fieldset class="form-group">
                            <label>Enter your Feedback :</label> 
                            <input type="text" value="<c:out value='${fb.name}' />" class="form-control" name="fbtext" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Email:</label> 
                            <input type="email" value="<c:out value='${fb.price}' />" class="form-control" name="fbemail">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Complaint Id:</label> 
                            <input type="number" value="<c:out value='${fb.price}' />" class="form-control" name="fbcompid">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body><br><br><br><br>
        <footer class="text-center card-footer ">
        <p>kinshukmaity@nacre@fs22</p>
    </footer>

        </html>
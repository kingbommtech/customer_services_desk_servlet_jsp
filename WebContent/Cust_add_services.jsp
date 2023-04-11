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
                        <li><a href="<%=request.getContextPath()%>/serlist" class="nav-link">Service Customer</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                            <form action="serinsert" method="get">

                        <caption>
                            <h2>
                                 Service Customer
                            </h2>
                        </caption>
                        <fieldset class="form-group">
                            <label> Customer Id :</label> 
                            <input type="number"  class="form-control" name="id" required="required">
                        </fieldset>        
                        <fieldset class="form-group">
                            <label>Service Customer name :</label> 
                            <input type="text"  class="form-control" name="name" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label> Address :</label> 
                            <input type="text"  class="form-control" name="addr"required="required">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Phone Number :</label> 
                            <input type="number"  class="form-control" name="phno"required="required">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Email Id :</label> 
                            <input type="email"  class="form-control" name="email"required="required">
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
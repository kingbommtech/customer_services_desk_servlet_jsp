<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer login</title>
        <link rel="stylesheet" href="w3.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous">
    </head>
    <body style="background-color:#14FFFF">
         <header >
             <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
             <div>
               <span class="navbar-brand"><img src="images/happy_logo.png" width="60" height="60">
                     <span style="font-family:Script MT;color: rgb(173, 255, 47);font-size: 50px">Customer Service Desk</span>
               </span>       
             </div>
                <ul class="navbar-nav">
                   <li><a href="Index.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbsp&nbspHome</a></li>
                   <li><a href="#" class="nav-link">&nbsp&nbsp&nbsp&nbsp&nbspGeneral Information</a></li>
                   <li><a href="Cust_register.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspRegister Customer</a></li>  
               </ul>
            </nav>
         </header><br><br>   
         <div>
            <fieldset style="width:270px; float:right; background:#14FFFF">
            <div class="container col-md-20">
                 <div class="card">
                      <div class="card-body">
                          <form method="post" action="Cust_login_check.jsp">
                                   <fieldset class="form-group">
                                       <label><i class="fa fa-user"></i>&nbsp&nbspUser Name :</label>
                                       <input type="text"  class="form-control" name="uname" placeholder="Enter your User Name" value="" required="required">
                                   </fieldset>

                                   <fieldset class="form-group">
                                       <label><i class="fas fa-unlock-alt"></i>&nbsp&nbspPassword :</label>
                                       <input type="password"  class="form-control" name="pass" placeholder="Enter the passowrd" value="" required="required">
                                   </fieldset>
                                   <button type="submit" class="btn btn-success">Sign In</button>
                                   <fieldset class="form-group">
                                       <label>Create an account :</label>
                                       <a href="Cust_register.jsp"><input type="button" class="btn btn-success" value="Sign Up"></a>
                                   </fieldset>
                             </form>
                        </div>
                  </div>
           </div>
           </fieldset>
        </div>
        <div style="background-color:#14FFFF" >
            <div style="text-align:center"> Deliver Excellent Customer Service at Our Customer Service Desk<br>
               <h4>We offer following with any service provider from any domain or industry like<br> banking, telecom, railways etc.</h4></div>
        </div><br><br><br>
        <table   style="background-color:#14FFFF;margin-left:90px">
         <tr>
            
            <td><a href="#"><img src="images/bank.jpg" class="rounded-circle"style="width:100%" height=200 width=200></a></td>
            <td>&nbsp&nbsp&nbsp&nbsp</td>
            <td><a href="#"><img src="images/Telecom.jpg" class="rounded-circle"style="width:100%" height=200 width=200></a></td>
            <td>&nbsp&nbsp&nbsp&nbsp</td>
            <td><a href="#"><img src="images/train1.jpg" class="rounded-circle"style="width:100%" height=200 width=200></a></td>
        </tr>
        <tr><td style="text-align:center">Banking Services</td><td></td>
            <td style="text-align:center">Telecom Services</td><td></td>
            <td style="text-align:center">Train Services</td>
        </tr>
        
        </table><br><br><br><br>
     
    </body>
    
     <footer class="text-center card-footer ">
        <p>kinshukmaity@nacre@fs22</p>
    </footer>
 </footer>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="w3.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Customer Registration</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
              crossorigin="anonymous">
    </head>
    <body>
        <header >
             <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
             <div>
               <span class="navbar-brand"><img src="images/happy_logo.png" width="60" height="60">
                     <span style="font-family:Script MT;color: rgb(173, 255, 47);font-size: 50px">Customer Service Desk</span>
               </span>       
             </div>
                <ul class="navbar-nav">
                   <li><a href="Index.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspHome</a></li>
                   <li><a href="#" class="nav-link">&nbsp&nbsp&nbsp&nbsp&nbspAdmin</a></li>
                   <li><a href="#" class="nav-link">&nbsp&nbsp&nbsp&nbspManager</a></li>
                   <li><a href="Emp_login.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspEmployee</a></li>
                   <li><a href="Cust_login.jsp" class="nav-link">&nbsp&nbsp&nbsp&nbspCustomer</a></li>
                      
               </ul>
            </nav>
         </header>
    <br> <br>
   
    <div class="container col-md-6">
    <h1> Customer Registration :</h1>
           <div class="card">
              <div class="card-body">
                 <form method="post" action="custRegistrationServlet">
                      <fieldset class="form-group">
                            <label><i class="fas fa-file-signature"></i>&nbsp&nbspFull Name :</label>
                            <input type="text"  class="form-control" name="fname" placeholder="Enter the First Name" required="required">
                      </fieldset>

                      <fieldset class="form-group">
                            <label><i class="fas fa-phone"></i>&nbsp&nbspPhone Number :</label>
                            <input type="number"  name="phone" class="form-control" placeholder="Enter your Phone number" required="required">
                      </fieldset>
                      <fieldset class="form-group">
                            <label><i class="fa fa-envelope"></i>&nbsp&nbspEmail :</label>
                            <input type="text"  name="email" class="form-control" placeholder="Enter your Email" required="required">
                      </fieldset>
                      <fieldset class="form-group">
                            <label><i class="fas fa-photo-video"></i>&nbsp&nbspPhoto :</label>
                            <input type="file"  class="form-control" name="photo" placeholder="Enter the photo" required="required">
                      </fieldset>
                      <fieldset class="form-group">
                            <label><i class="fas fa-birthday-cake"></i>&nbsp&nbspDate Of Birth :</label>
                            <input type="date"  name="dob" class="form-control" placeholder="Enter the DOB" required="required">
                      </fieldset>
                      <fieldset class="form-group">
                            <label for="adr"><i class="fas fa-address-card"></i>&nbsp&nbsp&nbspAddress :</label>
                            <input type="text" class="form-control" id="addr" name="addr" placeholder="542 W. 15th Street,city"required="required">
                      </fieldset>
                      <fieldset class="form-group">
                            <label><i class="fa fa-user"></i>&nbsp&nbspUser Name :</label>
                            <input type="text"  class="form-control" name="uname" placeholder="Enter the Uesr Name" required="required">
                      </fieldset>

                      <fieldset class="form-group">
                            <label><i class="fas fa-unlock-alt"></i>&nbsp&nbspPassword :</label>
                            <input type="password"  class="form-control" name="pass" placeholder="Enter the Password" required="required">
                      </fieldset>

                      <button type="submit" class="btn btn-success">Sign up</button>
                      
                      <fieldset class="form-group">
                            <label>Already have account :</label>
                            <a href="Cust_login.jsp"><input type="button" class="btn btn-success" value="Sign In"></a>
                      </fieldset>
                 </form>
               </div>
          </div>
      </div>
    </body>
     <footer class="text-center card-footer ">
        <p>kinshukmaity@nacre@fs22</p>
    </footer>
</html>
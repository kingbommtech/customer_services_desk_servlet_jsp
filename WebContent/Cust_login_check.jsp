    <%@ page import ="java.sql.*" %>
    <%@page import="com.nacre.cust.daoImpl.ConnectionTest"%>
    <%
        String custid = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        Connection con = ConnectionTest.putConnection();
        Statement st = con.createStatement();
        ResultSet rs;

        rs = st.executeQuery("select * from cust_master where cust_uname='" + custid + "' and cust_pass='" + pwd + "'");
        if (rs.next()) {
           session.setAttribute("custid", custid);
           response.sendRedirect("Cust_login_success.jsp");
        } 
        else{ 
    %>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Service Desk</title>
        <link rel="stylesheet" href="w3.css" type="text/css">
    </head>

    <style>
        .dfHgt {
            color: #212121;
            text-align:center;
        }
    </style>
    <div class="w3-container w3-center ">
        <div class="w3-xxlarge"> Customer Service Desk </div>
    </div>
    <p class="dfHgt">
        !<br>
        Wrong Username or Password.<br>
        If you do not redirect within 5 seconds <a href="Cust_login.jsp">click here</a>
        <script>
            setTimeout(function () {
                window.location.href = "Cust_login.jsp"
            }, 5000);
        </script>
    </p>

    <%
        }
    %>
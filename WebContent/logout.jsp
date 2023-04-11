<%
    session.setAttribute("custid", null);
    session.invalidate();
    response.sendRedirect("Cust_login.jsp");
%>	
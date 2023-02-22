<%-- 
    Document   : ses
    Created on : 12 Feb, 2022, 3:39:30 PM
    Author     : ABHIRAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>2nd page of JSP</h1>
        <%
            String s=  (String)session.getAttribute("name");
            out.println("welcome "+ s+ "on 2nd page of jsp ");
        %>
    </body>
</html>

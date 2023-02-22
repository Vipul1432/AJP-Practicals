<%-- 
    Document   : action
    Created on : 28 Feb, 2022, 8:09:09 AM
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
        <%
            String name=request.getParameter("n1");
            
            out.print("Username is "+name);
            %>
    </body>
</html>

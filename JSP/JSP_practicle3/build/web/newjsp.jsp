<%-- 
    Document   : newjsp
    Created on : 17 Jan, 2022, 9:09:54 AM
    Author     : ABHIRAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    
    <body>
    <% 
        String name = ((request.getParameter("n1"))+(request.getParameter("n2")));
        out.println("The sum is(string'concatenation') "+ name);
        
        int N = (Integer.parseInt(request.getParameter("n1"))+Integer.parseInt(request.getParameter("n2")));
        out.println("The sum is(Integer) "+ N); 

    %>
    
    </body>
</html>

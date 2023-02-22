
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String s = request.getParameter("n");
            out.println("wlcm "+s);
            
            session.setAttribute("name", s);
            
            
        %>
    </body>
</html>

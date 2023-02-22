
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP include Page</title>
    </head>
    <body>
    <center>
        <%="My name is: "+request.getParameter("name")%>
        <jsp:include page="header.jsp" />  
    </center>
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP forward Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:forward page="user.jsp">
            <jsp:param name="name" value="sonu"/>
        </jsp:forward>
    </body>
</html>

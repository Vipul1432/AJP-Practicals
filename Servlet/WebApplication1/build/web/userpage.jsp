
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculation</title>
    </head>
    <body>
        <%
            String fn1 = request.getParameter("n1");
            String fn2 = request.getParameter("n2");

            int n1 = Integer.parseInt(fn1);
            int n2 = Integer.parseInt(fn2);
            int add = n1 + n2;
            int sub = n1 - n2;
            int multi = n1 * n2;
            int div = n1 / n2;
        %>
        <div class="jumbotron">
        <%="Addtion of two Integer is: " + add%><br>
        <%="Substraction of two Integer is: " + sub%><br>
        <%="Multiplition of two Integer is: " + multi%><br>
        <%="Division of two Integer is: " + div%><br>
        </div>
    </body>
</html>

<%-- 
    Document   : employee
    Created on : Apr 23, 2022, 2:57:15 PM
    Author     : Vipul Kumar
--%>

<%@page import="java.util.*"%>
<%@page import="model.Employee"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>new Employee</h1>
        <form method="post">
            Id <input type="text" name="t1"/><br><br>
            Name <input type="text" name="t2"/><br><br>
            Salary <input type="text" name="t3"/><br><br>
            <input type="submit" name="submit" value="save"/><br>
            ${msg}
            <hr>
            <h1>Employee list</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>salary</th>
                </tr>
                
            </table>
        </form>
    </center>
    </body>
</html>

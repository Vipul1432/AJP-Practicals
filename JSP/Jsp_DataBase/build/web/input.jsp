<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/class" user="root" password=""/>

        <sql:query var="rs" dataSource="${db}">select * from cla</sql:query>
        <c:forEach items="${rs.rows}" var="gadget">
            <c:out value="${gadget.dep}"></c:out>: <c:out value="${gadget.teacher}"></c:out> :<c:out value="${gadget.student}"></c:out><br>
        </c:forEach>
    </body>
</html>
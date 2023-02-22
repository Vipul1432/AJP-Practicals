<!DOCTYPE HTML> 
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html> 
    <head> 
        <title>Connection with mysql database</title> 
    </head> 
    <body>
        <%
            String dprt = request.getParameter("d");
            String tech = request.getParameter("t");
            String stu = request.getParameter("s");

            try {
                String connectionURL = "jdbc:mysql://localhost:3306/class";

                Connection con = null;
                Statement s = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();

                con = DriverManager.getConnection(connectionURL, "root", "");
                s = con.createStatement();

                //String q ="INSERT INTO cla (dep, teacher , student) VALUES ('civil', 'Rohan', 'Sahil')";
//                String q ="DELETE FROM cla where dep=''";
//                s.executeUpdate(q);
//                out.print("sucessfully updated");
                ResultSet rs = s.executeQuery("select * from cla");
                while (rs.next()) {
                    out.print(rs.getString(1) + "&nbsp; &nbsp; &nbsp;" + rs.getString(2) + "&nbsp; &nbsp; &nbsp;" + rs.getString(3)+"</br>");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        
    </body> 
</html>


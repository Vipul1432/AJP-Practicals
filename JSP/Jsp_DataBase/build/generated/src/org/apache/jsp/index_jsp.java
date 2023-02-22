package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML> \n");
      out.write(" \n");
      out.write(" \n");
      out.write("<html> \n");
      out.write("    <head> \n");
      out.write("        <title>Connection with mysql database</title> \n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body> \n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

import java.sql.*;
public class Statement {
	public static void main(String [] args) {
		
		 try
		    {
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      System.out.println("Driver loaded: \n");
		      //sun.jdbc.odbc.JdbcOdbcDriver
		      Connection cn = DriverManager.getConnection
		          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",   //192.168.12.82 local host
		              "mef190570107153","mef190570107153");
		      System.out.println("Connection established: \n");
		      
		      Statement st = cn.createStatement();
		      ResultSet rs = st.executeQuery("Select * from STUDENT");
		        
		      while(rs.next()) {
		        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		        
		      }
		      
		      //st.executeUpdate("UPDATE STUDENT SET NAME='Vipul' where NAME='divu' ");
		      
		      st.executeUpdate("DELETE from STUDENT where cpi=4");
		      //st.executeUpdate("INSERT into STUDENT VALUES(190570107153, 'Vipul',8.3, 7903691455,'07-07-1999')");
		      
		      st.executeQuery("select distinct * from STUDENT");
		     // st.executeQuery("select * from STUDENT");
//		      while(rs.next()) {
//			        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
//			        
//			      }
		      
		      rs.close();
		      st.close();
		      cn.close();
		        
		    } 
		   
		      catch (Exception e) {
		          e.printStackTrace();
		      }

	}
}

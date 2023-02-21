import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//if you change of the query then you need to create a new prepared statement

public class Prepared_Statement {

	public static void main(String[] args) {
		 try
		    {
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      System.out.println("Driver loaded: \n");
		      //sun.jdbc.odbc.JdbcOdbcDriver
		      Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107153","mef190570107153");
		      System.out.println("Connection established: \n");
		      
		      PreparedStatement pst = cn.prepareStatement("Select * from STUDENT where CPI=?");
		      
		      pst.setString(1, "4");            
		      ResultSet rs = pst.executeQuery(); 
		      while(rs.next()) {
		        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)); 
		      }
		      
		      System.out.println("*********************************");
		      
		      pst.setString(1, "5.9");
		      rs=pst.executeQuery();
		      while(rs.next()) {
			        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)); 
			      }
		      
		      PreparedStatement pstInsert = cn.prepareStatement("INSERT INTO STUDENT VALUES( ?,?,?,?,?)");
//		      pstInsert.setInt(1, 190570107153);
//		      pstInsert.setString(2, "Vipul");
//		      pstInsert.setInt(3, 8);
//		      pstInsert.setInt(4, 7903691455);
//		      pstInsert.setString(5, "07-07-99");
//		     
//		      pstInsert.executeUpdate();                    //
//		      
//		      pstInsert.setInt(1, 10);
//		      pstInsert.setString(2, "Divu");
//		      pstInsert.setInt(3, 4);
//		      pstInsert.setInt(4, 9931670288);
//		      pstInsert.setString(5, "13-10-02");
//		      pstInsert.executeUpdate();                    //
		      
//		      String sql = "DELETE FROM student where name = ?";
//		      PreparedStatement prest = cn.prepareStatement(sql);
//		      prest.setLong(1,10);
//		      prest.executeUpdate();
		      
		      rs.close();
		      pst.close();
		      cn.close();
		        
		    } 
		    catch (Exception e) {
		          e.printStackTrace();;
		      }
		      
	}

}

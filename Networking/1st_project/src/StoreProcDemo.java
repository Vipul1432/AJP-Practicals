import java.sql.*; 

public class StoreProcDemo {

	public static void main(String[] args) {
		try
	    {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      System.out.println("Driver loaded: \n");
	      //sun.jdbc.odbc.JdbcOdbcDriver
	      
	      Connection cn = DriverManager.getConnection
	          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
	              "mef191160107001","mef191160107001");
	      
	      System.out.println("Connection established: \n");
	      
	      CallableStatement cs = cn.prepareCall("{call EXP4(?,?,?,?)}");

	      cs.setInt(1, 01);
	      cs.setInt(2, 9000);
	      cs.setString(3, "ani");
	      cs.setInt(4, 4000);
	      cs.execute();
	      
	      System.out.println("Successfully inserted..");
	      cn.close();
	      
	        
	    } 
	    catch (ClassNotFoundException e) {
	          System.out.println("Driver not loaded: \n");
	      }
	      catch (SQLException e) {
	          System.out.println("connection not established: \n");
	      }
	}
}

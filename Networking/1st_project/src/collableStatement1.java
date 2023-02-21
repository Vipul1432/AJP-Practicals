//IN, OUT mode
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class collableStatement1 {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded: \n");
			
			Connection cn = DriverManager.getConnection
			          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
			              "mef191160107001","mef191160107001");
            System.out.println("Connection established: \n");
			
            
            CallableStatement cs = cn.prepareCall("{call getbalance(?, ?)}");
            cs.setInt(1, 10);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            int balance = cs.getInt(2);
            System.out.println("Balance ="+balance);
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

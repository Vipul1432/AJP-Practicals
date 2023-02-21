import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transaction {
	public static void main(String [] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection
			          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
			              "mef191160107001","mef191160107001");
			System.out.println("Connection established: \n");
			
			PreparedStatement p = cn.prepareStatement("update bank set balance=balance+? where accno=?");
			p.setInt(1, 1000);
			p.setInt(2, 35);
			
			int i=p.executeUpdate();
			
			p.setInt(1, -600);
			p.setInt(2, 1);
			
			int j = p.executeUpdate();
			
			if(j==1 && i==1) {
				cn.commit();
				System.out.println("commited successfully");
			}
			else {
				cn.rollback();
				System.out.println("rolled back your transaction");
			}
			      
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

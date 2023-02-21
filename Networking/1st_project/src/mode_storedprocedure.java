import java.sql.*; 

public class mode_storedprocedure {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded: \n");
			
			Connection cn = DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
							"mef191160107001","mef191160107001");
			
            System.out.println("Connection established: \n");
			
            CallableStatement cs = cn.prepareCall("{call getbalance(?)}");
            cs.setInt(1, 10);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int balance = cs.getInt(1);
            System.out.println("Balance, when accno is 10: ="+ balance);
            cn.close();
			
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
	      
	}
}

import java.sql.*;

public class ScroolRS {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded: \n");
			
			Connection cn = DriverManager.getConnection
			          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
			              "mef191160107001","mef191160107001");
            System.out.println("Connection established: \n");
            
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = st.executeQuery("select RNO, NAME, ADDRESS from STUDENT1");
            
            rs.absolute(3);
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
            
            rs.first();
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            
            rs.last();
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            
            rs.updateString(2, "Ram");
            rs.updateString(3, "Rajkot");
            rs.updateRow();
            
            System.out.println("After updating\n"+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            
            rs.absolute(2);
            rs.deleteRow();// delete the absolute row
            
            rs.moveToInsertRow();
            rs.updateInt(1, 55);
            rs.updateString(2, "Raushan");
            rs.updateString(3, "Mumbai");
            
            rs.insertRow();
            cn.close();
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
	}
}

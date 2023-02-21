				//           Experiment 6

import java.net.*;

public class UDPServer1 {
	public static void main(String[] args) 
	 {
	 try {
		 DatagramSocket ds = new DatagramSocket(3000);
		 byte [] buf = new byte[100];
		 DatagramPacket dp = new DatagramPacket(buf, 100);
		 ds.receive(dp);
		 String str = new String(dp.getData(), 0, dp.getLength());
		 int carcount =0,digcount = 0;
		 for(int i =0;i<str.length();i++)
		 {
			 if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				 carcount++;
			 if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				 digcount++;
		 }
		 System.out.println("Characters : "+carcount);
		 System.out.println("digcount :"+digcount);
		 
		 ds.close(); 
	 	}
	 	catch (Exception e){
	 		e.printStackTrace();
	 	}
	 }
}

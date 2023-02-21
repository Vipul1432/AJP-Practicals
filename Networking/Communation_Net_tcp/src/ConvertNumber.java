import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConvertNumber {
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8882);
		Socket s = ss.accept();
		System.out.println("connection established");

		// to send data to the client
		PrintStream p = new PrintStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str, str1;
			while ((str = br.readLine()) != null) {
				System.out.println("\n Count Of Characters & Digits In String Displayed ");
				int countCha = 0, countNum = 0;
				for (int i = 0; i < str.length(); i++) {
					if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
							|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
						countCha++;
					else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
						countNum++;
				}
				str1 = " Total Number Of Characters = " + countCha;
				str1 += " Total Number Of Digits = " + countNum;
				p.println(str1);
			}
			ss.close();
			s.close();

		}
	}
}

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	public static void main(String []args) throws Exception {
		
		ServerSocket ss = new ServerSocket(8882);
		Socket s = ss.accept();
		System.out.println("connection established");
		
		// to send data to the client
		PrintStream p = new PrintStream(s.getOutputStream());
		Scanner ks = new Scanner(System.in);
		Scanner socketScanner = new Scanner(s.getInputStream());
		
		String clientStr, kbstr;
		while(true) {
			clientStr = socketScanner.nextLine();
			if(clientStr.equals("exit"))
				break;
			System.out.println("message from client :"+clientStr);
			kbstr = ks.nextLine();
			p.println(kbstr); //send to client
		}
	}
}

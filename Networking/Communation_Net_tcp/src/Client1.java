import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.137.30", 8888);
		PrintStream p = new PrintStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		Scanner socketsc = new Scanner(s.getInputStream());
		
		String serverstr, kbstr;
		while(true) {
			kbstr = sc.nextLine();
			p.println(kbstr);
			if(kbstr.equals("exit"))
				break;
			serverstr = socketsc.nextLine();
			System.out.println("message from server-:"+serverstr);
			kbstr = sc.nextLine();
			p.println(kbstr);
		}
	}
}

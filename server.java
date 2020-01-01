import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server {
 
	public static void main(String[] args) {
		try {
		System.out.println("waiting for client");
		ServerSocket ss= new ServerSocket(8760);
		Socket soc=ss.accept();
		} catch(IOException ex) {
		Logger.getLogger(server.class.getName()).log(Level.SEVERE,null,ex);
		
		}
	}
}
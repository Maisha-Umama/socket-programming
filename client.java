import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;

public class client {

	public static void main(String[] args)
	{
		
			System.out.println("request for service");
			try {
				Socket soc= new Socket("localhost",8760);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Successfully connected");
			
	
		}
	}


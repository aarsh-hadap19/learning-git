import java.net.*;
import java.io.*;//.*;
public class server {
    public static void main(String args[])throws IOException {
        ServerSocket ser=new ServerSocket(8080);
        ser.accept();
        System.out.println("Client Connected");
        
    }
    
}

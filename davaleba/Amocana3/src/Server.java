import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(3333);
        Socket socket=serverSocket.accept();
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        String s=(String)dataInputStream.readUTF();

        System.out.println("sms "+s);
        serverSocket.close();

    }
}

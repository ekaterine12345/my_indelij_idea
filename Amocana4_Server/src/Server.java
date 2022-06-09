import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("localhost",5555);

        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());

        dataOutputStream.writeUTF("hello client");

        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();


    }
}

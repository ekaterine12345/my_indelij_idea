import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(7777);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";

        while (!s1.equals("stop")) {
            s1 = dataInputStream.readUTF();
            System.out.println("client says: " + s1);

            s2 = bufferedReader.readLine();
            dataOutputStream.writeUTF(s2);

            dataOutputStream.flush();

        }


        dataInputStream.close();
        socket.close();
        serverSocket.close();

    }
}

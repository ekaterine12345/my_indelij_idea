import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",7777);

        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        String s1="",s2="";

        while (!s1.equals("stop"))
        {
            s1=bufferedReader.readLine();
            dataOutputStream.writeUTF(s1);
            dataOutputStream.flush();
            s2=dataInputStream.readUTF();
            System.out.println("Server says "+s2);

        }

        dataOutputStream.close();
        socket.close();
    }
}

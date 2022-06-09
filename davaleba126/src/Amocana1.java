import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import  java.net.InetAddress;

public class Amocana1 {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("http://mziuri.ge/summer");

        System.out.println("protocol: "+url.getProtocol());
        System.out.println("host: "+url.getHost());
        System.out.println("port: "+url.getPort());
        System.out.println("File: "+url.getFile());


        System.out.println("");

        InetAddress inetAddress=InetAddress.getByName("www.mziuri.ge");
        System.out.println("postname "+inetAddress.getHostName());
        System.out.println("host address "+inetAddress.getHostAddress());




    }
}

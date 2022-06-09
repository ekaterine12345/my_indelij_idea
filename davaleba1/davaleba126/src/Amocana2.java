import java.io.InputStream;
import java.net.*;

public class Amocana2 {
    public static void main(String[] args) throws Exception, MalformedURLException {


        URL url = new URL("http://mziuri.ge/summer");

        URLConnection urlConnection=url.openConnection();

        InputStream inputStream=urlConnection.getInputStream();
        int x;

        while ((x=inputStream.read())!=-1)
            System.out.println((char)x);

    }
}

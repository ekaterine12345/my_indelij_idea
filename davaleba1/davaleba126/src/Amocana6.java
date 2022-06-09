import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Amocana6 {
    public static void main(String[] args) throws Exception {


        String imageUrl="https://4a7efb2d53317100f611-1d7064c4f7b6de25658a4199efb34975.ssl.cf1.rackcdn.com/java-emergency-upgrade-installers-showcase_image-2-p-2057.jpg";

        InputStream inputStream=null;
        OutputStream outputStream=null;

        URL url=new URL(imageUrl);

        inputStream=url.openStream();
        outputStream=new FileOutputStream("D:\\image.png");

        byte [] b=new byte[1024];
        int n;

        while ((n=inputStream.read(b))>0)
        {
        outputStream.write(b,0,n);
        }


        inputStream.close();
        outputStream.close();
    }
}

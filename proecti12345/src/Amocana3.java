import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amocana3 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String p1="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.";
        String p2="(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.";
        String p3="(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.";
        String p4="(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern p=Pattern.compile(p1+p2+p3+p4);

        String ip=sc.nextLine();
        Matcher m=p.matcher(ip);


        while (m.find())
        {
            System.out.println("ip");
            System.out.print(ip.substring( m.start(), m.end()));
        }

    }
}

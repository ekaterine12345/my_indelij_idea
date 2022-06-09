import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amocana4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern p1=Pattern.compile("^(https|www|http)");

        String s=sc.next();

        Matcher m=p1.matcher(s);


        while (m.find())
        {
            System.out.print(s.substring( m.start(), m.end()));
            System.out.println();
        }


    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amocana5 {

    public static void main(String[] args) {

        int ans=0;

        Scanner sc=new Scanner(System.in);

        String s = sc.nextLine();
        if (s.length()>=8) ans=1;

        Pattern p = Pattern.compile("\\d{1}");

        Matcher m = p.matcher(s);

          while (m.find())
        {
            ans++;
            break;
        }


          Pattern p1=Pattern.compile("[a-z]+");

          m=p1.matcher(s);

            while (m.find())
            {
                ans++;
                break;
            }


            Pattern p2=Pattern.compile("[A-Z]+");
            m=p2.matcher(s);

        while (m.find())
        {
            ans++;
            break;
        }


        Pattern p3= Pattern.compile("[!@#$%^&*]");
        m=p3.matcher(s);

        while (m.find())
        {
            ans++;
            break;
        }

        if (ans==5) System.out.println("validacia");
        else
            System.out.println("ara validacia");

    }

}

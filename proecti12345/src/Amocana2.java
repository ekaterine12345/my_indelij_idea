import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amocana2 {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("efgh");

        String s="abcd123efgh4567";
        Matcher m=p.matcher(s);


        while (m.find())
        {
            System.out.print(s.substring( m.start(), m.end()));
        }

    }
}

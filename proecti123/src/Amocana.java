import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Amocana {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("[a-z]+");

        Matcher m=p.matcher("Hello From Regex");
        m.find();
        System.out.println(m.start()+" - "+ m.end());

    }
}

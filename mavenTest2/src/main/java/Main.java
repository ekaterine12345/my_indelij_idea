import com.sun.net.httpserver.Authenticator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Result result= JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure: result.getFailures())
        {
            System.out.println(failure.toString());
        }


        System.out.println(result.wasSuccessful());
    }
}

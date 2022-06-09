import org.junit.Assert;
import org.junit.Test;

public class TestJunit2 {

    Factorial factorial1=new Factorial();


    @Test(timeout = 1000)
    public void testFactorial()
    {
        Assert.assertEquals(24,factorial1.factorial(4));
    }
}

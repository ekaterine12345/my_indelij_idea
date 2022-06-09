import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum()
    {
        Calculator calculator=new Calculator();

        Assert.assertEquals(20, calculator.sum(12,8));
        Assert.assertEquals(20,calculator.sum(12,7));
    }

    @Test
    public void  testSubtraction()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(5,calculator.subtraction(9,4));
        Assert.assertEquals(3,calculator.subtraction(7,2));

    }

    @Test
    public void  testProdact()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(12,calculator.prodact(3,4));
        Assert.assertEquals(12,calculator.prodact(4,2));
    }


    @Test
    public void  testDivision()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(9,calculator.division(27,3));
        Assert.assertEquals(3,calculator.division(27,5));

    }


}

public class Factorial {

    public int factorial (int n)
    {
        int p=1;
        for (int i=1; i<=n; i++)
            p*=i;


        try {
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return p;


    }
}

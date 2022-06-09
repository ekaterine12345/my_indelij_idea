public class Main {
    public static void main(String[] args) {

        Currency currency1=new Rupee();
        System.out.print(currency1.getCurrencyDescription());
        System.out.println(currency1.cost(0.045));

        Currency currency2=new Dollar();
        System.out.print(currency2.getCurrencyDescription());
        System.out.println(currency2.cost(3.2));


       Currency currency3=new USDDecorator(new Dollar());
        System.out.print(currency3.getCurrencyDescription());
        System.out.println(currency3.cost(3)+" ");

        Currency currency4=new USDDecorator(new Rupee());
        System.out.print(currency4.getCurrencyDescription());
        System.out.print(currency4.cost(3.45));



    }
}

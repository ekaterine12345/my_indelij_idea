public abstract class Decorator extends Currency {

    protected Currency currency;


    public Decorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    String getCurrencyDescription() {
        return this.currency.getCurrencyDescription();
    }

    @Override
    double cost(double c) {
        System.out.print(getDescription()+" ");
        return this.currency.cost(c);

    }

        public static String getDescription(){
        return "USA";
    }



}

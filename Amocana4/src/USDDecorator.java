public  class USDDecorator extends Decorator{


    public USDDecorator(Currency currency) {
        super(currency);
    }

    @Override
    String getCurrencyDescription() {
        return super.getCurrencyDescription();
    }

    @Override
    double cost(double c) {
        return super.cost(c);
    }

//    @Override
//    public String getDescription() {
//        return super.getDescription();
//    }
}

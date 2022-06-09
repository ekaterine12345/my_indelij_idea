public class Rupee extends Currency{
    double value=1;

    Currency currency;

    @Override
    String getCurrencyDescription() {
        return value+" lari = "+"India Rupee ";
    }

    @Override
    double cost(double c) {
        return c;
    }
}

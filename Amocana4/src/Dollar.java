public class Dollar extends Currency{
    double value=1;

    @Override
    String getCurrencyDescription() {
        return  value+" lari = "+" Europ Dollar ";
    }

    @Override
    double cost(double c) {
        return c;
    }
}

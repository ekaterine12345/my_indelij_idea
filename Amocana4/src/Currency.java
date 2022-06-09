public abstract class Currency {
    String description;

    abstract String getCurrencyDescription();
    abstract double cost(double c);
}

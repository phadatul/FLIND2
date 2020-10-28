package checkout;

public class Cookie extends DessertItem {
    private int _units;
    private double _price;

    public Cookie() {
        super("Cookie");
    }

    public Cookie(int units, double price) {
        this();
        _units = units;
        _price = price;
    }

    @Override
    public double cost() {
        return _units * _price / 12.0;
    }
}

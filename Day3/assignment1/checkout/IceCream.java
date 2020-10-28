package checkout;

public class IceCream extends DessertItem {
    private double _cost;

    public IceCream() {
        super("IceCream");
    }

    public IceCream(double cost) {
        this();
        _cost = cost;
    }

    @Override
    public double cost() {
        return _cost;
    }
}

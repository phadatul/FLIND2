package checkout;

public class Sundae extends IceCream {
    private double _toppingsCost;

    public Sundae() {
    }

    public Sundae(double iceCreamCost, double toppingsCost) {
        this();
        super(iceCreamCost);
        _toppingsCost = toppingsCost;
    }

    @Override
    public double cost() {
        return super.cost() + _toppingsCost;
    }
}

package checkout;

public class Candy extends DessertItem {
    private int _weight;
    private double _price;

    public Candy() {
        super("Candy");
    }

    public Candy(int weight, double price) {
        this();
        _weight = weight;
        _price = price;
    }

    @Override
    public double cost() {
        return Math.round(_weight * _price / 1000.0);
    }
}

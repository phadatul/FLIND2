package checkout;

abstract class DessertItem {
    private String _name;

    public DessertItem() {
    }

    public DessertItem(String name) {
        _name = name;
    }

    public abstract double cost();

    public final String name() {
        return _name;
    }
}

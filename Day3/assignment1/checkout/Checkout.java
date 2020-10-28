package checkout;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<DessertItem> _cashRegister;

    public Checkout() {
        _cashRegister = new ArrayList<DessertItem>();
    }

    public void add(DessertItem item) {
        _cashRegister.add(item);
    }

    public void clear() {
        _cashRegister.clear();
    }

    public int size() {
        return _cashRegister.size();
    }

    public double totalCost() {
        double total = 0;
        for (DessertItem item : _cashRegister) {
            total += item.cost();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECEIPT ===\n");
        for (DessertItem item : _cashRegister) {
            sb.append(item.name() + "..." + item.cost() + "\n"); 
        }
        sb.append("---------------\n");
        sb.append("Total: " + totalCost() + "\n");
        return sb.toString();
    }
}

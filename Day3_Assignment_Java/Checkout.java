package Assignment;

public class Checkout {
	public DessertItem[] ar;

	public Checkout() {
		// TODO Auto-generated constructor stub
	}

	public void cashRegister(DessertItem... ar) {
		this.ar = ar;
	}

	public void clearCashRegister() {
		this.ar = null;
	}

	public int getNumberOfItems() {
		return this.ar == null ? 0 : this.ar.length;
	}

	public int totalCost() {
		int totalCost = 0;
		for (DessertItem di : this.ar) {
			totalCost += di.costOfItem();
		}
		return totalCost;
	}

	public String getBill() {
		StringBuilder sb = new StringBuilder();
		for (DessertItem di : this.ar) {
			sb.append(di.toString() + "\n");
		}
		return sb.toString();
	}

}

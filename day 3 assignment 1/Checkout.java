public class Checkout {
	DessertItem cashRegister[];

	public void addItems(DessertItem items[]) {
		cashRegister = items;
	}

	public int getNumofItems() {
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return 0;
		} else {
			return cashRegister.length;
		}
	}

	public void clearCart() {
		cashRegister = null;
	}

	public double getTotalCost() {
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return 0;
		} else {
			double cost = 0.0;
			for (DessertItem i : cashRegister) {
				cost = cost + i.getCost();
			}
			return cost;
		}
	}


	public String toString() {
		System.out.println("FINAL RECEIPT.....");
		String s = "";
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return "";
		} else {

			for (DessertItem i : cashRegister) {
				s = s + i.getName() + ":" + i.getCost() + "\n";
			}
			s = s + "Total Cost:" + this.getTotalCost();
			return s;
		}
	}

}
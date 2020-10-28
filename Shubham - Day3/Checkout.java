package hsbc_day3;

public class Checkout {
	private DessertItem [] register;
	private DessertItem [] emptyregister = new DessertItem[]{};

	public Checkout(DessertItem [] item) {
		this.register = item;
	}
	
	public void clearRegister() {
		this.register = this.emptyregister;
	}
	
	public int numItems() {
		return register.length;
	}
	
	public double totalCost() {
		double Cost = 0;
		for(int i = 0; i < register.length; i++) {
			Cost += register[i].ItemCost();
		}
		return Cost;
	}
	
	public void Receipt() {
		for(int i = 0; i < register.length; i++) {
			System.out.print(i+1 + ". ");
			System.out.print(this.register[i]);
			System.out.println();
		}
	}
}

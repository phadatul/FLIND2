public class Checkout {
	
	private DesertItem[] cashRegister;
	
	public int getCount() {
		if(cashRegister==null) {
			return 0;
		} else {
			return this.cashRegister.length;
		}
	}
	
	public void clearRegister() {
		this.cashRegister = null;
	}
	
	public double getTotalCost() {
		if(cashRegister == null){
			return 0;
		}
		double totalCost = 0;
		for (int i=0; i<cashRegister.length; i++) {
			totalCost += cashRegister[i].getCost();
		}
		return totalCost;
	}
	
	public void printReceipt() {
		if(cashRegister==null) {
			System.out.println("Cart is empty");
		} else {
			for(int i=-0; i<cashRegister.length; i++) {
				System.out.println(cashRegister[i].getName());
				System.out.println(cashRegister[i].getCost());
			}
		}
		
	}
	
	
}

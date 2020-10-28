package com.hsbc.assignment;

public class Checkout {
	DessertItem[] cashRegister;
	
	public void addItems(DessertItem order[]) {
		cashRegister=order;
	}
	
	public int numItems() {
		return cashRegister.length;
	}
	
	public void clear() {
		cashRegister=null;
	}
	
	public double totalCost() {
		double amount=0;
		for (int i=0 ;i<cashRegister.length; i++) {
			amount+=cashRegister[i].costs();
		}
		return amount;
	}
	//for receipt

	@Override
	public String toString() {
		String receipt = "";
		for (int i=0 ;i<cashRegister.length; i++) {
			receipt+="NAME: "+cashRegister[i].name+" "+"cost: "+ cashRegister[i].costs()+"\n";
		}
		return receipt;
		
	}
}

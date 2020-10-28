
public class TestCheckout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DessertItem can = new Candy(20); //weight in kilograms
		DessertItem cook = new Cookie(10);
		DessertItem ic = new IceCream();
		DessertItem sd = new Sundae();
		
		DessertItem [] arrDI = new DessertItem[] {can, cook, ic, sd};
		
		Checkout Ck = new Checkout(arrDI);
		System.out.println("Total number of Items= "+Ck.numItems());
		System.out.println("Total Cost= "+Ck.totalCost());
		System.out.println("All Items:");
		Ck.Receipt();
		Ck.clearRegister();
		System.out.println("After Clearing the Checkout, Number of items ="+Ck.numItems());
		
		

	}

}

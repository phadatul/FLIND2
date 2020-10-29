package Day3Asg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy candy = new Candy("Pineapple", 250);
		Cookie cookie = new Cookie("Chocolate",5 );
		IceCream ic = new IceCream("Vanilla");
		Sundae sundae = new Sundae("Vanilla with chocolate");
		
		DessertItem items[] = {candy,ic,cookie,sundae};
		CheckOut c=new CheckOut();
		c.addItems(items);
		System.out.println(c);
		c.clearCart();
		System.out.println(c);
		}
}



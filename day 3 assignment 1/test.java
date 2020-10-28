


public class test {
	public static void main(String[] args)
	{
		Candy candy=new Candy("Orange", 250,10);
		Cookie cookie=new Cookie("Coconut", 5,30);
		IceCream iceCream=new IceCream("Vanilla",50);
		Sundae sundae=new Sundae("Vanilla with Chocolate",50,20);
		
		DessertItem items[]= {candy,iceCream,cookie,sundae};
		
		Checkout c=new Checkout();
		
		c.addItems(items);
		System.out.println(c);
	}

}



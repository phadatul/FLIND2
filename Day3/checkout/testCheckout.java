package checkout;

public class testCheckout {
  public static void main(String[] args) {
    Candy candy = new Candy("Mango Bite", 500);
    Cookie cookie = new Cookie("Oatmeal", 18);
    Icecream icecream = new Icecream("Hazelnut");
    Sundae sundae = new Sundae("Hazelnut with chocochips");

    Dessertitems items[] = { candy, icecream, cookie, sundae };

    Checkout c = new Checkout();

    c.enterItems(items);
    c.printReceipt();
    c.clearItems();
    
  }
}

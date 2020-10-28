package checkout;

public class Checkout {

  Dessertitems cashier[];

  public void enterItems(Dessertitems cart[]) {
    this.cashier = cart;
  }

  public void clearItems() {
    cashier = null;
    System.out.println("Cart has been cleared");

  }

  public double cost() {
    if (this.cashier == null) {
      System.out.println("Cart has been cleared or is empty!");
      return 0;
    } else {
      double price = 0;
      for (Dessertitems x : cashier) {
        price = price + x.cost();
      }
      return price;
    }

  }

  public void printReceipt() {
    if (this.cashier == null) {
      System.out.println("Cart has been cleared or is empty!");

    } else {
      for (Dessertitems x : cashier) {
        System.out.println(x.name() + "..........." + x.cost());
      }
      System.out.println("Total..............." + this.cost());
    }

  }
}

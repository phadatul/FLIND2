package checkout;

public class Cookie extends Dessertitems {

  int noOfCookies;
  int pricePerDozen = 10;

  public Cookie(String name, int qty) {
    super(name);
    this.noOfCookies = qty;
  }

  public double cost() {
    return (this.noOfCookies * this.pricePerDozen) / 12;
  }
}

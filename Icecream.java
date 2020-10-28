package checkout;

public class Icecream extends Dessertitems {
  int cost = 200;

  public Icecream(String name) {
    super(name);
  }

  public double cost() {
    return this.cost;
  }
}

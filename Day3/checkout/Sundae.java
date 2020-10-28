package checkout;

public class Sundae extends Icecream {
  int toppingsCost = 30;

  public Sundae(String name) {
    super(name);
  }

  public double cost() {
    return super.cost() + this.toppingsCost;
  }

}

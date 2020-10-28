package checkout;

public class Candy extends Dessertitems {
  double gms;
  int price;

  public Candy() {

  }

  public Candy(String name, double gms) {
    super(name);
    this.gms = gms;
    this.price = 50;
  }

  public double cost() {
    return (this.gms / 1000) * this.price;
  }

}

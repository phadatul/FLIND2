package checkout;
abstract class Dessertitems {

  private String itemname;

  public Dessertitems() {

  }

  public Dessertitems(String name) {
    this.itemname = name;
  }

  abstract double cost();

  final String name() {
    return this.itemname;
  };
}

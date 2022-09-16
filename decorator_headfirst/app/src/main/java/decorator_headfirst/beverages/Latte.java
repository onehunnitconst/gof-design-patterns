package decorator_headfirst.beverages;

public class Latte extends Beverage {

  public Latte() {
    this.description = "라떼";
  }

  @Override
  public int cost() {
    return 3500;
  }

}

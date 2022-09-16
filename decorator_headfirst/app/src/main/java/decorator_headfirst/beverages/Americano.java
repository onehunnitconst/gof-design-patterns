package decorator_headfirst.beverages;

public class Americano extends Beverage {

  public Americano() {
    this.description = "아메리카노";
  }

  @Override
  public int cost() {
    return 3000;
  }

}

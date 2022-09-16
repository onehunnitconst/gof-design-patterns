package decorator_headfirst.beverages;

public abstract class Beverage {
  protected String description = "음료";

  public String getDescription() {
    return this.description;
  }

  public abstract int cost();
}

package decorator_headfirst.options;

import decorator_headfirst.beverages.Beverage;

public class VanillaSyrup extends CondimentDecorator {

  public VanillaSyrup (Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription () {
    return beverage.getDescription() + ", 바닐라 추가";
  }

  @Override
  public int cost() {
    return beverage.cost() + 500;
  }
  
}

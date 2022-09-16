package decorator_headfirst.options;

import decorator_headfirst.beverages.Beverage;

public class Mocha extends CondimentDecorator {

  public Mocha (Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription () {
    return beverage.getDescription() + ", 모카 추가";
  }

  @Override
  public int cost() {
    return beverage.cost() + 500;
  }
  
}

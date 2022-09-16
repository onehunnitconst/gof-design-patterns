package decorator_headfirst.options;

import decorator_headfirst.beverages.Beverage;

public class CaramelSyrup extends CondimentDecorator {

  public CaramelSyrup (Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription () {
    return beverage.getDescription() + ", 카라멜 추가";
  }

  @Override
  public int cost() {
    return beverage.cost() + 500;
  }
  
}

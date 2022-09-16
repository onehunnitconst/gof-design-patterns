package decorator_headfirst.options;

import decorator_headfirst.beverages.Beverage;

public class EspressoShot extends CondimentDecorator {

  public EspressoShot (Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription () {
    return beverage.getDescription() + ", 샷 추가";
  }

  @Override
  public int cost() {
    return beverage.cost() + 500;
  }
  
}

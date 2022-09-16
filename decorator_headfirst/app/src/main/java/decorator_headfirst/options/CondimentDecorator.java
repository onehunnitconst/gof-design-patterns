package decorator_headfirst.options;

import decorator_headfirst.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package decorator_headfirst;

import decorator_headfirst.beverages.Americano;
import decorator_headfirst.beverages.Beverage;
import decorator_headfirst.beverages.Latte;
import decorator_headfirst.options.CaramelSyrup;
import decorator_headfirst.options.EspressoShot;
import decorator_headfirst.options.Mocha;
import decorator_headfirst.options.VanillaSyrup;

public class App {
  public static void main(String[] args) {
    Beverage americano = new Americano();
    display(americano);

    Beverage doubleShotAmericano = new Americano();
    doubleShotAmericano = new EspressoShot(doubleShotAmericano);
    display(doubleShotAmericano);

    Beverage tripleShotAmericano = new Americano();
    tripleShotAmericano = new EspressoShot(tripleShotAmericano);
    tripleShotAmericano = new EspressoShot(tripleShotAmericano);
    display(tripleShotAmericano);
    
    Beverage latte = new Latte();
    display(latte);

    Beverage vanillaLatte = new Latte();
    vanillaLatte = new VanillaSyrup(vanillaLatte);
    display(vanillaLatte);

    Beverage caramelLatte = new Latte();
    caramelLatte = new CaramelSyrup(caramelLatte);
    display(caramelLatte);

    Beverage mochaLatte = new Latte();
    mochaLatte = new Mocha(mochaLatte);
    display(mochaLatte);
  }

  public static void display(Beverage beverage) {
    System.out.println(beverage.getDescription() + " (" + beverage.cost() + "원)");
  }
}

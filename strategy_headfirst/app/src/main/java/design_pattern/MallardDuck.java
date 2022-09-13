package design_pattern;

public class MallardDuck extends Duck {

  public MallardDuck() {
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
  }

  @Override
  public void swim() {
    System.out.println("물오리가 헤엄을 칩니다.");
  }
  
}

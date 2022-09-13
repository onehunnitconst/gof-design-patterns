package design_pattern;

public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public abstract void swim();

  public void display() {
    System.out.println("오리 보여주기");
  }
}

package design_pattern;

public class TubeDuck extends Duck {
  public TubeDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Squeak();
  }

  @Override
  public void swim() {
    System.out.println("튜브 오리가 둥둥 떠다니네요");
  }
}
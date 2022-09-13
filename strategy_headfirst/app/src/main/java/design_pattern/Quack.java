package design_pattern;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("오리 꽥꽥");
  }
}

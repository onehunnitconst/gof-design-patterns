package design_pattern;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("튜브오리 꽉꽉");
  }
}

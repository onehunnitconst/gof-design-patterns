package design_pattern;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("이 오리는 날지 못합니다.");
  }
}

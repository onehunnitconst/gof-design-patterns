package design_pattern;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("오리가 날고 있어요");
  }
}

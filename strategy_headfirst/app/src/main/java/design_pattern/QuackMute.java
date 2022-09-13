package design_pattern;

public class QuackMute implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("이 오리는 울지 않아요!");
  }
}

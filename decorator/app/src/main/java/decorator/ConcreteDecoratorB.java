package decorator;

public class ConcreteDecoratorB extends Decorator {

  public ConcreteDecoratorB (Component component) {
    this.component = component;
  }

  @Override
  public String operation() {
    return this.component.operation() + "그리고 나는 데코레이터 B를 가지고 있습니다.";
  }
  
}

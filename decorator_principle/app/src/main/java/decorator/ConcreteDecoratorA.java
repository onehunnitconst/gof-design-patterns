package decorator;

public class ConcreteDecoratorA extends Decorator {

  public ConcreteDecoratorA (Component component) {
    this.component = component;
  }

  @Override
  public String operation() {
    return this.component.operation() + "그리고 나는 데코레이터 A를 가지고 있습니다.";
  }
  
}

package lambda;

@FunctionalInterface
interface StringFactory {
  String strfactory();
}

public class Test2 {

  public String operator(StringFactory stringFactory) {
    return stringFactory.strfactory();
  }

  public static void main(String[] args) {
    Test2 test2 = new Test2();
    String str = test2.operator(String::new);
    System.out.println(str);
  }
}

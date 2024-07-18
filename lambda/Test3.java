package lambda;

import java.util.Random;

@FunctionalInterface
interface RandomFactory {
  Random ranfactory();
}

public class Test3 {
  public Random operator(RandomFactory randomFactory) {
    return randomFactory.ranfactory();
  }

  public static void main(String[] args) {
    Test3 test3 = new Test3();
    Random random = test3.operator(Random::new);
    System.out.println(random);
  }
}

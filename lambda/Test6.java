package lambda;

import java.util.Arrays;
import java.util.List;

public class Test6 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10);

    int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
    System.out.println(sum);
  }
}

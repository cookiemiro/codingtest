package generic.genericmethodEx;

import generic.classEx.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box1 = boxing(100);

    int value = box1.getType();

    System.out.println(value);

    Box<String> box2 = boxing("포켓몬 포토카드");

    String card = box2.getType();

    System.out.println(card);

    Box<Doll> box3 = boxing(new Doll());

    Doll doll = box3.getType();

    System.out.println(doll.name);


  }

  public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<T>();
    box.setType(t);
    return box;
  }
}

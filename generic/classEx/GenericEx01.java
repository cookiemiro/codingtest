package generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Box box = new Box();
    box.content = new Doll(); // 자동 업캐스팅;

    Product<SmartPhone, String > p1 = new Product<>();

    p1.setKind(new SmartPhone());
    p1.setModel("애플15pro");

    SmartPhone applePhone = p1.getKind();
    String model = p1.getModel();

  }
}

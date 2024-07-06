package classtest.polymorphism;

public class Coffee extends Beverage {

  public static int amount;

  public int getAmount() {
    return amount;
  }

//  public void setAmount(int amount) {
//    this.amount = amount;
//  }

  public Coffee(String name) {

    super(name);
    switch (name) {
      case "Americano" -> price = 1500;
      case "CafeLatte" -> price = 2500;
      case "Cappuccino" -> price = 3000;
    }
    amount++;
  }

  @Override
  public void calcPrice() {

  }
}

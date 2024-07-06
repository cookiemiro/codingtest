package classtest.polymorphism;

public class Tea extends Beverage {

    public static int amount;

    public Tea(String name) {
        super(name);
        switch (name) {
            case "lemonTea" -> price = 1500;
            case "ginsengTea" -> price = 2000;
            case "redginsengTea" -> price = 2500;
        }
        amount++;
    }
    @Override
    public void calcPrice() {

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

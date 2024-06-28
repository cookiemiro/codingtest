package classprac.test;

public class Drink {
    String name;
    int price;
    int count;

    public Drink(){};

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return this.price * this.count;
    }

    public static void printTitle() {
        System.out.println("상품명   단가    수량    금액");
    }

    public void printData() {
        System.out.println(this.name + "     " + this.price + "    " + this.count + "       " + getTotalPrice());
    }
}

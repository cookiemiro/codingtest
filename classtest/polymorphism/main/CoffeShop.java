package classtest.polymorphism.main;


import classtest.polymorphism.Beverage;
import classtest.polymorphism.Coffee;
import classtest.polymorphism.Tea;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);

		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
	}

	private static void getSalesInfo(Beverage[] beverage) {
		int index = 1;
		for (Beverage b : beverage) {
			System.out.printf("%d번째 판매 음료는 %s이며, 가격은 %d\n", index, b.getName(), b.getPrice());
		}
	}

	public static int getTotalPrice(Beverage[] beverage) {
		int total = 0;
		for (Beverage b : beverage) {
			total += b.getPrice();
		}
		return total;
	}
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
}

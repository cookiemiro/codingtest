package classtest.polymorphism;


public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);

		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"��");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���







  //결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
}
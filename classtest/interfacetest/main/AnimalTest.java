package classtest.interfacetest.main;

import classtest.interfacetest.Animal;
import classtest.interfacetest.Cheatable;
import classtest.interfacetest.Chicken;
import classtest.interfacetest.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

        if (cheatableChicken instanceof Cheatable) {
            cheatableChicken.fly();
        }

        int hours = 1;
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "시간 후");
            dog.run(hours);
            System.out.println("개의 이동거리=" + dog.getDistance());
            chicken.run(hours);
            System.out.println("닭의 이동거리=" + chicken.getDistance());
            cheatableChicken.run(hours);
            System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
		}
	}
}










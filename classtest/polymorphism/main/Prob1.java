package classtest.polymorphism.main;

import classtest.polymorphism.Bike;
import classtest.polymorphism.Truck;

public class Prob1 {
    public static void main(String[] args) {
        Truck truck = new Truck("트럭", 100, 4);
        Bike bike = new Bike("자전거", 25, 2);

        System.out.println(truck.getCarName() + " : " + "바퀴 " + truck.getWheelNumber() +"개입니다.");
        System.out.println(bike.getCarName() + " : " + "바퀴 " + bike.getWheelNumber() +"개입니다.");
        System.out.println("트럭의 현재 속도는 " + truck.getVelocity() + " 입니다.");
        System.out.println("자전거의 현재 속도는 " + bike.getVelocity() + " 입니다.");

        truck.speedDown(40);
        bike.speedDown(5);

        truck.stop();
        bike.stop();

        truck.setVelocity(50);
    }
}

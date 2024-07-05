package classtest.polymorphism;

public class Truck extends Wheeler {
    public Truck(String carName, int velocity) {
        this.carName = carName;
        this.velocity = velocity;
    }

    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    public void speedUp(int speed) {
        System.out.println("트럭의 속도가 증가합니다.");
        if (speed > 100) {
            System.out.println("트럭의 최고속도위반으로 속도를 100으로 줄입니다.");
            this.velocity = 100;
            return;
        }
        this.velocity += 5*speed;
    }

	public void speedDown(int speed) {
        System.out.println("트럭의 속도가 감소합니다.");
        if (speed < 50) {
            System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
            this.velocity = 50;
            return;
        }

        this.velocity -= 5*speed;
    }


}

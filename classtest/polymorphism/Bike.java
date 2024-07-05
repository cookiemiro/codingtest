package classtest.polymorphism;

public class Bike extends Wheeler{

  public Bike(String carName, int velocity) {
    this.carName = carName;
    this.velocity = velocity;
  }

  public Bike(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    if (speed > 40) {
      this.velocity = 40;
      System.out.println("자전거의 최고속도위반으로 속도를 40으로 줄입니다.");
      return;
    }
    this.velocity += speed;
  }

  @Override
  public void speedDown(int speed) {
    if (speed < 10) {
      this.velocity = 10;
      System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
      return;
    }
    this.velocity -= speed;
  }
}

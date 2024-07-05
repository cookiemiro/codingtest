package classtest.polymorphism;

public abstract class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	abstract public void speedUp(int speed);

	abstract public void speedDown(int speed);

	public void stop(){
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}

	public int getVelocity() {
		return this.velocity;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
		System.out.println(this.carName + "의 현재 속도는 " + this.velocity + " 입니다.");
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public int getWheelNumber() {
		return this.wheelNumber;
	}
}


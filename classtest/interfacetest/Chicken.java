package classtest.interfacetest;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        // TODO Auto-generated method stub
        double distance = getSpeed() * hours;
        setDistance(distance);
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        int speed = getSpeed() * 2;
        setSpeed(speed);
    }
}

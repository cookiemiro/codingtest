package classtest.interfacetest;

public class Dog extends Animal{
    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        // TODO Auto-generated method stub
        double distance = getSpeed() * hours;
        setDistance(distance/2);
    }
}

package classtest.interfacetest;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}

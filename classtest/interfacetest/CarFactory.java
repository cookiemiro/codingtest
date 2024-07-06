package classtest.interfacetest;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }
    @Override
    public int makeProducts(char skill) {
        int skillNum = 0;
        switch (skill) {
            case 'A' -> {
                skillNum = 3;
            }
            case 'B' -> {
                skillNum = 2;
            }
            case 'C' -> {
                skillNum = 1;
            }
        }
        return skillNum * getWorkingTime();
    }

//    abstract class와 interface의 형변환
    @Override
    public int workTogether(IWorkingTogether partner) {
        Factory otherFactory = (Factory) partner;
        int additionalOutput = otherFactory.makeProducts('B');
        return additionalOutput;
    }
}

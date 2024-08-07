package classtest.interfacetest;

public class TVFactory extends Factory implements IWorkingTogether {

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }
    @Override
    public int makeProducts(char skill) {
        int skillNum = 1;
        switch (skill) {
            case 'A' -> skillNum = 8;
            case 'B' -> skillNum = 5;
            case 'C' -> skillNum = 3;
        }
        return skillNum * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
//        pattern variable
        if (partner instanceof Factory otherFactory) {
            return otherFactory.makeProducts('C');
        }
        return 0;
    }
}

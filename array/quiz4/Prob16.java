package array.quiz4;

public class Prob16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}

class Printer {
    public void println(int value) {
        System.out.println("int value called!");
    }

    public void println(boolean value) {
        System.out.println("boolean value called!");
    }

    public void println(double value) {
        System.out.println("double value called!");
    }

    public void println(String value) {
        System.out.println("String value called!");
    }
}
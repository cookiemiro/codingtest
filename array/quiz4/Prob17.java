package array.quiz4;

public class Prob17 {
    public static void main(String[] args) {
        Printer_17.println(10);
        Printer_17.println(true);
        Printer_17.println(5.7);
        Printer_17.println("홍길동");
    }
}

class Printer_17 {
    public static void println(int value) {
        System.out.println("int value called!");
    }

    public static void println(boolean value) {
        System.out.println("boolean value called!");
    }

    public static void println(double value) {
        System.out.println("double value called!");
    }

    public static void println(String value) {
        System.out.println("String value called!");
    }
}
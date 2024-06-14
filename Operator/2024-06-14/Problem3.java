import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() + 5;
        int b = sc.nextInt() * 2;

        System.out.println("width = " + a);
        System.out.println("length = " + b);
        System.out.println("area = " + (a * b));
    }
}

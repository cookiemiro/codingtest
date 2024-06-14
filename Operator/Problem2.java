import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d %d", a+100, b % 10);
    }
}
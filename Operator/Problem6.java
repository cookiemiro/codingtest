import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d > %d --- %d\n", a, b, a > b ? 1 : 0);
        System.out.printf("%d < %d --- %d\n", a, b, a < b ? 1 : 0);
        System.out.printf("%d >= %d --- %d\n", a, b, a >= b ? 1 : 0);
        System.out.printf("%d <= %d --- %d", a, b, a <= b ? 1 : 0);
    }
}
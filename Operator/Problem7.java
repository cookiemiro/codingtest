
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a != 0) {
            c = 1;
        } else {
            c = 0;
        }

        if (b != 0) {
            d = 1;
        } else {
            d = 0;
        }

        System.out.printf("%d %d\n", a * b != 0 ? 1 : 0, a + b != 0 ? 1 : 0);
        System.out.println();
        System.out.println("[JAVA]");
        System.out.printf("%s %s", c * d == 0 ? "false" : "true", c + d == 0 ? "false" : "true");
    }
}
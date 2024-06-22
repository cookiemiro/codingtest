package loop.first;

import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Base = ");
            int num1 = sc.nextInt();
            System.out.print("Height = ");
            int num2 = sc.nextInt();

            float width = num1 * num2 / (float) 2;

            System.out.printf("Triangle width = %.1f\n", width);

            System.out.print("Continue? ");
            String str = sc.next();

            char ch = str.charAt(0);

            if (ch == 'Y' || ch == 'y') {
                continue;
            } else {
                break;
            }

        }

        sc.close();
    }
}

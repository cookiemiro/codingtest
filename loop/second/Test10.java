package loop.second;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            if (num1 < num2) {
                for (int j = num1; j <= num2; j++) {
                    if (i * j < 10) {
                        System.out.printf("%d * %d =  %d   ", j, i, i * j);
                    } else {
                        System.out.printf("%d * %d = %d   ", j, i, i * j);
                    }
                }
                System.out.println();
            } else {
                for (int j = num1; j >= num2; j--) {
                    if (i * j < 10) {
                        System.out.printf("%d * %d =  %d   ", j, i, i * j);
                    } else {
                        System.out.printf("%d * %d = %d   ", j, i, i * j);
                    }
                }
                System.out.println();
            }
        }
    }
}

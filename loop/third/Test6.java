package loop.third;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                if (i == 0 && num == 1) {
                    System.out.print(" " + num);
                } else {
                    System.out.print(num++ + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

package loop.third;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int cnt = 1;
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j >= 2 * (n - i) + 1 && j % 2 != 0) {
                    System.out.print(cnt++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

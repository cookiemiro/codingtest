package loop.third;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int ch = 65;

        for (int i = 0; i < n; i++) {    
            for (int j = 0; j < n - i; j++) {
                System.out.print(a++ + " ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.printf("%c ", (char)ch++);
            }
            System.out.println();
        }

        sc.close();
    }
}

package loop.second;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}

package loop.third;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        int cnt = 0;
        int sum = 0;

        while (true) {
            if (sum >= n) {
                break;
            }

            sum += i;
            i += 2;
            cnt++;
        }

        System.out.println(cnt + " " + sum);

        sc.close();
    }
}

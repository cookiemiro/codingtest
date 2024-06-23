package loop.third;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int avg = 0;

        for (int i = 0; i < 20; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
            cnt++;
        }

        avg = sum / cnt;

        System.out.print(sum + " " + avg);

        sc.close();
    }
}

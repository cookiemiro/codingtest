package loop.first;

import java.util.Scanner;

public class LoopProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;

        while (true) {
            int num = sc.nextInt();

            sum += num;
            cnt++;
            float avg = sum / (float)cnt;
            if (num >= 100) {
                System.out.println(sum);
                System.out.printf("%.1f\n", avg);
                break;
            }
        }

        sc.close();
    }
}

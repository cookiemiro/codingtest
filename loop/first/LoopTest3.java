package loop.first;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        float avg;
        
        while (true) {
            int num = sc.nextInt();

            if (num > 100 || num < 0) {
                break;
            }
            sum += num;
            cnt++;
        }

        avg = sum / (float) cnt;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}

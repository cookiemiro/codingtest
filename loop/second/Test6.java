package loop.second;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;
        int cnt = 0;
        float avg;

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt ++;
            }
        }

        avg = (float)sum / cnt;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);

        sc.close();
    }
}

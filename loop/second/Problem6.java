package loop.second;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int point = sc.nextInt();

            sum += point;
        }

        float avg = sum / (float)num;

        System.out.printf("avg : %.1f\n", avg);

        if (avg > 80.0) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        sc.close();
    }
}

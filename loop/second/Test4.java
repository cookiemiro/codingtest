package loop.second;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int point = sc.nextInt();

            sum += point;
        }

        float avg = sum / (float)num;

        System.out.printf("%.2f", avg);

        sc.close();
    }
}

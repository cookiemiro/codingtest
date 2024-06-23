package loop.second;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

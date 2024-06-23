package loop.second;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i <= num * 10; i += num) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

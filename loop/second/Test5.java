package loop.second;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        System.out.println("even : " + evenNum);
        System.out.println("odd : " + oddNum);

        sc.close();
    }
}

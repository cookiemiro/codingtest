package loop.first;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        boolean breakCondition = false;

        while(!breakCondition) {
            String[] strArr = sc.nextLine().split(" ");

            for (String str : strArr) {
                int num = Integer.parseInt(str);
                if (num == 0) {
                    breakCondition = true;
                    break;
                }
    
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}

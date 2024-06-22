package loop.first;

import java.util.Scanner;

public class LoopProblem5 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
    
            int num = sc.nextInt();
    
            if (num == -1) {
                break;
            }

            if (num % 3 != 0) {
                continue;
            } else {
                int quotient = num / 3;
                System.out.println(quotient);
            }
        }
    }
}

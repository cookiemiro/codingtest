package loop;

import java.util.Scanner;

public class LoopProblem3 {
    public static void main(String[] args) {
        Scanner sc = null;

        while (true) {
            System.out.print("numbers? ");
            sc = new Scanner(System.in);
            
            int num = sc.nextInt();

            System.out.println(num);

            if (num == 0) {
                break;
            }

            if (num > 0) {
                System.out.println("positive integer");
            } else if (num < 0) {
                System.out.println("negative number");
            }
        }

        sc.close();
    }
}

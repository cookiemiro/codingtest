package loop;

import java.util.Scanner;

public class LoopProblem6 {
    public static void main(String[] args) {
        System.out.println("1. Korea");
        System.out.println("2. USA");
        System.out.println("3. Japan");
        System.out.println("4. China");
        while (true) {
            System.out.print("number? ");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            
            if (num >= 5) {
                System.out.println("none");
                break;
            }

            switch (num) {
                case 1 -> System.out.println("Seoul");
                case 2 -> System.out.println("Washington");
                case 3 -> System.out.println(
                    "Tokyo"
                );
                case 4 -> System.out.println("Beijing");
            }
        }
    }
}

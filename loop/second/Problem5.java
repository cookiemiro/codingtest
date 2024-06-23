package loop.second;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int multiplesOf3Cnt = 0;
        int multiplesOf5Cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 3 == 0) {
                multiplesOf3Cnt++;
            }

            if (num % 5 == 0) {
                multiplesOf5Cnt++;
            }
        }

        System.out.println("Multiples of 3 : " + multiplesOf3Cnt);
        System.out.println("Multiples of 5 : " + multiplesOf5Cnt);

        sc.close();
    }
}

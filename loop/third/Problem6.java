package loop.third;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int chr = 65;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%c", chr++);
            }
            System.out.println();
        }
        
        sc.close();
    }
}

package loop.second;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        for (int i = 0; i < 20; i++) {
            System.out.print(ch);
        }

        sc.close();
        
    }
}

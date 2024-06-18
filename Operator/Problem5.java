package operator;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean c = (a==b);
        boolean d = (a != b);

        System.out.println(c);
        System.out.println(d);
    }
}
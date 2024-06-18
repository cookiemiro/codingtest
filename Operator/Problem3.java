package operator;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.printf("%d\n", a++);
        a++;
        System.out.println(a);
    }
}
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a++;
        System.out.printf("%d %d %d", a, --b, temp*b);
    }
}
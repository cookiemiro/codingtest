import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, sum, avg;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        sum = a + b + c + d;
        avg = (int)(sum / 4);

        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }
}
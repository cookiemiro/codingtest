import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int share = a / b;
        int remain = a % b;

        System.out.printf("%d / %d = %d...%d", a, b, share, remain);
    }
}

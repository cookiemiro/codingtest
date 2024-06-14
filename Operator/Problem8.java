import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.printf("%d %d", compareNumsMax(a, b, c), compareNums(a, b, c));
    }

    private static int compareNumsMax(int a, int b, int c) {
        if ((a > b & a > c) ) {
            return 1;
        }

        return 0;
    }

    private static int compareNums(int a, int b, int c) {
        if ((a == b) & (a == c) & (b == c)) {
            return 1;
        }

        return 0;
    }
}
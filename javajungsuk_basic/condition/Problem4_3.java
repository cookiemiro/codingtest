package javajungsuk_basic.condition;

public class Problem4_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

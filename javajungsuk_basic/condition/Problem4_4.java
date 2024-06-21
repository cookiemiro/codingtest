package javajungsuk_basic.condition;

public class Problem4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum < 100) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }

            i++;

            // System.out.print(i + " ");
        }

        System.out.println(i);
    }
}

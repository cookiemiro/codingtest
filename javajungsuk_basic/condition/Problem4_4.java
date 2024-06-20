package javajungsuk_basic.condition;

public class Problem4_4 {
    public static void main(String[] args) {
        int cnt = 0;
        int sum = 0;
        int i = 1;

        while (sum < 100) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }

            i++;
            cnt++;
        }

        System.out.println(cnt);
    }
}

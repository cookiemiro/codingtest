package javajungsuk_basic.condition;

public class Problem4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println((int)str.charAt(i));
            sum += (int)str.charAt(i) - 48;
        }

        System.out.println("sum=" + sum);
    }
}

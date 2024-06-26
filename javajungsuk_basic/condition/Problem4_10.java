package javajungsuk_basic.condition;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem4_10 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100) + 1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");


            input = sc.nextInt();

            if (answer == input) {
                System.out.println("맞혔습니다.");
                System.out.printf("시도횟수는 %d번입니다.", count);
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        } while(true);

        sc.close();
    }

    private static boolean isNumber(String input) {
        return Pattern.matches("^[0~100]", input);
    }
}

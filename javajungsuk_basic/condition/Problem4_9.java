package javajungsuk_basic.condition;

public class Problem4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        
        while(num != 0){
            sum += num % 10; // 첫 째 자리수
            num /= 10;	// 10을 나누어 첫 째 자리를 없앤다
        }


        System.out.println("sum="+sum);
    }
}

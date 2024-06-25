package array;

public class Prob1 {
    public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
        System.out.println("( 배열 ia )");
        solution(ia);
        System.out.println("( 배열 ib )");
        solution(ib);
	
	}

    private static void solution(int[] arr) {
        // 홀수 합
        int oddSum = 0;

        // 짝수 합
        int evenSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("홀수의 합 : " + oddSum);
        System.out.println("짝수의 합 : " + evenSum);
    }
}

package array.quiz3;

import java.util.Arrays;

public class Prob2 {
    public static void main(String[] args) {
        System.out.println("<< 생성된 난수 >>");
        int[] arr = generateRandom();
        System.out.println(Arrays.toString(arr));

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("======================");
        int maxNum = getMaxNum(arr);
        System.out.println("배열에서 가장 큰 숫자 : " + maxNum);
        
    }
    
    private static int[] generateRandom() {
        int[] arr = new int[10];

        
        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random()*30) + 1;
            arr[i] = random;
        }

        return arr;
    }

    private static int getMaxNum(int[] arr) {
        // Math.max(0, 0);
        int maxNum = arr[0];

        for (int a : arr) {
            if (maxNum < a) {
                maxNum = a;
            }
        }

        return maxNum;
    }
}

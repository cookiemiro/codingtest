package array.quiz4;

public class Prob7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        
        solution(arr);
    }
    
    private static void solution(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}

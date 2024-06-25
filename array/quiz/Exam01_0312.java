package array.quiz;

public class Exam01_0312 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 80, 50};
        solution(arr);
    }

    private static void solution(int[] arr) {
        int total = 0;
        
        for (int num : arr) {
            total += num;
        }

        double percent;

        for (int i = 0; i < arr.length; i++) {

            percent = (double) (arr[i] * 100) / total;
            for (int j = 0; j < (int)percent; j++) {
                System.out.print("*");
            }
            System.out.println("(" + percent + "%)");
        }
    }
}

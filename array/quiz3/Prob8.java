package array.quiz3;

public class Prob8 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        
        for (int i = 1; i <= arr.length; i++) {
            int startNum = 5 * i;
            for (int j = 0; j < arr[i - 1].length; j++) {
                arr[i - 1][j] = startNum--;
            }
        }

        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + "  ");
            }
            System.out.println();
        }
    }
}

package array;

public class ArrayExam02 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random() * 100) + 1;

            arr[i] = random;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}

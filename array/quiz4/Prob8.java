package array.quiz4;

public class Prob8 {
    public static void main(String[] args) {
        int[][] arr = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        solution(arr);
    }

    private static void solution(int[][] arr) {
        int total = 0;

        int totalLength = 0;

        for (int i = 0; i < arr.length; i++) {
            totalLength += arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }

        double avg;

        avg = (double) total / totalLength;

        System.out.println("total : " + total);
        System.out.println("avg : " + avg);
    }
}

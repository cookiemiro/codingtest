package loop.second;

public class Problem8 {
    public static void main(String[] args) {     
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                if (j == 5) {
                    System.out.printf("%d * %d = %d\n", i, j, i*j);
                } else if (i * j >= 10) {
                    System.out.printf("%d * %d = %d   ", i, j, i*j);
                } else {
                    System.out.printf("%d * %d =  %d   ", i, j, i*j);
                }
            }
        }
    }
}

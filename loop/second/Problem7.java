package loop.second;

public class Problem7 {
    public static void main(String[] args) {
        for (int i = 2; i <= 6; i++) {
            for (int j = i; j < i + 5; j++) {
                if (j == i + 4) {
                    System.out.println(j);
                } else {
                    System.out.print(j + " ");
                }
            }
        }
    }
}

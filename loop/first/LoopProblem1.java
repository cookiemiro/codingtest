package loop.first;

public class LoopProblem1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (i <= 15) {
            if (i < 15) {
                sb.append(i + " ");
            } else {
                sb.append(i);
            }
            i++;
        }
        
        System.out.println(i);
        System.out.println(sb);
    }
}

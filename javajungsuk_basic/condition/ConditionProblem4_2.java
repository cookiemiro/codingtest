package javajungsuk_basic.condition;

public class ConditionProblem4_2 {
    public static void main(String[] args) {
        ConditionProblem4_2 cd = new ConditionProblem4_2();
        cd.solution();
    }

    private void solution() {
        int sum = 0;
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0) 
                continue;
            sum += i;
        }

        System.out.println(sum);
    }
}

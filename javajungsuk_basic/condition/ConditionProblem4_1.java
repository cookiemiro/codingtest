package javajungsuk_basic.condition;

public class ConditionProblem4_1 {
    public static void main(String[] args) {    
        
    }

    private static boolean condition(int x) {
        if ((x > 10 && x < 20) || (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))) {
            return true;
        }
        return false;
    }

    private static boolean condition(char ch) {
        if (ch != ' ' || ch != '\t' || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }

    private static boolean condition(boolean bool) {
        if (!bool) {
            return true;
        }
        return false;
    }

    private static boolean condition(String str) {
        if (str.equals("yes")) {
            return true;
        }
        return false;
    }
}

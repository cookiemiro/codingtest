package homework;

public class HomeworkBasic {
    public static void main(String[] args) {
        method3();
    }

    private static void method1() {
        System.out.println("소스파일 확장자: .java");
        System.out.println("컴파일된 파일의 확장자: .class");
    }

    private static void method2() {
        System.out.println("파일이름 : Shape.java");
        System.out.println("출력결과 : Shape");
    }

    private static void method3() {
        System.out.println("sum = sum > 100 ? 100 : 0");
    }

    private static void method4() {
        System.out.println("(2), (4)");
    }

    private static void method5() {
        System.out.println("(1) int height;");
        System.out.println("(2) double size = 0.25;");
        System.out.println("(3) double total = (size + height);");
        System.out.println("(4) char c = 'a';");
        System.out.println("(5) String name = \"taeui\"");
    }

    private static void method6789() {
        System.out.println("""
                    6. public class SampleProgram {
                        public staic void main(String[] args) {
                            int k = 10;
                            int j = 20;
                            int result = k + j;
                            System.out.println(result);
                        }
                    }
                """);

        System.out.println("7. SampleProgram.java");
        System.out.println("8. javac SampleProgram.java");
        System.out.println("9. java SampleProgram");
    }

    private static void method10() {
        System.out.println("X");
        System.out.println("X");
        System.out.println("X");
        System.out.println("O");
    }

    private static void method11() {
        System.out.println("Scanner");
    }

    private static void method12() {
        System.out.println("extends");
    }

    private static void method13() {
        System.out.println("오버로딩");
    }

    private static void method14() {
        System.out.println("double");
    }

    private static void method15() {
        System.out.println("""
                    int add(int a, int b, int c) { return a + b + c;}
                """);
    }

    private static void method16() {
        System.out.println("1 3 5 7 9 ");
    }

    private static void method17() {
        System.out.println("1) sum += i");

        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            sum += i;
        }

        System.out.println("2) 실행결과 => 총합 : " + sum);
    }
}

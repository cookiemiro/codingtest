package array.quiz4;

import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isfinished = false;
        int[] students = null;
        
        while (!isfinished) {    
            System.out.println("-----------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------");
    
            System.out.print("선택> ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("학생수> ");
                    int arrLength = sc.nextInt();
                    students = new int[arrLength];
                    break;
                case 2:
                    for (int i = 0; i < students.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        int ele = sc.nextInt();
                        students[i] = ele;
                    }
                    break;
                case 3:
                    for (int i = 0; i < students.length; i++) {
                        int result = students[i];
                        System.out.println("scores[" + i + "]> " + result);
                    }
                    break;
                case 4:
                    int total = students[0];
                    int max = students[0];
                    double avg;
                    for (int i = 1; i < students.length; i++) {
                        if (max < students[i]) {
                            max = students[i];
                        }

                        total += students[i];
                    }

                    avg = total / (double)students.length;

                    System.out.println("최고 점수: " + max);
                    System.out.printf("평균 점수: %.1f\n", avg);
                    break;

                case 5:
                    isfinished = true;
                    System.out.println("프로그램 종료");
                    break;
    
                default:
                    break;
            }
        }

        sc.close();
    }
}

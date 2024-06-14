import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] str1 = sc.nextLine().split(" ");
            String[] str2 = sc.nextLine().split(" ");

            if (Integer.parseInt(str1[0]) > Integer.parseInt(str2[0]) && Integer.parseInt(str1[1]) > Integer.parseInt(str2[1])) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
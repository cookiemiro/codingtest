package classtest.string.s_01;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();
		StringBuilder sb = new StringBuilder();
		int len = inputStr.length();
		//프로그램을 구현하세요.
		for (int i = 0; i < len; i++) {
			char chr = inputStr.charAt(len - 1 - i);
			sb.append(chr);
		}

		System.out.println(sb.toString().toUpperCase());
	}

}

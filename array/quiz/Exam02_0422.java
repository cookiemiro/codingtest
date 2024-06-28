package array.quiz;
public class Exam02_0422 {
	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start='A';
		int charToNum = (int) start;
		
		//1.배열에 알파벳 입력
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = (char)charToNum++;
			}
		}
		
		//2.원본 배열 출력
		System.out.println("	    원본 배열		");
		System.out.println("==================================");
		for (char[] a : alphabet) {
			for (char b : a) {
				System.out.print(b + "	");
			}
			System.out.println();
		}

		charToNum = (int) start;
                //3. 배열 수정
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				if (i != j) {
					alphabet[i][j] = (char)charToNum;
				} else {
					alphabet[i][j] = '*';
				}
				charToNum++;
			}
		}

		//4. 수정된 배열 출력
		System.out.println("	   수정된 배열		");
		System.out.println("==================================");
		for (char[] a : alphabet) {
			for (char b : a) {
				System.out.print(b + "	");
			}
			System.out.println();
		}
	}
}
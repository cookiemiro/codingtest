package array.quiz3;
public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {			
		// 구현하세요.
		// 리팩토링 필요..
		for (int i = 0; i < array.length; i++) {
			int num1 = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (num1 == array[j]) {
					array[i] = 0;
					array[j] = 0;
				}
			}
		}

		for (int a : array) {
			if (a == 0) {
				continue;
			}
			System.out.print(a + ", ");
		}
	}
}

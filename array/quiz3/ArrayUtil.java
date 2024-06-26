package array.quiz3;

public class ArrayUtil {
	public static void main(String[] args){
		ArrayUtil arrayUtil = new ArrayUtil();
		
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};

		char[] b = arrayUtil.reverseString(s, 0, 10);

		System.out.println(b);
	}

	public char[] reverseString(char[] s, int start, int end) {
		
		//reverseString 메소드 구현
		int difference = end - start + 1;

		char[] newArr = new char[difference];

		int startNum = 0;

		for (int i = start; i < end + 1; i++) {
			newArr[startNum++] = s[end + 1 - startNum];
		}

		startNum = 0;

		for (int i = start; i < end + 1; i++) {
			s[i] = newArr[startNum++];
		}

		return s;
	}
}

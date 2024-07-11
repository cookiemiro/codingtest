package classtest.string.s_03;

public class FindCharacters {


	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'i');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
		char[] charArr = str.toCharArray();
		int cnt = 0;

		for (char chr : charArr) {
			if (chr == c) {
				cnt++;
			}
		}

		return cnt;
	}
}

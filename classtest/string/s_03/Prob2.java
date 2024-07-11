package classtest.string.s_03;

public class Prob2 {
	public static void main(String[] args) {
		Prob2 p = new Prob2();
		String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}
	}

	public String[] split(String str, char separator){
//		String[] strArr = str.split(String.valueOf(separator));
//
//		return strArr;
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == separator) {
				cnt++;
			}
		}

		String[] strArr = new String[cnt + 1];

		StringBuilder sb = new StringBuilder();

		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == separator) {
				strArr[index] = sb.toString();
				index++;
				int num = sb.length();
				sb = sb.delete(0, num + 1);
			} else {
				sb.append(str.charAt(i));
			}

			if (i == str.length() - 1) {
				strArr[index] = sb.toString();
			}
		}

		return strArr;
	}
}




















package array.quiz3;
public class Prob5 { 
	public static int getValue(int[] values, boolean isMax) { 
		
		int maxNum = values[0];
		int minNum = values[0];

		for (int i = 1; i < values.length; i++) {
			if (maxNum < values[i]) {
				maxNum = values[i];
			}

			if (minNum > values[i]) {
				minNum = values[i];
			}
		}

		// int 타입 배열의 최대값 또는 최소값을 리턴한다.
		if (isMax) {
			return maxNum;
		} else {
			return minNum;
		}

	} 
	
	public static void main(String[] args) { 
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};
		
		int maxValue = getValue(values, true);
		int minValue = getValue(values, false); 
		
		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue); 

	} 
}

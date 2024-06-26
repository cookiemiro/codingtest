package array.quiz3;

import java.util.Arrays;

public class SortUtil {
	public static void main(String[] args){
		SortUtil util = new SortUtil();
		
		int[] arr = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

		int[] sortedArr = util.ascending(arr);

		System.out.println(Arrays.toString(sortedArr));
	}

	public int[] ascending(int[] inputNumbers) {
    	// implements ascending method.
		for (int i = 0; i < inputNumbers.length; i++) {
			for (int j = i + 1; j < inputNumbers.length; j++) {
				int temp = inputNumbers[i];
				if (temp > inputNumbers[j]) {
					inputNumbers[i] = inputNumbers[j];
					inputNumbers[j] = temp;
				}
			}
		}
		return inputNumbers;
	}
}

package array.quiz3;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		int total = 0;
		double avg = 0.0;

		// 메소드를 완성하세요
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}

		avg = (double) total / values.length;
		System.out.println(avg);

		double[] arr = new double[values.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs(avg - values[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		double minNum = arr[0];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (minNum > arr[i]) {
				minNum = arr[i];
				index = i;
			}
		}

		return values[index];
	}
}

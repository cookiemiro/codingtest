package array.quiz3;
public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		System.out.println();

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		System.out.println();

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}

	public void calculate(int[] nums) throws Exception {
		// calculate 메소드 구현

		int total = 0;
        
        for (int num : nums) {
            total += num;
        }

        double percent;

        for (int i = 0; i < nums.length; i++) {

            percent = Math.round((((nums[i] * 100) / (double)total) * 10) / 10.0);
            for (int j = 0; j < (int)percent; j++) {
                System.out.print("*");
            }
            System.out.printf("(%.1f%%)\n", percent);
        }
	}
}
package single;

public class FindSingleNumberFunction {
	public int singleNumber(int[] nums) {
		int answer = 0;

		// Go through the whole array
		for (int i = 0; i != nums.length; i++) {
			// answer = A ^ B ^ A ... = B
			// A ^ A = 0
			// 0 ^ B = B
			// ^ = XOR
			answer = answer ^ nums[i];
		}

		return answer;
	}
}

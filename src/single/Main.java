package single;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,4,3,1,4};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindSingleNumberFunction solution = new FindSingleNumberFunction();
		
		System.out.println("Solution: " + solution.singleNumber(nums));
	}
}

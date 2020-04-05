package single;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindSingleNumberFunction {
	// O(n) time, using bitwise fastest way to do it, without extra memory
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
	
	// My way of solving it, using hashmap to count, then check the hashmap to see which value is 1 and return that key
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
//        
//        for(Map.Entry<Integer, Integer> current : set){
//            if(current.getValue() == 1){
//                return current.getKey();
//            }
//        }
        
        return 0;
    }
}

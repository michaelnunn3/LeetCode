// LeetCode Problem 560: Subarray Sum Equals K

// If running on LeetCode you must change class name to "Solution"

import java.util.HashMap;

class sumK {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> total = new HashMap();
        total.put(0,1);
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(total.containsKey(sum-k)) {
                result += total.get(sum-k);
            }
            total.put(sum, total.getOrDefault(sum, 0) + 1);
        }
        
        return result;
        
        
    }
}
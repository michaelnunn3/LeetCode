// LeetCode Problem 238: Product of Array Except Self

// If running on LeetCode you must change class name to "Solution"

class prodOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        
        left[0] = 1;
        right[nums.length-1] = 1;
        
        for(int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1]; 
        }
        
        for(int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        
        for(int i = 0; i < nums.length; i++){
            result[i] = right[i] * left[i];
        }
        
        return result;
    }
}
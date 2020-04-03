// LeetCode Problem 202: Happy Number
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class maxArray {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(currMax+nums[i],nums[i]);
            max=Math.max(max,currMax);
        }
    return max;
    }
}

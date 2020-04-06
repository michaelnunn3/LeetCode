// LeetCode Problem 136: Single Number
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class singleNum {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
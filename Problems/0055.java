// LeetCode Problem 55: Jump Game
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class jumpGame {
    public boolean canJump(int[] nums) {
        int dist = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > dist) {
                return false;
            } 
            dist = Math.max(dist, i + nums[i]);
        }
        return true;
    }
}
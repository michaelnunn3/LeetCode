// LeetCode Problem 283: Move Zeroes
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class mvZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
    }
}
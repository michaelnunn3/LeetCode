// LeetCode Problem 136: Single Number
// Michael Nunn

class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> test = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(!test.contains(nums[i])) {
                test.add(nums[i]);
            } else {
                test.remove(test.size() - 1);
            }
        }
        return test.get(0);
    }
}
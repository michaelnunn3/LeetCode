import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<Integer>();
        int sum = 0;
        
        while (n > 0) {
            nums.add(n % 10);
            n = n / 10;
        }
        
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + (nums.get(i)*nums.get(i));
            if (sum == 1) {
                return true; 
            } else {
                nums.clear();
                isHappy(sum);
            }
        }
        return false;
    }
}
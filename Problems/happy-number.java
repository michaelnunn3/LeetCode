// LeetCode Problem 202: Happy Number
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

import java.util.*;

class happyNum {
    public boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<Integer>();
        
        while (nums.add(n)) {
            int sum = 0;
            int temp;
        
            while (n > 0) {
                temp = n % 10;
                sum += temp*temp;
                n = n / 10;
            }

            if (sum == 1) {
                return true; 
            } else {
                n = sum;
            }
        }
        
        return false;
    }
}
// LeetCode Problem 202: Happy Number
// Michael Nunn

import java.util.*;

class happyNum {
    public boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<Integer>();
        
        int sum, temp;
        
        while (nums.add(n)) {
            sum = 0;
        
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
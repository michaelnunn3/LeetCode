// LeetCode Problem 278: First Bad Version
// Michael Nunn

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class BadVersion {

    public boolean isBadVersion(int n) {
        // Method is a placeholder to avoid errors
        // If running on leetcode remove and change
        // class name to Solution
        return true;
    }

    public int firstBadVersion(int n) {
        // Implement binary search
        int left = 1;
        int right = n;
        int ans = -1;
        
        while (left<=right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
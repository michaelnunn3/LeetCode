// LeetCode Problem 678: Valid Parenthesis String
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class validParStr {
    public boolean checkValidString(String s) {
        if(s.length() == 0) {
            return true;
        }
        
        if(s.length() == 1 && s.charAt(0) != '*') {
            return false;
        }
        
        int balance = 0;
        
        // Check left to right
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                balance--;
            }
            else {
                balance++;
            }
            
            if(balance < 0) {
                return false;
            }
        }
        
        if(balance == 0) {
            return true;
        }
        
        // If not balanced
        // Check right to left
        balance = 0;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '(') {
                balance--;
            }
            else {
                balance++;
            }
            
            if(balance < 0) {
                return false;
            }
        }
        
        return true;
        
    }
}
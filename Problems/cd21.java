// LeetCode Problem: Leftmost Column with at Least a One
// Michael Nunn

import java.util.List;

interface BinaryMatrix {
    int get(int x, int y); 
    List<Integer> dimensions();
}

// Above lines 4 through 9 are to avoid errors on my local file
// These lines should be removed when running on LeetCode
// If running on LeetCode you must change class name to "Solution"

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class lmcWithOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
        List<Integer> size = binaryMatrix.dimensions();
        int rows = size.get(0);
        int cols = size.get(1);
        
        int soln = -1;
        
        int curr_row = 0;
        int curr_col = cols-1;
        
        while(curr_row<rows && curr_col >= 0) {
            if(binaryMatrix.get(curr_row,curr_col) == 1) {
                soln = curr_col; 
                curr_col--;
            }
            else {
                curr_row++;
            }
        }
        
        return soln;
        
    }
}
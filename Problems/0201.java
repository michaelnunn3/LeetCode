// LeetCode Problem 201: Bitwise AND of Numbers Range
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class rangeBit {
    public int rangeBitwiseAnd(int m, int n) { 
        
        if(m == 0) {
            return 0;
        }
        
        String soln = Integer.toBinaryString(m);   
        int max_len = soln.length();
        String binary = null;
        StringBuilder sb = new StringBuilder(soln);    

        for(int i=m+1; i<=n; i++) {
            binary = Integer.toBinaryString(i);
            binary = binary.substring(binary.length()-max_len);
            for(int j=0; j<=max_len-1; j++){ 
                if(binary.charAt(j) == '1' && soln.charAt(j) == '1') {
                    char ch = '1';
                    sb.setCharAt(j, ch);
		            soln = sb.toString();
                }
                else {
                    char ch = '0';
                    sb.setCharAt(j, ch);
		            soln = sb.toString();
                }
            }
        }
        
        return Integer.parseInt(soln, 2);
    }
}
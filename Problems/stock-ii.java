// LeetCode Problem 122: Best Time to Buy and Sell Stock II
// Michael Nunn

// If running on LeetCode you must change class name to "Solution"

class stock {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) {
                total += prices[i+1]-prices[i];
            }
        }
        return total;
    }
}
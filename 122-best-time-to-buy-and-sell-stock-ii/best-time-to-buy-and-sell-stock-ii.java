class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int left=0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                totalProfit += (prices[right] - prices[left]);
            }
            left=right;
        }

        return totalProfit;
    }
}
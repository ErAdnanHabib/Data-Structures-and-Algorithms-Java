class Solution {
    public int maxProfit(int[] prices) { 
        int profit= 0;
        int left = 0;
        for(int right=1 ; right < prices.length ; right++){
            if(prices[right] > prices[left]){
                profit = Math.max(profit , prices[right] - prices[left]);
            }else{
                left=right;
            }
        }return profit;

        
    }
}
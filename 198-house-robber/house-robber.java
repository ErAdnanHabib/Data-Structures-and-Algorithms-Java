class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int dp[]=new int[nums.length+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int rob=nums[i]+dp[i-2];
            int notrob=dp[i-1];
            dp[i]=Math.max(rob,notrob);
        }
        return dp[nums.length-1];
    }
}
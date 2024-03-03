class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        if(nums.length==1)return 1;
        dp[0]=1;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            int len=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    len=Math.max(len,dp[j]);
                }
            }
            dp[i]=1+len;
            ans=Math.max(ans,dp[i]);
        } return ans;
    }
}
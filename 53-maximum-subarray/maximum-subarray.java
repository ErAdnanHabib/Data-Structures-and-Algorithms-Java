class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int maxx=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr + nums[i]);
            maxx=Math.max(maxx,curr);
        }
        return maxx;
    }
}
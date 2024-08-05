class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable=0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(i > maxReachable)return false;
            maxReachable = Math.max(maxReachable , i+nums[i]);
            if(maxReachable >= nums.length-1)return true;
        }return maxReachable >= nums.length-1;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left  = 0 , right = 0 , countZero=0 , maxLen=0;

        while(right < nums.length){
            if(nums[right]==0){
                countZero++;
            }

            while(countZero > k){
                if(nums[left]==0){
                    countZero--;
                }
                left++;
            }
            maxLen = Math.max(maxLen , right-left+1);
            right++;
        }
        return maxLen;
    }
}
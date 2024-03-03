class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.min(nums[0],nums[1]);
        if(nums[0]<nums[nums.length-1]) return nums[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[left]<nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return 0;

        
    }
}
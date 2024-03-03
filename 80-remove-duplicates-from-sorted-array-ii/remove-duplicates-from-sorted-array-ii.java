class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        int next=1;
        for(int i=2;i<nums.length;i++){
            if(nums[prev] !=nums[next] || nums[next] !=nums[i]){
                prev++;
                next++;
            }
            nums[next]=nums[i];
        }return next+1;
        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {

        int i=0;
        int j=1;

        for(int k=2 ; k < nums.length ; k++){
            if(nums[i] != nums[j] || nums[j] != nums[k]){
                i++;
                j++;
            }
            nums[j] = nums[k];
        }
        return j+1;
        
    }
}
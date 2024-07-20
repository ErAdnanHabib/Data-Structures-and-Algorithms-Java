class Solution {
    public void moveZeroes(int[] nums) {

        int nonZeroInd = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                nums[nonZeroInd++] = nums[i];
            }
        }
        while(nonZeroInd < nums.length){
            nums[nonZeroInd++] = 0;
        }
    }
}
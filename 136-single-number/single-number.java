class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        int result=0;
        for(int num:nums){
            result ^=num;
        }
        return result;
        
    }
}
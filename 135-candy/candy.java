class Solution {
    public int candy(int[] ratings) {
        int nums[] = new int[ratings.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        for(int i = 1; i < nums.length; i++) {
            if(ratings[i] > ratings[i - 1]){
                nums[i]= nums[i-1]+1;
            }
        }
        for(int i = nums.length-2 ; i>=0; i--) {
            if(ratings[i] > ratings[i+1]){
                nums[i]= Math.max(nums[i],nums[i+1]+1);
            }

        }
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
        }
        return tmp;
    }
}
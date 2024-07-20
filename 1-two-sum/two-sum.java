class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            int diff  = target - nums[i];
            if(!map.containsKey(diff)){
                map.put(nums[i] , i);
            }else{
                ans[0] = i;
                ans[1] = map.get(diff);
            }
        }return ans;
    }
}
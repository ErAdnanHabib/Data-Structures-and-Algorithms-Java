class Solution {
    public int jump(int[] nums) {
        int reachable=0;
        int jumps=0;
        int cj=0;
        for(int i=0;i<nums.length-1;i++){
            reachable=Math.max(reachable,i+nums[i]);
            if(i==cj){
                jumps++;
                cj=reachable;
            }
        }return jumps;
        
    }
}
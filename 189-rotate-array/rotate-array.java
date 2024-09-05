class Solution {
    public void rotate(int[] nums, int k) {
        k=k % nums.length;
        if(k==0)return;
        Queue<Integer> queue = new ArrayDeque<>();
        int len = nums.length-k;

        for(int i=len ; i<=nums.length-1;i++){
            queue.add(nums[i]);
        }
        for(int i=0 ; i<=len-1;i++){
            queue.add(nums[i]);
        }
        for(int i=0 ; i<=nums.length-1;i++){
            nums[i] = queue.poll();
        }
    }
}
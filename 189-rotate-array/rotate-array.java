class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> queue=new ArrayDeque<>();
        k=k % nums.length;
        if(k==0)return ;
        int finalLength= nums.length-k;
        for(int i=finalLength;i<=nums.length-1;i++){
            queue.add(nums[i]);
        }
        for(int i=0;i<=finalLength-1;i++){
            queue.add(nums[i]);
        }
        for(int i=0;i<=nums.length-1;i++){
            nums[i]=queue.poll();
        } 
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0 , nums.length , new ArrayList() , subsets , nums);
        return subsets;
    }

    void generateSubsets(int start , int n , List<Integer> current , List<List<Integer>> subsets , int[] nums){
        if(current.size()==n){
            subsets.add(new ArrayList(current));
            return;
        }
        for(int i=start ; i<n ; i++){
            swap(nums , start , i);
            current.add(nums[start]);
            generateSubsets(start+1 , n , current , subsets , nums);
            current.remove(current.size()-1);
            swap(nums , start , i);
        }
    }

    void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
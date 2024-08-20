class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAns = 0;
        
        for(int i = 0 ; i < k ; i++){
            maxAns += nums[i];
        }

        double temp = maxAns;
        maxAns = maxAns/k;

        for(int j=k ; j < nums.length ;j++){
            temp += nums[j] - nums[j-k];
            maxAns = Math.max(maxAns , temp / k );
        }
        return maxAns;
    }
}
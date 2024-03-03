class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int diff=target-numbers[i];
            if(!map.containsKey(diff)){
                map.put(numbers[i],i);
            }else{
                ans[0]=map.get(diff)+1;
                ans[1]=i+1;

            }
        }return ans;

        
    }
}
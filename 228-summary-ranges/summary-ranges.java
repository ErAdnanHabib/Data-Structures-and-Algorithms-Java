class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        
        int prev=0;
        int curr=1;

        while(curr<=nums.length){
            StringBuilder str=new StringBuilder();
            if(curr < nums.length && nums[prev]+1==nums[curr]){
                str.append(nums[prev]);
                while(curr < nums.length && nums[curr-1]+1 == nums[curr]){
                    curr++;
                }
                str.append("->").append(nums[curr-1]);
                list.add(str.toString());
                prev=curr;
                curr++;
            }else{
                str.append(nums[prev]);
                list.add(str.toString());
                prev=curr;
                curr++;
            }

        }
        return list;
        
    }
}
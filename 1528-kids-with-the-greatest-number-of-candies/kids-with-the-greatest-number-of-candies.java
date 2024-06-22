class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list=new ArrayList<>();
        for(int candy:candies){
            int max=1;
            for(int otherCandy:candies){
                if(candy+extraCandies < otherCandy){
                    max=0;
                    break;
                }
            }
            if(max==1){
                list.add(true);
            }else{
                list.add(false);
            }
        }return list;    
    }
}
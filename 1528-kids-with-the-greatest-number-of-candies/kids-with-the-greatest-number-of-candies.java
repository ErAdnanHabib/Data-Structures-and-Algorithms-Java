class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list=new ArrayList<>();

        int maxCandy=Integer.MIN_VALUE;
        for(int count:candies){
            maxCandy=Math.max(maxCandy,count);
        }
        for(int count:candies){
            list.add(count + extraCandies >= maxCandy);
        }
        return list;     
    }
}

// other approach
// for(int candy:candies){
        //     int max=1;
        //     for(int otherCandy:candies){
        //         if(candy+extraCandies < otherCandy){
        //             max=0;
        //             break;
        //         }
        //     }
        //     if(max==1){
        //         list.add(true);
        //     }else{
        //         list.add(false);
        //     }
        // }return list;
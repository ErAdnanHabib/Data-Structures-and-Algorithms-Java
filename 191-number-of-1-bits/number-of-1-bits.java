class Solution {
    public int hammingWeight(int n) {
        int counts=0;
        for(int i=1 ; i<=32 ;i++){
            int musk=1<<i;
            if((n & musk)!=0){
                counts++;
            }
        }
        return counts;   
    }
}
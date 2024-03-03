public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int musk=1<<i;
            if((n & musk)!=0){
                count++;
            }
        }return count;
        
    }
}
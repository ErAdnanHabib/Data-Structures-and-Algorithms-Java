class Solution {
    public int countOdds(int low, int high) {

        int tc = high-low+1;
        int odd = (tc+1)/2;

        if(low % 2 == 0){
            odd = tc-odd;
        }
        return odd;
    }
} 
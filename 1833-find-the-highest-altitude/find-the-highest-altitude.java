class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int ans = 0;
        for(int i = 0 ; i<gain.length ; i++){
            ans += gain[i];
            max = Math.max(max , ans);
        }
        return max;
    }
}
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int total = 0 , n = cardPoints.length;

        for(int i=0;i<k;i++){
            total += cardPoints[i];
        }
        int maxValue = total;

        for(int i = 0 ; i < k  ; i++ ){
            total+= cardPoints[n-1-i] - cardPoints[k-1-i];
            maxValue= Math.max(total , maxValue);
        }
        return maxValue;
        
    }
}
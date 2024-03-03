class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        List<int[]> merged=new ArrayList<>();
        int count=1,prev=0;
        for(int curr=1;curr<intervals.length;curr++){
            int endtimeprev=intervals[prev][1],starttimecurr=intervals[curr][0];
            if(endtimeprev<=starttimecurr){
                count++;
                prev=curr;
            }
        }return(intervals.length-count);
    }
}
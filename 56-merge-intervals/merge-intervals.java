class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int prev = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[prev][1]>=intervals[i][0]){
                intervals[prev][1]=Math.max(intervals[prev][1],intervals[i][1]);
            }
            else{
                merged.add(intervals[prev]);
                prev=i;
            }
        }
        merged.add(intervals[prev]);
        return merged.toArray(new int[merged.size()][2]);
    }
}
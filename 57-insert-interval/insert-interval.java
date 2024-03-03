class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        List<int[]> result=new ArrayList<>();
        int i=0;
        //saare left side ke lipta diye ok
        while(i<n && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        // within di hui range liptaani h
        while(i<n && intervals[i][0]<=newInterval[1]){
            int start=Math.min(intervals[i][0],newInterval[0]);
            int end  =Math.max(intervals[i][1],newInterval[1]);
            newInterval[0]=start;
            newInterval[1]=end;
            i++;
        }result.add(newInterval);
        //baaki right wale saare
        while(i<n){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][2]);

        
    }
}
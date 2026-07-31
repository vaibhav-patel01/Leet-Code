class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals ,
         (a,b) ->  Integer.compare(a[1], b[1])
        );
        int n = intervals.length;
        int prevEnd = intervals[0][1];
        int count = 0;
        for (int i = 1; i < n ;i++){
            int currStart = intervals[i][0];
            if( currStart < prevEnd   ){
                count++; 
            }else{
                prevEnd = intervals[i][1];
            }
            
        }
        return count ;
    }
}
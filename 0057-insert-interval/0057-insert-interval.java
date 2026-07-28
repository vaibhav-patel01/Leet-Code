class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // [[1,2],[3,5],[6,7],[8,10],[12,16]]     [4,8]
        // [[1,2],[3,10],[12,16]]
        List<int[]> result = new ArrayList<>();
        
        int n = intervals.length;
        int i = 0;
        while(i < n &&  intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        while(i < n &&  intervals[i][0] <= newInterval[1] ){
            newInterval[0] = Math.min( newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max( newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while(i < n ){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
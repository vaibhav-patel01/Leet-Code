class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort( intervals, 
            (a,b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0])
        );

        int count = 0 ;
        int max = -1;
        for (int[] x : intervals){
            if (x[1] > max){
                count++ ; 
                max = x[1];
            }
        }
        return count ;
    }
}
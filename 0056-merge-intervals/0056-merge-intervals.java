class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1 ; i < intervals.length ; i++){
            int[] prev = list.get( list.size() - 1);
            int[] curr = intervals[i];
            if( prev[1] >= curr[0]  ){
                list.remove(list.size() - 1);
                int end = Math.max(prev[1], curr[1]);
                list.add(new int[] {prev[0], end});
            }else{
                list.add(curr);
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}
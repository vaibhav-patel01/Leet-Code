class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((n1, n2) -> n2[0] - n1[0]);
        int n = points.length;
        int[][] ans = new int[k][2]; 
        for (int i = 0 ; i <  k ; i++){
            int x = points[i][0];
            int y = points[i][1];
            int distance = x*x + y*y ; 
            maxHeap.add(
                new int[]{distance, i}
            );
        }
        for(int i = k ; i < n ; i++ ){
            int x = points[i][0];
            int y = points[i][1];
            int distance = x*x + y*y ;

            if(maxHeap.peek()[0] > distance){
                maxHeap.remove();
                maxHeap.add(
                    new int[]{distance, i}
                );
            }
        }
        for (int i = 0 ; i < k ; i++){
            ans[i] = points[maxHeap.remove()[1]];
        }
        return ans ; 
    }
}
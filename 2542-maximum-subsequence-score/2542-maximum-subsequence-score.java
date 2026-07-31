class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        int[][] pair = new int[nums1.length][2];
        for (int i = 0 ; i < nums1.length ; i++){
            pair[i][0] = nums1[i];
            pair[i][1] = nums2[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[1] , a[1]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long max = 0 ;
        long sum = 0; 
        for (int i = 0 ; i< nums1.length ;i ++ ){
            int num1 = pair[i][0];
            int num2 = pair[i][1];
            minHeap.add(num1);
            sum += num1 ; 
            if(minHeap.size() > k){
                sum -= minHeap.poll();
            }
            if(minHeap.size() == k){
                max = Math.max(max, num2 * sum );
            }
        }
        return max ;

    }
}
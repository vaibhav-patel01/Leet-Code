class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((n1, n2) -> Integer.compare(n1[1] , n2[1]));
        for (int i = 0 ; i < k ;i++){
            minHeap.add(
                new int[]{i, nums[i]}
            );
        }
        for( int i = k ; i < nums.length; i++ ){
            if(nums[i] > minHeap.peek()[1]){
                minHeap.remove();
                minHeap.add(
                    new int[]{i, nums[i]}
                );
            }
        }
    PriorityQueue<int[]> indexHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
    indexHeap.addAll(minHeap);
    
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        ans[i] = indexHeap.poll()[1]; 
    }
    
    return ans;
    }
}
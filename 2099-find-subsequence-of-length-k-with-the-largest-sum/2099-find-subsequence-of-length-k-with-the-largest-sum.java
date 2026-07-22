class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((n1, n2) -> Integer.compare(n1[1] , n2[1]));
        for (int i = 0; i < nums.length; i++) {
        minHeap.offer(new int[]{i, nums[i]});
        if (minHeap.size() > k) {
            minHeap.poll();
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
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int val  : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2)
        );
        for (int key : map.keySet()) {
            minHeap.add(key);
            // If heap size exceeds k, evict the element with the lowest frequency
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
 
    }
}
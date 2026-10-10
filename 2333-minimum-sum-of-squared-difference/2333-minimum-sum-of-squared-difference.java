// class Solution {
//     public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
//         int n = nums1.length;
//         long k = (long) k1 + k2;

//         PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
//         for (int i = 0; i < n; i++) {
//             heap.offer(Math.abs(nums1[i] - nums2[i]));
//         }
//         while (k > 0 && heap.peek() != 0) {
//             int top = heap.poll();
//             heap.offer(top - 1);
//             k--;
//         }
//         long ans = 0;
//         for (int d : heap) {
//             ans += (long) d * d;
//         }
//         return ans;
//     }                                
// }                   

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int MAX = 100000;
        long[] cnt = new long[MAX + 2];
        long total = 0;

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            cnt[d]++;
            total += d;
        }
        if (k >= total) return 0;
        
        for (int d = MAX; d > 0 && k > 0; d--) {
            if (cnt[d] == 0) continue;
            if (cnt[d] <= k) {
                k -= cnt[d];
                cnt[d - 1] += cnt[d];
                cnt[d] = 0;
            } else {
                cnt[d - 1] += k;
                cnt[d] -= k;
                k = 0;
            }
        }
        long ans = 0;
        for (int d = 1; d <= MAX; d++) {
            ans += cnt[d] * (long) d * d;
        }
        return ans;
    }
}



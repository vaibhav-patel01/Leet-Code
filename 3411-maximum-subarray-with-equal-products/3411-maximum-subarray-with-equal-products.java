class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int best = 0;
        for (int i = 0; i < n; i++) {
            long p = 1;
            int g = 0, l = 1;
            for (int j = i; j < n; j++) {
                int x = nums[j];
                p *= x;
                if (p > 25200) break;  
                g = gcd(g, x);
                l = l / gcd(l, x) * x;
                if (p == (long) l * g) {
                    best = Math.max(best, j - i + 1);
                }
            }
        }
        return best;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
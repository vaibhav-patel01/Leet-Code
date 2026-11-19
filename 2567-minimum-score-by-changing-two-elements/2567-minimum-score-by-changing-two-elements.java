class Solution {
    public int minimizeSum(int[] nums) {
        if (nums.length <= 3) return 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, min2 = min, min3 = min, max2 = max, max3 = max;
        for (int val : nums) {
            if (val < min) {
                min3 = min2; min2 = min; min = val;
            } else if (val < min2) {
                min3 = min2; min2 = val;
            } else if (val < min3) {
                min3 = val;
            }

            if (val > max) {
                max3 = max2; max2 = max; max = val;
            } else if (val > max2) {
                max3 = max2; max2 = val;
            } else if (val > max3) {
                max3 = val;
            }
        }
        return Math.min(max - min3,        
            Math.min(max2 - min2,           
                        max3 - min));
    }
}
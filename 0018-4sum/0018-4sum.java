class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> asliResult = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue; // skip dup
            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue; // skip dup
                int lo = b + 1, hi = n - 1;
                while (lo < hi) {
                    long sum = (long) nums[a] + nums[b] + nums[lo] + nums[hi];
                    if (sum == target) {
                        asliResult.add(List.of(nums[a], nums[b], nums[lo], nums[hi]));
                        lo++; hi--;
                        while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi + 1]) hi--;
                    } else if (sum < target) lo++;
                    else hi--;
                }
            }
        }
        return asliResult;
    }
}
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int robbFirst = solution (nums, dp, 0, nums.length-2);
        int robbLast = solution (nums, dp2, 1, nums.length-1);
        return Math.max(robbFirst, robbLast);

    }
    private int solution(int[] nums, int[] dp, int i, int n){
        if(i > n){
            return 0; 
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int steal = nums[i] + solution(nums, dp, i+2,n);
        int skip = solution(nums, dp, i+1, n);
        return dp[i] = Math.max(steal, skip);
    }
}
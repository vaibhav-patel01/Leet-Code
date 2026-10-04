class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length][2];
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums, dp, 0, 1);
    }
    private long solve(int[] nums, long[][] dp, int i, int flag ){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i][flag] != -1){
            return dp[i][flag];
        }
        int val = nums[i];
        if(flag == 0){
            val = -val;
        }
        long take = solve(nums, dp , i+1, 1-flag) + val;
        
        long skip = solve(nums, dp, i+1, flag);

        return  dp[i][flag] = Math.max(take, skip);

    }
}
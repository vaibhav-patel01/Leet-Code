class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(nums, dp, 0, -1);
    }
    private int solve(int[] nums, int[][] dp, int i, int last){
        if(i >= nums.length){
            return 0;
        }
        int take = 0;
        if(dp[i][last+1] != -1){
            return dp[i][last + 1];
        }
        if(last == -1 || nums[i] > nums[last]){
            take = 1+ solve(nums, dp, i+1, i);
        }
        int skip = solve(nums, dp, i+1, last);
        return dp[i][last+1] = Math.max(skip, take); 
    }
}
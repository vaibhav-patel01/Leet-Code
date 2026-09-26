class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -2);
        return ways(n, dp);
    }
    private int ways(int n, int[] dp){
        if(n == 0) return 1;
        if(n == -1) return 0;
        if(dp[n] != -2) return dp[n];
        return dp[n] = ways(n-1, dp) + ways(n-2, dp);
    }
}
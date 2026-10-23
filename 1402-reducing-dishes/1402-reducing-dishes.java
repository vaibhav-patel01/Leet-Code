class Solution {
    public int maxSatisfaction(int[] arr) {
        Arrays.sort(arr);
        int[][] dp = new int[arr.length+1][arr.length+1];
        for(int[] row : dp){
            Arrays.fill(row, 10001);
        }
        return solve(arr, dp, 0, 1); 
    }
    private int solve(int[] arr, int[][] dp, int i, int time){
        if(i >= arr.length){
            return 0; 
        }
        if(dp[i][time] != 10001){
            return dp[i][time];
        }
        int take = (arr[i]* time) + solve(arr,dp, i+1, time+1);
        int skip = solve(arr,dp, i+1, time);
        return dp[i][time] = Math.max(take, skip);
    }
}
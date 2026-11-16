class Solution {
    int[][] dp; 
    int n; 
    public int maxProfit(int[] prices) {
        n = prices.length; 
        dp = new int[n][2];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(prices , 0, 1 );
    }
    private int solve(int[] arr, int i, int sign ){
        if(i >= n){
            return 0; 
        }
        if(dp[i][sign] != -1){
            return dp[i][sign];
        }
        int take =0; 
        if(sign == 1){
            take = -arr[i] + solve(arr, i+1, 0);
        }
        else{
            take = arr[i] + solve(arr, i+1, 1);
        }
        
        int skip = solve(arr, i+1, sign);
        return dp[i][sign] = Math.max(skip, take);
    }
}
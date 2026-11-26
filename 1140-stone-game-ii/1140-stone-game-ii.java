class Solution {
    int n;
    int[][][] dp; 
    public int stoneGameII(int[] piles) {
        n = piles.length;
        dp = new int[n][n+1][2];
        for(int[][] arr : dp){
            for(int[] arr2 : arr){
                Arrays.fill(arr2, -1);
            }
        }
        return solve(piles, 0, 1, 1);
    }
    private int solve(int[] piles, int j, int m, int alice) {
        if (j >= n) return 0;
        if(dp[j][m][alice] != -1) return dp[j][m][alice];
        int best = (alice == 1) ? 0 : Integer.MAX_VALUE;
        int sum = 0;
        for (int x = 1; x <= 2 * m && j + x <= n; x++) {
            sum += piles[j + x - 1];              
            int rest = solve(piles, j + x, Math.max(m, x), 1 - alice);

            if (alice == 1){
                best = Math.max(best, sum + rest);
            } 
            else{
                best = Math.min(best, rest);
            }
        }
        return dp[j][m][alice] = best;
    }
}
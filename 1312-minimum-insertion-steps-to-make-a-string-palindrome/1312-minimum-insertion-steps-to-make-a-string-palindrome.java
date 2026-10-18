class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(s, 0,n-1 , dp);
    }
    private int solve(String s, int i, int j, int[][]dp){
        if(i >= j){
            return 0; 
        }
        int equal = 0;
        int unequal = 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (s.charAt(i) == s.charAt(j)){
           equal = 0 + solve(s, i+1, j-1, dp);
        }
        else{
            unequal = Math.min(1 + solve(s, i + 1, j, dp), 1 + solve(s, i, j-1, dp));
        }
        return dp[i][j] = Math.max(equal, unequal);
    }
}
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(text1, text2, dp, 0, 0);
    }
    private int solve(String a, String b, int[][] dp, int i, int j){
        if(i >= a.length() || j >= b.length()){
            return 0; 
        }
        int take = 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(a.charAt(i) == b.charAt(j)){
            take = 1+ solve(a, b, dp, i+1, j+1);
        }
        int skipI = solve(a, b, dp, i+1, j);
        int skipJ = solve(a, b, dp,  i, j + 1);
        int skip = Math.max(skipI, skipJ);
        return dp[i][j] = Math.max(skip, take);
    }
}
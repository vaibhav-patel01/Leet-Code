class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[][] dp = new int[n][n];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if(checkPalindrome(i, j, s, dp)){
                    count++;
                }
            }
        }
        return count ;

    }
    private boolean checkPalindrome(int i, int j, String s, int[][] dp){
        if (i >= j) {
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        if (s.charAt(i) == s.charAt(j) && checkPalindrome(i + 1, j - 1, s, dp)) {
            dp[i][j] = 1;
        } else {
            dp[i][j] = 0;
        }
        return dp[i][j] == 1;
    }
}
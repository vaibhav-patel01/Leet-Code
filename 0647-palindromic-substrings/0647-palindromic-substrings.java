class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0; 
        boolean[][] dp = new boolean[n][n];
        for (int l = 1 ;l <= n ; l++){
            for (int i = 0; i+l-1 < n ;i++){
                int j = i+l-1;
                if(j == i){
                    dp[i][j] = true;
                }
                else if (i+1 == j){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j] == true){
                    count++;
                }
            }
        }
        return count;

    }
}
// class Solution {
//     public int countSubstrings(String s) {
//         int n = s.length();
//         int count = 0;
//         int[][] dp = new int[n][n];
//         for (int[] row : dp){
//             Arrays.fill(row, -1);
//         }
//         for (int i = 0; i < n; i++){
//             for (int j = i; j < n; j++){
//                 if(checkPalindrome(i, j, s, dp)){
//                     count++;
//                 }
//             }
//         }
//         return count ;
//     }
//     private boolean checkPalindrome(int i, int j, String s, int[][] dp){
//         if (i >= j) {
//             return true;
//         }
//         if (dp[i][j] != -1) {
//             return dp[i][j] == 1;
//         }
//         if (s.charAt(i) == s.charAt(j) && checkPalindrome(i + 1, j - 1, s, dp)) {
//             dp[i][j] = 1;
//         } else {
//             dp[i][j] = 0;
//         }
//         return dp[i][j] == 1;
//     }
// }
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        int[] index = {-1,-1};
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
                if(dp[i][j] == true && (j-i+1 > max)){
                    index[0] = i;
                    index[1] = j;
                    max = j-i+1;
                }
            }
        }
        return s.substring(index[0], index[1]+1);
    }
}

// class Solution {
//     public String longestPalindrome(String s) {
//         if(s.length() == 1) return s;
//         int start = 0;
//         int max = 0; 
//         for (int i = 0 ; i < s.length(); i++){
//             int oddCenter = palindromeLen( s,  i , i);
//             int evenCenter = palindromeLen(s, i , i+1);
//             int currmax = Math.max(oddCenter, evenCenter);
//             if(currmax > max){
//                 max = currmax;
//                 start = i - (currmax - 1 )/2;
//             }
//         }
//         return s.substring(start, start + max);
//     }
//     private int palindromeLen(String s, int i , int j){
//         while (i >= 0 && j< s.length() && s.charAt(i) == s.charAt(j)) {
//             i--;
//             j++;
//         }
        
//         return j - i - 1;
//     }
// }
class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,
            (a,b) -> Integer.compare(a.length(), b.length())   
        );
        int[][] dp = new int[words.length][words.length +1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(words,dp, 0, -1);
    }
    private int solve(String[] words, int[][] dp, int i, int last){
        if (i >= words.length){
            return 0;
        }
        if(dp[i][last+1] != -1){
            return dp[i][last+1];
        }
        int take  = 0;
        if (last == -1 || isPredecessor(words[last], words[i])){
            take = 1+ solve(words, dp, i+1, i);
        }
        int skip = solve (words, dp, i+1, last);
        return dp[i][last+1] = Math.max(skip, take);
    }
    private boolean isPredecessor(String wordA, String wordB){
        int n1 = wordA.length();
        int n2 = wordB.length();
        if(n1 +1 != n2){
            return false;
        }
        int i = 0, j = 0;
        int miss = 0;
        while(i < n2){
            if(miss > 1){
                return false;
            }
            if(j < n1 && wordA.charAt(j) == wordB.charAt(i)){
                i++;
                j++;
            }
            else{
                miss++;
                i++;
            }
        }
        if(miss > 1)return false;
        return true;
    }
}
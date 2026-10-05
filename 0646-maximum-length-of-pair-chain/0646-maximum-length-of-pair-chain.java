class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, 
                (a,b) ->  (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
            );
        int[][] dp = new int[pairs.length][pairs.length+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve (pairs, dp, 0, -1);
    }
    private int solve(int[][] pairs, int[][] dp, int i, int last ){
        if(i >= pairs.length){
            return 0; 
        }
        if(dp[i][last+1] != -1){
            return dp[i][last+1];
        }
        int take = 0;
        if(last == -1 || pairs[last][1] < pairs[i][0]){
            take = 1 + solve(pairs, dp, i+1, i);
        }
        int skip = solve(pairs, dp, i+1, last);

        return dp[i][last+1] = Math.max(skip, take);
    }
}

// class Solution {
//     public int findLongestChain(int[][] pairs) {
//         Arrays.sort(pairs,(a,b)->a[1]-b[1]);
//         int len = 1,last = pairs[0][1],n = pairs.length;
//         for(int i = 1;i<n;i++){
//             if(last < pairs[i][0]){
//                 len++;
//                 last = pairs[i][1];
//             }
//         }
//         return len;
//     }
// }
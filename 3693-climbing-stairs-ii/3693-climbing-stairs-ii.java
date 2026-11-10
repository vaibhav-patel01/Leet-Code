class Solution {
    int[]dp; 
    int x ;
    public int climbStairs(int n, int[] costs) {
        x = n; 
        dp = new int[n+1]; 
        Arrays.fill(dp, -1);
        return solve(costs, 0);
    }
    private int solve(int[] arr, int i){
        if(i == x){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int min = Integer.MAX_VALUE; 
        for(int k = 1; k <= 3 ;k++){
            int j = k+i; 
            if(j-1 < arr.length){
                min = Math.min(min, arr[j-1] + k*k + solve(arr, j));
            }
        }
        return dp[i] = min; 
    }
}
class Solution {
    int[][][] dp;
    int m, n ;
    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length; 
        dp = new int[m][n][2];
        for(int[][] row : dp){
            for(int[] row2 : row){
                Arrays.fill(row2, -1);
            }
        }
        return solve(grid, 0, 0, 0);
    }
    private int solve(int[][] grid, int i, int j, int prevDir){
        if(i == m-1 && j == n-1){
            return 1 ;
        }
        if(i>= m || j >= n){
            return 0; 
        }
        int right = 0;
        int down = 0;
        if(dp[i][j][prevDir] != -1){
            return dp[i][j][prevDir]; 
        }
        if(grid[i][j] == 1){
            if(prevDir == 1){
                down = solve(grid, i+1, j, 0);
            }
            else{
                right = solve(grid, i, j+1, 1);
            }
        }
        else{
            right = solve(grid, i, j+1 , 1);
            down = solve(grid, i+1, j, 0);
        }
        return dp[i][j][prevDir] = (right+down) % 1_000_000_007;
    }
}
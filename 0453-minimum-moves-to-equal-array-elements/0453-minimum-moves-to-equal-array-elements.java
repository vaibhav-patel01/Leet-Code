class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int val : nums) {
            min = Math.min(min, val);
        }
        int moves = 0;
        for (int val : nums) {
            moves += val - min;
        }
        return moves;
    }
}
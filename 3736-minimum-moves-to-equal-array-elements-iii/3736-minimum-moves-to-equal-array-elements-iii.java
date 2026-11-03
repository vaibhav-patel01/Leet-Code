class Solution {
    public int minMoves(int[] nums) {
        int max = 0, count = 0  ;
        for(int val : nums){
            max = Math.max(val, max);
        }
        for(int val : nums){
            count += Math.abs(max- val);
        }
        return count;
    }

}
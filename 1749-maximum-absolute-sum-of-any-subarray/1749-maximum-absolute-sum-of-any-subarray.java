class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum =0, max = 0, min = 0; 
        for (int x : nums){
            sum += x;
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        return max - min ;
    }
    

}
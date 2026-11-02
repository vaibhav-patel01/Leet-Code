class Solution {
    public int minMoves2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        for(int val : nums){
            count += Math.abs(val - mid);
        }
        return count ;
    }
}
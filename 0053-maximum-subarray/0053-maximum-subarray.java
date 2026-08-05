class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0], sum = nums[0], i = 1;

        while(i < n){
            sum += nums[i];
            if(sum > nums[i]){
                max = Math.max(max, sum);
            }
            else{
                max = Math.max(nums[i], max);
                sum = nums[i];
            }
            i++;
        }
        return max;
    }
}
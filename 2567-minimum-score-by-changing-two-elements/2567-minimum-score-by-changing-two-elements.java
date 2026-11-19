class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length; 
        int x = 0, y = 0, z = 0; 
        if(n == 3){
            return 0;
        }
        Arrays.sort(nums);
        x = nums[n-1]- nums[2];
        y = nums[n-3] - nums[0];
        z = nums[n-2] - nums[1];
        return Math.min(x,Math.min(y,z));
    }
}
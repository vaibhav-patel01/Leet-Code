class Solution {
    public long maxAlternatingSum(int[] nums) {
        // can be solved by counting sort
        int i = 0, n = nums.length;
        long sum = 0;
        int j = n-1;
        int x = (n + 1) / 2;
        int y = n-x;
        Arrays.sort(nums);
        while(i <= j){
            if (x > 0){
                if((nums[i] * nums[i]) >= (nums[j] * nums[j]) ){
                    sum += nums[i] * nums[i]; 
                    i++;
                }
                else{
                    sum += nums[j] * nums[j];
                    j--;
                }
                x--; 
            }
            else{
                sum -= nums[i] * nums[i];
                i++;
            }

        }
        return sum;    
    }
}
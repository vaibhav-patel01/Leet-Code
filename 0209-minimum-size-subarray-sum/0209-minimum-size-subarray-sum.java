class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int i = 0;
        int sum = 0;
        int n = nums.length;
        int ans = 0;
        while( j < n ){
            sum += nums[j]; 
            if(sum >= target){
                if(ans == 0 || ans > j-i + 1 ){
                    ans = j - i + 1 ;
                }
                sum -= nums[i];
                i++;
                
                sum -= nums[j];
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
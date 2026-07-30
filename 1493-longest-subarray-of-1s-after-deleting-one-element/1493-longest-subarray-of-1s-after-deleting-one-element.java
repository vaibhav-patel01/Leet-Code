class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0 ;
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(j < n){
            if(nums[j] == 0){
                count++;
            }
            if(count == 1){
                max = Math.max(max, j-i);
            }
            if(count > 1){
                if(nums[i] == 0){
                    count -- ;
                }
                i++;
            }
            j++ ; 
        }
        if(count == 0){
            return n-1;
        }
        return max;
    }
}
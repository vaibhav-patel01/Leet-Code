class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i = 0, j = 0;
        long count = 0; 
        long sum = 0;
        while( j < nums.length){
            sum = nums[j] + sum ; 
                while(sum * (j - i + 1) >= k){
                    sum = sum - nums[i];
                    i++; 
                }
            count = count + (j - i + 1) ; 
            j++; 
        }
        return count;
    }
}

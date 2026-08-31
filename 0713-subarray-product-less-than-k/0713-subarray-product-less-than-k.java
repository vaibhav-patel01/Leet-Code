class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums.length == 1 && nums[0] > k) {
            return 0; 
        }
        int i = 0 , j = 0;
        long prod = 1 ; 
        int result = 0; 
        while(j < nums.length){
            prod = prod  * nums[j];
            while(prod >= k ){
                prod = prod / nums[i];
                i++; 
            }
            result = result + (j - i + 1) ;
            j++;
        } 
        return result;
    }
}
class Solution {
    public int longestSubsequence(int[] nums) {
        boolean containsNonZero = false;
        int n = nums.length;
        int xor = 0; 
        for (int num : nums){
            if(num > 0) containsNonZero = true; 
            xor ^= num ; 
        }
        if(!containsNonZero) return 0; 
        return (xor == 0) ? n-1 : n ;
    }
}
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;
        int x = 1 ;
        int y = 1 ;
        int maxX = 0; 
        int maxY = 0; 
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                y++;
                x = 1; 
            }
            if(nums[i] < nums[i+1]){
                x++ ;
                y = 1 ;
            }
            if(nums[i] == nums[i+1]){
                x = 1; 
                y = 1; 
            }
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        return Math.max(maxX, maxY);
    }
}
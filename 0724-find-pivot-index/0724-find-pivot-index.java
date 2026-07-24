class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0;
        int suffix = 0;
        for(int i = 1 ; i< nums.length ; i++){
            suffix += nums[i];
        }
        for (int i = 0 ; i < nums.length ; i++){
            if(suffix == prefix){
                return i;
            }
            prefix += nums[i];
            if(i != nums.length - 1){
                suffix -= nums[i+1];
            } 
        }
        return -1;
    }
}
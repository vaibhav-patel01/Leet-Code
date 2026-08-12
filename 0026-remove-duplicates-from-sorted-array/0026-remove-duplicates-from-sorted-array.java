class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, i = 0;
        int n = nums.length;
        for (int j =0; j < nums.length ; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                count++; 
            }
        }
        return count; 
    }
}
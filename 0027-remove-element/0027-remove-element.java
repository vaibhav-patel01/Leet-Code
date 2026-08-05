class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0, count = 0;
        int n = nums.length;
        while(j < n){
            if(nums[j] == val){
                j++;
            }
            else{
                nums[i] = nums[j];
                count++;
                j++;
                i++;
            }
        }
        return count;
    }
}
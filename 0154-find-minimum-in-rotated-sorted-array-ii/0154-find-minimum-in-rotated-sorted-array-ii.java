class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i< j){
            int mid = i + (j-i)/2;
            if(nums[mid] == nums[j] && nums[mid] == nums[i]){
                i++;
                j--;
            }
            else if(nums[mid] > nums[j]){
                i = i+1;
            }
            else{
                j = mid;
            }
        }
        return nums[j];
    }
}
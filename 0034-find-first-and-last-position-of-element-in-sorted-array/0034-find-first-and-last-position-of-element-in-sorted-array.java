class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        // first index 
        int i = 0;
        int j = nums.length - 1; 
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            if(target > nums[mid]){
                i = mid + 1;
            }
            else if (target < nums[mid]){
                j = mid - 1;
            }
            else if(mid - 1 >=0){
                if(nums[mid - 1] == nums[mid]){
                    j = mid - 1;
                }
                else {
                    result[0] = mid;
                    break;
                }
            }
            else{ result[0] = mid;
            break;
            }
        }
        // second index
        int left = 0;
        int right = nums.length - 1; 
         while(left <= right){
            int mid = left + (right - left) / 2 ;
            if(target > nums[mid]){
                left = mid + 1;
            }
            else if (target < nums[mid]){
                right = mid - 1;
            }
            else if(mid + 1 <= nums.length - 1){
                if(nums[mid + 1] == nums[mid]){
                    left = mid +1;
                }
                else {
                    result[1] = mid;
                    break;
                }
            }
            else {result[1] = mid;
            break;}
        }
        return result;
    }
}
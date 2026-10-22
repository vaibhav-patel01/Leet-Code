class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0; 
        int n = nums.length;
        int min = -1; 
        int op = 0;
        for (int i = 0; i < n ;i++){
            if(nums[i] == 0){
                min = i; 
                break;
            }
        }
        if(( min < n-1 && nums[min+1] == 1) || (nums[0] == 1 && min == n-1 )){
            int left = min;
            int right = n - min + 2 ; 
            int j = min; 
            int k = 0; 
            for (int i = 0; i < n ; i++){
                if(nums[j] != k){
                    return -1; 
                }
                if(j == n-1){
                    j = 0; 
                }
                else{
                    j++; 
                }
                k++; 
            }
            op =  Math.min(left, right );
        }
        else if ((min != 0 && nums[min- 1] == 1) || (nums[n-1] == 1 && min == 0)){
            int left = min+2;
            int right = n - min; 
            int j = min; 
            int k = 0; 
            for (int i = 0; i < n ; i++){
                if(nums[j] != k){
                    return -1; 
                }
                if(j == 0){
                    j = n-1; 
                }
                else{
                    j--; 
                }
                k++; 
            }
            op = Math.min(left, right );
        }
        else {
            return -1;
        }
        return op;
    }
}
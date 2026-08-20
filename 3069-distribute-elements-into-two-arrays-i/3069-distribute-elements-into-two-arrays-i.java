class Solution {
    public int[] resultArray(int[] nums) {
        int n =  nums.length,i = 0, j = 0, k = 2; 
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        while(k < n){
            if(arr1[i] > arr2[j]){
                i++ ;
                arr1[i] = nums[k];
            }
            else{
                j++ ;
                arr2[j] = nums[k];
            }
            k++;
        }
        int idx = 0;
        for (int m = 0; m <= i; m++) {
            nums[idx++] = arr1[m];
        }
        for (int m = 0; m <= j; m++) {
            nums[idx++] = arr2[m];
        }
        return nums;
    }
}
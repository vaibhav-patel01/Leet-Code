class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
            reverse(nums,0, nums.length - 1);    
            reverse(nums,0, k - 1);                  // first half
            reverse(nums,k, nums.length - 1);        // second half
    }
    public static void reverse(int[] a, int i , int j){
        while(i <= j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0 ;
        int j = 0 ; 
        double sum = 0;
        double maxAvg = 0;
        int n = nums.length;
        while( j < n  ){
            sum += nums[j] ; 
            if( (j - i+ 1) == k ){
                if( j == k - 1 || maxAvg < (sum/k))
                maxAvg = sum / k ;
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxAvg ;
    }
}
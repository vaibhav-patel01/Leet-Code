class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0; 
        int n = nums.length; 
        int i = 1; 
        for (int val : nums){
            if(n % i == 0){
                sum += val * val; 
            }
            i++;
        }
        return sum;
    }
}
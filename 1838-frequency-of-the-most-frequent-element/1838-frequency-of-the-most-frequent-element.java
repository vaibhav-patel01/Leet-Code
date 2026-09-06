class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 1)return 1;
        int x = k ;
        int count  = 0, max = 1 ;
        int i = 0, j = 1 ;
        while(j < n){
            int diff = nums[j] - nums[j-1];
            long cost = (long) diff * (j - i);
            if(cost <= x){
                x =(int) (x- cost) ;
                count = j-i +1 ;
                j++; 
            }
            else{
                x += nums[j-1] - nums[i]; 
                i++; 
                if(i == j){
                    j++;
                    x = k; 
                }
            } 
            max = Math.max(count, max);
        }
        return max ; 
    }
}
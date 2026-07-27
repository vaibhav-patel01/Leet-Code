class Solution {
    public int maxProduct(int[] nums) {
        int x = 0;
        int y = x;
        for (int val : nums){
            if(val > x){
                y = x;
                x = val;
            }
            else if(val > y){
                y = val;
            }
        }
        return (x-1) * (y-1); 
    }
}
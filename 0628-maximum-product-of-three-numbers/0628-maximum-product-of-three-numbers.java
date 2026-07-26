class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int a = Integer.MAX_VALUE;
        int b = a;
        int x = Integer.MIN_VALUE;
        int y = x;
        int z = y;

        for(int val : nums){
            if(val < a){
                b = a;
                a = val;
            }else if(val < b){
                b = val;
            }
            if(val > x){
                z = y;
                y = x;
                x = val;
            }else if(val > y){
                z = y;
                y = val;
            }else if(val > z){
                z = val;
            }

        }
        int prod1 = a * b * x;
        int prod2 = y * z* x;
        return Math.max(prod1,prod2);
    }
}
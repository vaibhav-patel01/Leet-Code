class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0 ;
        int a = 10001, b = 10001, c = 10001, d = 10001;
        for (int val : nums){
            sum +=val; 
            if(val%3 == 1){
                if(val < a){
                    b = a;
                    a = val;
                }
                else if (val < b){
                    b = val;
                }
            }
            else if (val %3 == 2){
                if(val < c){
                    d = c;
                    c = val;
                }
                else if (val < d){
                    d = val;
                }
            }
        }
        if(sum % 3 == 0) return sum; 
        else if (sum % 3 == 1) return sum - Math.min(a, c+d);
        return sum - Math.min(c , a+b);

    }
}
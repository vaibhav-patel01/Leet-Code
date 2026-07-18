class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i : nums){
            if(max < i) max = i;
            if(min > i) min = i;
        }
        return gcd(min, max);

    }
    private int gcd(int min, int max ){
        if(max == 0) return min;
        return gcd(max,min % max);
    }
}
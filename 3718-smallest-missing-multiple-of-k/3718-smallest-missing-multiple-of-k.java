class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int n = k;
        for (int i = 0 ; i< nums.length ; i++){
            if (nums[i] % k == 0 ){
                set.add(nums[i]);
            }
        }
        while(n <= 100){
            if(!set.contains(n)){
                return n; 
            }
            n += k ;
        }
        return n;
    }
}
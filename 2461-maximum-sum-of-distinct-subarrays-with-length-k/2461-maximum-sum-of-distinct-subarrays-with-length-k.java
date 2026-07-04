class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        long s = 0;
        long ms = 0;
        for(int r = 0;r<nums.length;r++){
            while(set.contains(nums[r])){
                s-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            s+=nums[r];
            if(r-l+1>k){
                s-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            if(r-l+1==k){
                ms = Math.max(ms,s);
            }
        }
        return ms;
    }
}
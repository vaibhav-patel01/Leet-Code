class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            Integer low = set.floor(nums[i]); 
            if(low != null && nums[i]- low <= valueDiff){
                return true;
            }
            Integer high = set.ceiling(nums[i]);           // value just higher than nums[i];
            if(high != null && high- nums[i] <= valueDiff){
                return true;
            }
            set.add(nums[i]);
            if(i-indexDiff>=0 ){
                set.remove(nums[i-indexDiff]);
            }

        }
        return false;
    }
}
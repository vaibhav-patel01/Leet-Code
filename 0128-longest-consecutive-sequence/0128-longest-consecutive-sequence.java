class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1) return 1;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : nums){
            set.add(num);
        }
        for (int val : set){
            int x = val; 
            int temp = 1;
            if(!set.contains(val-1)){
                while(set.contains(x+1)){
                    temp++;
                    x = x+1;
                }
            }
            
            max = Math.max(temp, max);
        }
        return max;
    }
}
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0, count = 0; 
        while(j < nums.length ){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if(map.get(nums[j]) <= k){
                count++; 
            }else{
                while(nums[i] != nums[j]){
                    int temp = map.get(nums[i])-1;
                    if(temp == 0){
                        map.remove(nums[i]);
                    }else map.put(nums[i], temp);
                    i++;
                    count-- ;
                }
                int temp = map.get(nums[i])-1;
                if(temp == 0){
                    map.remove(nums[i]);
                }else map.put(nums[i], temp);
                i++; 
            }
            j++; 
            max = Math.max(max, count);
        }
        return max; 
    }
}
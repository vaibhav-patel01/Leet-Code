class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length, count = 0;
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        for(int num : map.keySet()){
            int remain = num + k; 
            if(k>0){
                if(map.containsKey(remain)){
                count++; 
                }
            }else{
                if(map.get(num) >=2){
                    count++; 
                }
            }
        }
        return count;
    }
}
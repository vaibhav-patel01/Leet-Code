class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int x = -1; 
        int n = 0; 
        for(int val : nums){
            if(val < target){
                x++; 
            }
            else if(val == target){
                n++; 
            }
        }
        for (int i = 0; i < n; i++){
            x++; 
            list.add(x);
        }
        return list; 

    }
}
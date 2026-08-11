class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0 ;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
            int temp = nums[i];
            if(i+ 1 == nums.length || nums[i+1] != temp+1){
                break;
            }
        }
        for (int num : set){
            if(set.contains(sum)){
                sum +=1;
            }
        }
        return sum;
        
    }
}
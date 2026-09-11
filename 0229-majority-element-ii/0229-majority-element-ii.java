class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int i = 0 , j = 1 ;
        while( j < n){
            if(nums[j] != nums[j-1]){
                if((j - i) > (n/3)){
                    list.add(nums[j-1]);
                }
                i = j ;
            }
            j++; 
        }
        if((j - i) > (n/3)){
            list.add(nums[i]);
        }
        return list;
    }
}
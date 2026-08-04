class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int max = nums[0];
        int min = nums[0];
        for (int num : nums){
            set.add(num);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        while(min <= max){
            if(!set.contains(min)){
                list.add(min);
            }
            min++;
        }
        return list;
    }
}
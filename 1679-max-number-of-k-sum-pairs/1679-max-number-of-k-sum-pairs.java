class Solution {
    public int maxOperations(int[] nums, int k) {
        // HashMap <Integer, Integer> map = new HashMap<>();

        int count = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     int remain = k - nums[i];
        //     if (map.getOrDefault(remain, 0) > 0) {
        //         count++;
        //         map.put(remain, map.get(remain) - 1); 
        //     } else {
        //         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //     }
        // }
        // return count ;

        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length - 1;
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum < k){
                i++ ;
            }
            else if( sum > k){
                j--;
            }
            else {
                count++;
                i++;
                j-- ; 
            }
        }
        return count ;
    }
}
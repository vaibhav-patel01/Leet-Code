// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         int n = nums.length;
//         int i = 0, j = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         int sum = 0 ;
//         int max = 0; 
//         while(j < n){
//             sum += nums[j];
//             map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
//             while(map.get(nums[j]) != 1){
//                 sum -= nums[i];
//                 int value = map.get(nums[i]) -1; 
//                 if(value == 0 ){
//                     map.remove(nums[i]);
//                 }
//                 else{
//                     map.put(nums[i], value);
//                 }
//                 i++; 
//             }
//             max = Math.max(sum, max);
//             j++;
//         }
//         return max; 
//     }
// }
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        boolean[] set = new boolean[10001];

        int i=0;
        int sum = 0;
        int max = 0;

        for(int j=0; j<n; j++){
            sum += nums[j];

            while(set[nums[j]]){
                set[nums[i]] = false;
                sum -= nums[i];
                i++;
            } 

            set[nums[j]] = true;;

            max = Math.max(sum, max);
        }

        return max;
    }
}
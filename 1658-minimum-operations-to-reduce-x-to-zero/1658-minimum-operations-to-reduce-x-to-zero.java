// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int n = nums.length;
//         int prefix = 0, suffix = 0;
//         int j = 1 , min = n+n;
//         List<Integer> list = new ArrayList<>();
//         Map<Integer,Integer> map = new HashMap<>();
//         for (int i = n-1 ; i>=0 ;i--){
//             suffix += nums[i];
//             if(suffix < x){
//                 map.put(suffix, j);
//             }
//             else if(suffix == x){
//                 list.add(j);
//                 break;
//             }else{
//                 break;
//             }
//             j++;
//         }  
//         for (int i = 0; i < n ; i++){
//             prefix += nums[i];
//             if(prefix == x){
//                 list.add(i+1);
//                 break;
//             }
//             else if(prefix < x){
//                 int temp = x - prefix;
//                 if(map.containsKey(temp)  && (i + 1 + map.get(temp) <= n)){
//                     list.add(i+1 + map.get(temp));
//                 }
//             }
//             else{
//                 break;
//             }
//         }
//         if(list.size() == 0) return -1; 
//         for (int val : list){
//             if(val< min) min = val;
//         }
//         return min;


//     }
// }
class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;
        
        if (target < 0) return -1;
        if (target == 0) return nums.length;

        int left = 0;
        int currentSum = 0;
        int maxSubarrayLen = -1;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                maxSubarrayLen = Math.max(maxSubarrayLen, right - left + 1);
            }
        }

        return maxSubarrayLen == -1 ? -1 : nums.length - maxSubarrayLen;
    }
}
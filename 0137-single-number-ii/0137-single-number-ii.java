// class Solution {
//     public int singleNumber(int[] nums) {
//         int result = 0;
//         int bitChecked = 0;
//         for (int bit = 0; bit< 32 ; bit++){
//             int zeros = 0;
//             int ones = 0;
//             for (int num : nums){
//                 if((num & (1<<bit)) == 0){
//                     zeros++;
//                 }
//                 else {
//                     ones++;
//                 }
//             }
//             if(ones % 3 != 0){
//                 result |= 1<<bit;
//             }
            
//         }
//         return result;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int bitChecked = 0;
        for (int bit = 0; bit< 32 ; bit++){
            int ones = 0;
            for (int num : nums){
                if((num & (1<<bit)) != 0){
                    ones++;
                }
            }
            if(ones % 3 != 0){
                result |= 1<<bit;
            }
            
        }
        return result;
    }
}
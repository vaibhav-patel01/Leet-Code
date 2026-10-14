// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         if(sum > 9*num){
//             return "";
//         }
//         int k = sum/9; 
//         int remain = sum % 9; 
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < k; i++){
//             sb.append('9');
//         }
//         if(remain > 0){
//             sb.append((char) (remain + '0'));
//         }
//         while(sb.length() < num){
//             sb.append('0');
//         }
//         return sb.toString();

//     }
// }
class Solution {
    public String maxSumOfSquares(int num, int sum) {
       if(sum > 9*num){
            return "";
        }
        StringBuilder sb = new StringBuilder();
       
        for(int i=0; i<num; i++){
            int curr = Math.min(9, sum);
            sb.append(curr);
            sum -= curr;
        }

        return sb.toString();
    }
}
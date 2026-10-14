class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9*num){
            return "";
        }
        int k = sum/9; 
        int remain = sum % 9; 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            sb.append('9');
        }
        if(remain > 0){
            sb.append((char) (remain + '0'));
        }
        while(sb.length() < num){
            sb.append('0');
        }
        return sb.toString();

    }
}
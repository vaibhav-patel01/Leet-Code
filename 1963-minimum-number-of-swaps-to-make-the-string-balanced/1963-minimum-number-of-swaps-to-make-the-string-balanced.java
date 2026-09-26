class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int max = 0 ;
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '['){
                count++; 
            }
            else {
                count--;
            }
            if(count < 0 ){
                max = Math.max(max, -1*count);
            }
        }
        return (max+1)/2;
    }
}
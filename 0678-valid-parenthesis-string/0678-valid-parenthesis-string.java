class Solution {
    public boolean checkValidString(String s) {
        int i = 0, j = 0 ;
        for (char ch : s.toCharArray()){
            if(ch == '('){
                i++;
                j++;
            }
            else if(ch == ')' ){
                i--;
                j--;
            }
            else{
                i--; 
                j++; 
            }
            if(j < 0) return false ;
            i= Math.max(i, 0);
        }
        return i == 0; 
    }
}
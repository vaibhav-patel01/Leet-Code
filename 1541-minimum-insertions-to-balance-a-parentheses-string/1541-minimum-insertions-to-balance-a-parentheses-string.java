class Solution {
    public int minInsertions(String s) {
        int total = 0;
        int left  = 0;
        int n = s.length();
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                left++; 
            }
            else{
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i++;
                }
                else{
                    total++; 
                }
                if(left > 0){
                    left--;
                }
                else{
                    total++;
                }
            }
        }
        return total + 2* left;
    } 
}
class Solution {
    public String removeOuterParentheses(String s) {
        int depth =0 ;
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(j < s.length()){
            if(j != 0 && depth == 0){
                int k = i+1;
                while(k < j-1){
                    sb.append(s.charAt(k));
                    k++;
                }
                i = j; 
            }
            if(s.charAt(j) == '('){
                depth++;
            }
            else{
                depth--;
            }
            j++; 
        }
        int k = i+1;
        while(k < j-1){
            sb.append(s.charAt(k));
            k++;
        }

        return sb.toString();
    }
}
class Solution {
    public String reverseWords(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while((s.charAt(i)  == ' ' || s.charAt(j)  == ' ') && i <= j){
            if(s.charAt(i)  == ' ') i++;
            if(s.charAt(j)  == ' ') j--;
        } 
        while(i <= j){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i++;
            }
            else {
                if(sb.charAt(sb.length() - 1) != ' '  ){
                   sb.append(s.charAt(i));
                   i++; 
                }
                else {
                    i++;
                }
            }
        }
        reverse(sb, 0, sb.length() - 1 );
        int start = 0;
        for (int end = 0; end <= sb.length(); end++) {
            if (end == sb.length() || sb.charAt(end) == ' ') {
                reverse(sb, start, end - 1);
                start = end + 1; 
            }
        }
        return sb.toString();

    }
    static void reverse(StringBuilder s, int i,int j){
        while( i <= j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j) );
            s.setCharAt(j, temp );
            i++;
            j--;
        }
    }
}
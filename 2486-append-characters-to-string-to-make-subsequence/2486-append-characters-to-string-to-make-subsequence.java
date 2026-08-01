class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0 ;
        int j = 0 ; 
        while(i < s.length() && j < t.length()){
            int a = s.charAt(i);
            int b = t.charAt(j); 
            if(a == b) j++;
            i++;
        }
        return t.length() - j;
    }
}
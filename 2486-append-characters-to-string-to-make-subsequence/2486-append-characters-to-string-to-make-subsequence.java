class Solution {
    public int appendCharacters(String s, String t) {
        int count = t.length();
        int i = 0;
        int j = 0;
        int n = t.length();
        while(i < n){
            if(j == s.length()){
                return count ;
            }
            char x = s.charAt(j);
            char y = t.charAt(i);
            if(x ==  y){
                i++;
                j++;
                count-- ;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
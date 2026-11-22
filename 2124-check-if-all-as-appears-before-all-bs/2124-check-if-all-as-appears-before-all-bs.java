class Solution {
    public boolean checkString(String s) {
        if(s.length() == 1) return true; 
        for (int i = 1; i< s.length(); i++){
            if(s.charAt(i) == 'a' && s.charAt(i-1) == 'b'){
                return false ;
            }
        }
        return true ;
    }
}
class Solution {
    public boolean checkString(String s) {
        if(s.length() == 1) return true; 
        int a = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a') a++; 
        }
        for (int i = 0; i< a; i++){
            if(s.charAt(i) != 'a'){
                return false ;
            }
        }
        return true ;
    }
}
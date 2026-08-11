class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        int start = 0;
        int max = 0; 
        for (int i = 0 ; i < s.length(); i++){
            int oddCenter = palindromeLen( s,  i , i);
            int evenCenter = palindromeLen(s, i , i+1);
            int currmax = Math.max(oddCenter, evenCenter);
            if(currmax > max){
                max = currmax;
                start = i - (currmax - 1 )/2;
            }
        }
        return s.substring(start, start + max);
    }
    private int palindromeLen(String s, int i , int j){
        while (i >= 0 && j< s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        
        return j - i - 1;
    }
}
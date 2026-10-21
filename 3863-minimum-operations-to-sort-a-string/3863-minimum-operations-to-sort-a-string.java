class Solution {
    public int minOperations(String s) {
        int n = s.length(); 
        int min = 27, max = -1 ;
        int midMin = 27, midMax = -1; 
        boolean sorted = true;
        for (int i = 0; i < n; i++){
            int ch = s.charAt(i) - 'a';
            if(i +1 < n && ch > s.charAt(i+1) - 'a'){
                sorted = false;
            }
            min = Math.min(min, ch);
            max = Math.max(max, ch);
            if (i > 0 && i < n-1 ){
                midMin = Math.min(midMin, ch);
                midMax = Math.max(midMax, ch);
            }   
        }
        if(sorted) return 0; 
        if (n == 2) return -1;
        if(s.charAt(0) - 'a' == min || s.charAt(n- 1) - 'a' == max){
            return 1; 
        }
        if(s.charAt(0) - 'a' > midMax && midMin > s.charAt(n-1) - 'a'){
            return 3; 
        }
        return 2;

    }
}
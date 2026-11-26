class Solution {
    public boolean canAliceWin(int n) {
        int stones =0 ;
        int x = 11; 
        boolean ans = false; 
        for(int i = 0; i < 10; i++){
            x--;
            n -= x ;
            if(n < 0){
                ans = false ;
                break; 
            }
            x--;
            n -= x;
            if(n<0){
                ans = true; 
                break; 
            }
        }
        return ans; 
    }
}
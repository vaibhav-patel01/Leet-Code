class Solution {
    public int minimumPushes(String word) {
        int pushPerWord = 1 ; 
        int n = word.length();
        int push = 0 ;
        for (int i = 0 ; i < n ; i++){
            push += 1 * pushPerWord ; 
            if( (i + 1) % 8 == 0){
                pushPerWord++ ; 
            }
        }
        return push ;
    }
}
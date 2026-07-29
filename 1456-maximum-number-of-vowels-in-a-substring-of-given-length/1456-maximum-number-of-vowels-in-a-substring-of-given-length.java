class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        set.add('a' );
        set.add('e' );
        set.add('i' );
        set.add('o' );
        set.add('u' );
        int count = 0 ; 
        int max = 0 ;
        int i = 0 , j = 0;
        while(j < n){
            if(set.contains(s.charAt(j))){
                count++ ;
            }
            if((j - i + 1) == k){
                max = Math.max(max, count);
                if(set.contains(s.charAt(i))){
                    count-- ; 
                }
                 i++ ; 
            }
            j++ ; 
        }
        return max ;
    }
}
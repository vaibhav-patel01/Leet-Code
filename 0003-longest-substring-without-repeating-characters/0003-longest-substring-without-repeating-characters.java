class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 ;
        int j = 0;
        int count = 0;
        int max = 0; 
        int n = s.length();
        HashSet<Character> set = new HashSet<Character>();
        while( j < n){
            if( !set.contains(s.charAt(j)) ){
                set.add(s.charAt(j));
                j++;
                count++;
                
            }
            else{
                set.remove(s.charAt(i));
                i++;
                count--;
            }
            max = Math.max(max,count);
        }
        return max;

    }
}
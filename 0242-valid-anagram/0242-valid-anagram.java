class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;
        int[] sfreq = new int[26];
        int[] tfreq = new int[26];
        int i = 0 ;
        while(i < s.length()){
            sfreq[s.charAt(i) - 'a']++ ;
            tfreq[t.charAt(i) - 'a']++ ;
            i++;
        }
        if(Arrays.equals(sfreq, tfreq)) return true;
        return false;
    }
}
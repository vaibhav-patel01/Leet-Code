class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int[] sfreq = new int[26];
        int[] pfreq = new int[26];
        for ( char val : p.toCharArray()){
            pfreq[val - 'a'] += 1;
        }
        while( j < s.length()){
            sfreq[s.charAt(j) - 'a'] += 1;
            if(Arrays.equals(sfreq, pfreq)){
                list.add(i);
            }
            if((j - i + 1) == p.length() ){
                sfreq[s.charAt(i) - 'a'] -= 1;
                i++;
            }
            j++;
        }
        return list;
    }
}
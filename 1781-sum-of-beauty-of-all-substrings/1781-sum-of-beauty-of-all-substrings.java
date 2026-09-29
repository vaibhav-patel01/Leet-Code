class Solution {
    public int beautySum(String s) {
        int sum = 0 ;
        int n = s.length();
        for (int i = 0; i < n; i++){
            int[] freq = new int[26];
            int max =0;
            for (int j = i; j <n ; j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++; 
                max = Math.max(max, freq[ch - 'a']);
                int min = 501; 
                for (int k = 0; k < 26; k++){
                    if(freq[k] < min && freq[k] != 0){
                        min = freq[k];
                    }
                }
                sum += max- min; 
            }
        }
        return sum; 


    }
}
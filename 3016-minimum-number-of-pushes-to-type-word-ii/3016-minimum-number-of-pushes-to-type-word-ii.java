class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int pushes = 0 ; 
        int pushCount = 1;
        int n = word.length();
        for (int i = 0 ;i < n ; i++){

            freq[word.charAt(i) - 'a']++ ; 
        }
        Arrays.sort(freq);
        int j = 1; 
        for(int i = 25 ; i >= 0 ; i--){
            pushes += pushCount * freq[i]; 
            if(j % 8 == 0){
                pushCount++;
            }
            j++;
        }
        return pushes ;
    }
}
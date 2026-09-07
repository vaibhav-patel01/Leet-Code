class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length ;
        int[] freq = new int[26] ;
        for (char val : tasks){
            freq[val - 'A']++; 
        }
        Arrays.sort(freq);
        
        int spaces = freq[25] - 1 ;
        int slots = spaces * n;
        for (int i = 24 ; i >=0 ; i--){
            slots = slots - Math.min(spaces, freq[i]);
        }
        if(slots > 0 ){
           return tasks.length + slots; 
        }
        return tasks.length;
    }
}
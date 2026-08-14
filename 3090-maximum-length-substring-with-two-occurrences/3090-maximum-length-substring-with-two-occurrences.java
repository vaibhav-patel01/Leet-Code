class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = s.length();
        int max = 0, count = 0; 
        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) +1); 
            if(map.get(ch) <= 2){
                count++; 
            }
            else{
                while(s.charAt(i) != ch){
                    char temp = s.charAt(i); 
                    map.put(temp, map.get(temp) - 1);
                    count--;
                    i++;
                }
                map.put(ch, map.get(ch) - 1);
                i++;
            }
            max = Math.max(max, count);
            j++;
        }
        return max; 
    }
}
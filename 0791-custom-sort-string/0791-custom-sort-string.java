class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char item : s.toCharArray()){
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        int i = 0, j = 0 ;
        while(i < order.length()){
            char x = order.charAt(i); 
            while(map.containsKey(x) && map.get(x) != 0){
                sb.append(x); 
                map.put(x, map.get(x) - 1);
                j++;
            } 
            i++; 
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            int value = entry.getValue() ;
            while(value != 0){
                sb.append(entry.getKey());
                value--;
            }
        }
        return sb.toString();
    }
}
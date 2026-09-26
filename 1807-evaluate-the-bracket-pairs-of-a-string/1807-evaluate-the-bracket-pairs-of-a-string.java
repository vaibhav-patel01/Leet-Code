class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        Map<String, String> map = new HashMap<>();
        for (List<String> val : knowledge){
            map.put(val.get(0), val.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        while(i < n){
            char c = s.charAt(i);
            if(c == '('){
                StringBuilder key = new StringBuilder();
                i++;
                while( s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }
                String key2 = key.toString();
                sb.append(map.getOrDefault(key2, "?"));
            }
            else{
                sb.append(c);
            }
            i++; 
        }
        return sb.toString();
    }
}
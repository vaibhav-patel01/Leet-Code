class element {
    char ch;
    int count;
    public element(char c, int freq){
        ch = c;
        count = freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<element> maxHeap = new PriorityQueue<>(
            (a,b) -> b.count - a.count
        );
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            maxHeap.add(
                new element(
                    entry.getKey(),
                    entry.getValue()
                )
            );
        }
        for(int i = 0 ; i < s.length() ; i++){
            element value = maxHeap.remove();
            if(sb.length() == 0 || value.ch != sb.charAt(sb.length() - 1)){
                sb.append(value.ch);
                maxHeap.add(new element(value.ch, value.count - 1));
            }
            else if(maxHeap.isEmpty()) return "";
            else{
                element value2 = maxHeap.remove();
                if(value2.count == 0) return "";
                sb.append(value2.ch);
                maxHeap.add(new element(value.ch, value.count ));
                maxHeap.add(new element(value2.ch, value2.count - 1));
            }
        }
        return sb.toString();
    }
}
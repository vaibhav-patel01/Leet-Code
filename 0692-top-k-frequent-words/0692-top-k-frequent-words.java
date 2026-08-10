class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        String[] ans = new String[k];
        Map< String, Integer> map = new HashMap<>();
        for(String word : words ){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>(
            (a, b) -> (map.get(a).equals( map.get(b))) ? 
             b.compareTo(a) : Integer.compare(map.get(a), map.get(b))
        );
        for (String word : map.keySet() ){
            minHeap.add(word);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int i = k -1 ; i >=0 ; i--){
            ans[i] = minHeap.poll();
        }
        return new ArrayList<>(Arrays.asList(ans));
        
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted =  new int[n];
        for(int i = 0 ; i< n ; i++){
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int rank = 1;
        for(int i = 0; i < n; i++){
            map.put(sorted[i], rank);
            if(i + 1 < n && sorted[i+1] != sorted[i]){
                rank++;
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
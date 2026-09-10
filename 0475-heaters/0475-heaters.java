class Solution {
    public int findRadius(int[] houses, int[] h) {
        Arrays.sort(houses);
        Arrays.sort(h);
        int j = 0;
        int max = 0; 
        for (int i = 0 ; i < houses.length ; i++){
            while (j + 1 < h.length && Math.abs(houses[i] - h[j + 1]) <= Math.abs(houses[i] - h[j])) {
                j++; 
            }
            int dist = Math.abs(houses[i] - h[j]);
            max = Math.max(max, dist);
        }
        return max; 
    }
    
}
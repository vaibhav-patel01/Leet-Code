class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int len = reservedSeats.length; 
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i< len ; i++){
            int row = reservedSeats[i][0];
            int seat = reservedSeats[i][1];

            // map.computeIfAbsent(row, k -> new HashSet<>()).add(col);
            map.put(row, map.getOrDefault(row, 0) | (1<< seat));
        }
        int maskA = (1<<2) | (1<<3) | (1<<4) | (1<<5) ;
        int maskB = (1<<6) | (1<<7) | (1<<4) | (1<<5) ;
        int maskC = (1<<6) | (1<<7) | (1<<8) | (1<<9) ;
        for (int row : map.keySet()) {
            int s = map.get(row);
            boolean left = (s & maskA) == 0;
            boolean right = (s & maskC) == 0;
            boolean middle = (s & maskB) == 0;
            if (left && right) {
                ans += 2;
            } else if (left || right || middle) {
                ans += 1;
            }
        }
        ans = ans + (n - map.size()) * 2;
        return ans;
       
    }
}

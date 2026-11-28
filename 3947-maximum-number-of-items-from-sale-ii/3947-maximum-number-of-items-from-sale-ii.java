
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        int min = Integer.MAX_VALUE;
        for (int[] row : items) {
            freq[row[0]]++;
            min = Math.min(min, row[1]);
        }
        int[] mult = new int[n + 1];
        for (int f = 1; f <= n; f++)
            for (int j = f; j <= n; j += f)
                mult[f] += freq[j];
                                                   // item with copies sort by price first than min price item; 
        List<int[]> list = new ArrayList<>();
        for (int[] it : items) {
            int free = mult[it[0]] - 1;              
            if (free > 0 && it[1] < 2L * min)
                list.add(new int[]{it[1], free});   
        }
        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        long left = budget, ans = 0;
        for (int[] u : list) {
            long k = Math.min(left / u[0], u[1]);
            left -= k * u[0];
            ans += 2 * k;
        }
        return (int) (ans + left / min);
    }
}
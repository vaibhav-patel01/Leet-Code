class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int m = queries.length;
        Integer[] idx = new Integer[m];
        for (int i = 0; i < m; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Integer.compare(queries[a], queries[b]));
        int[] freq = new int[n + 1];
        int active = 0;         
        int l = 0, r = 0;
        int[] ans = new int[m];

        for (int k : idx) {
            int q = queries[k];
            while (r < logs.length && logs[r][1] <= q) {
                if (freq[logs[r][0]]++ == 0) active++;
                r++;
            }
            while (l < r && logs[l][1] < q - x) {
                if (--freq[logs[l][0]] == 0) active--;
                l++;
            }
            ans[k] = n - active; 
        }
        return ans;
    }
}
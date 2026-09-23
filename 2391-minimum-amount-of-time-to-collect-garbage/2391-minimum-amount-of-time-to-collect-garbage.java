class Solution {
    public int garbageCollection(String[] g, int[] t) {
        int n = g.length, m = t.length;
        int mCount = 0, pCount = 0, gCount = 0, total = 0;
        int lastMIndex = -1 , lastPIndex = -1, lastGIndex = -1;
        int prefix = 0;
        for (int i = 0; i < n; i++){
            if(g[i].indexOf('M') != -1){
                lastMIndex = i; 
            }
            if(g[i].indexOf('P') != -1){
                lastPIndex = i; 
            }
            if(g[i].indexOf('G') != -1){
                lastGIndex = i;
            }
            if(i < m){
                prefix += t[i];
                t[i] = prefix;
            }
        }
        for (int i = 0; i < n; i++) {
            String s = g[i];
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'M') mCount++;
                if (ch == 'P') pCount++;
                if (ch == 'G') gCount++;
            }
        }
        int mtime = 0; 
        int ptime = 0; 
        int gtime = 0;
        if (lastMIndex != -1) {
            mtime = mCount + (lastMIndex > 0 ? t[lastMIndex - 1] : 0);
        }
        if (lastGIndex != -1) {
            gtime = gCount + (lastGIndex > 0 ? t[lastGIndex - 1] : 0);
        }
        if (lastPIndex != -1) {
            ptime = pCount + (lastPIndex > 0 ? t[lastPIndex - 1] : 0);
        }
        return  mtime + gtime+ ptime;
    }
}
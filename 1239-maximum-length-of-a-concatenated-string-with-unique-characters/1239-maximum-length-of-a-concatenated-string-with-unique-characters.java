class Solution {
    public int maxLength(List<String> arr) {
        StringBuilder sb = new StringBuilder();
        return solve(arr, 0, sb );
    }
    private int solve(List<String> arr, int i, StringBuilder sb){
        if(i >= arr.size()){
            return 0 ;
        }
        String s = arr.get(i); 
        sb.append(s);
        int take = 0;
        if(check(sb)){
            take = s.length() + solve(arr, i+1, sb);
        }
        sb.delete( sb.length() - s.length() , sb.length() );
        int skip = solve(arr, i+1, sb);
        return Math.max(take, skip);
    }
    private boolean check(StringBuilder sb) {
        if(sb.length() > 26) return false;
        int[] freq = new int[26];
        for (int i = 0; i < sb.length(); i++) {
            int idx = sb.charAt(i) - 'a';
            if (freq[idx] != 0) {
                return false;
            }
            freq[idx]++;
        }
        return true;
    }
}
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        int maxSize = b.length() + a.length() + a.length();
        while(sb.length() <= maxSize){
            if(sb.indexOf(b) != -1){
                return count;
            }
            else{
                sb.append(a);
                count++;
            }
        }
        return -1;
    }
}
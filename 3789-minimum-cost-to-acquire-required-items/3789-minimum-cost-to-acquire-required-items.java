class Solution {
    public long minimumCost(int c1, int c2, int c3, int n1, int n2) {
        long max = Math.max(n1, n2);
        long min = Math.min(n1, n2);
        long a = c1, b = c2, c = c3 ;
        if(max == 0) return 0;
        long z = c* max; 
        long y = a*n1 + b*n2; 
        long x = 0;
        if(n1 >= n2){
            x = c* n2 + (n1-n2)*a; 
        }
        else{
            x = c*n1 + (n2 - n1)*b;
        }
        return Math.min(Math.min(z,y), x); 
    }
}
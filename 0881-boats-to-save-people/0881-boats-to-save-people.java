class Solution {
    public int numRescueBoats(int[] a, int k) {
        Arrays.sort(a);
        int i = 0 , j = a.length - 1; 
        int boats = 0; 
        while( i <= j){
            if( a[i] + a[j] > k){
                j--;
            }
            else{
                i++; j--;
            }
            boats++; 
        }
        return boats;
    }
}
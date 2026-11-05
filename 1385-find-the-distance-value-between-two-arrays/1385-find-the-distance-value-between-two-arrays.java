class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int num : arr1){
            if(check(arr2, d, num)){
                count++; 
            }
        }
        return count;
    }
    private boolean check(int[] a, int d, int x){
        int i = 0, j = a.length- 1;
        while(i <= j){
            int diff1 = Math.abs(x - a[i]);
            int diff2 = Math.abs(x - a[j]);
            if(diff1 <= d || diff2 <= d){
                return false;
            }
            i++; 
            j--; 
        }
        return true; 
    }
}
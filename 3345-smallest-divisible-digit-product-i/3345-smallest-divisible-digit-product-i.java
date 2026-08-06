class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i < 101; i++){
            if(product(i) % t == 0){
                return i;
            }
        }
        return 0;
    }
    private int product(int n){
        int ans = 1;
        while(n != 0){
            ans *= n%10;
            n/=10;
        }
        return ans;
    }
}
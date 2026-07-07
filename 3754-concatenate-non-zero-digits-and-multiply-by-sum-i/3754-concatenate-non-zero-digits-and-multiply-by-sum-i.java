class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int ans = 0;
        int x = 1;
        while( n  > 0){
            int temp = n%10;
            n /= 10;
            if(temp == 0) continue;
            sum += temp;
            ans = ans + (temp * x);
            x = x*10;
        }
        return (long) ans*sum;
    }
}
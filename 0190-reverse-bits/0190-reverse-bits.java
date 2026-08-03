class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int bitsLeft = 32;
        while(n != 0){
            int lsb = n & 1 ;
            ans = (ans<<1) | lsb;
            n = n>>1;
            bitsLeft--;
        }
        ans = ans<<bitsLeft;
        return ans;
    }
}
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = nextNumber(slow);                       // slow fast pointer approach
            fast = nextNumber(nextNumber(fast));
        }while(slow != fast);
        if(slow == 1) return true ;
        return false;
    }
    private int nextNumber(int n){
        int ans = 0;
        while(n > 0){
            int temp = n%10;
            ans += temp * temp;
            n /= 10;
        }
        return ans;
    } 
}
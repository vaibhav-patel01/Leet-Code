class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        while(n  > 0){
            int temp = n % 10;
            ans += (temp * temp);
            n /= 10;
            if(n == 0){
                if(ans == 1) return true;
                if(set.contains(ans)){
                    return false;
                }
                else set.add(ans);
                n = ans;
                ans = 0;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean isHappy(int n) {
//         if(n==1 || n==7) return true;
//         else if(n<10) return false;
//         else{
//             int sum=0;
//             while(n>0){
//                 int temp=n%10;
//                 sum+= temp*temp;
//                 n=n/10;
//             }
//             return isHappy(sum);
//         }
//     }
// }
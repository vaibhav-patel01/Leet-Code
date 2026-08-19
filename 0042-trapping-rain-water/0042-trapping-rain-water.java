class Solution {
    public int trap(int[] height) {
        int n = height.length, ans = 0;
        if(n <= 2) return 0 ;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        rightMax[n-1] = height[n-1];
        for (int i = n - 2 ; i >=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        for (int i = 0 ; i <n ; i++){
            ans += Math.min(leftMax[i] , rightMax[i]) - height[i]; 
        }
        return ans;
    }
}


// class Solution {
//     public int trap(int[] b) {
//         int n = b.length;
//         int l = 0, r = n - 1, lmax = 0, rmax = 0, res = 0;
//         while (l < r) {
//             if (b[l] < b[r]) {
//                 lmax = Math.max(lmax, b[l]);
//                 res += lmax - b[l];
//                 l++;
//             } else {
//                 rmax = Math.max(rmax, b[r]);
//                 res += rmax - b[r];
//                 r--;
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0, k = 0, mask = 1 ;
        int[] ans = new int[2];
        boolean flag = true;
        for (int num : nums){
            xor ^= num;
        }
        while(flag){
            if(((xor>>k) & 1) == 1){
                flag = false;
            }
            else{
                k++;
            }
        }
        // to find the mask  xor & -xor
        mask = mask<<k;
        for(int num : nums){
            if((num & mask) != 0){
                ans[0] ^= num;
            }
            else{
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
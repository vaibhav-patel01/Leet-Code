class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int[] remainderFreq = new int[k];
        remainderFreq[0] = 1;
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            int rem = (sum % k + k) % k;
            count += remainderFreq[rem];
            remainderFreq[rem]++;
        }
        return count;
    }
}
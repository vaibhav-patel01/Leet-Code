class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max = 0;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1 ; i < arr.length ;i++){
            if(arr[i]  - arr[i - 1]  > 1){
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[arr.length - 1];
    }
}
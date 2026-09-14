class Solution {
    public int[] minOperations(String boxes) {
        int sum = 0 , ones = 0;
        int n = boxes.length();
        int[] arr = new int[n];
        for (int i= 0 ; i < n ; i++){
            if (boxes.charAt(i) == '1'){
                sum += i;
                ones++;
            }
        }
        int onesBefore = 0 ;
        for (int i = 0; i < n ; i++){
            arr[i] = sum ;
            if(boxes.charAt(i) == '1'){
                ones--;
                onesBefore++;
                
            }
            sum = sum - ones + onesBefore;
        }
        return arr;
    }
}
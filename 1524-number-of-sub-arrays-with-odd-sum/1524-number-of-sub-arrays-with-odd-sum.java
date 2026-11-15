class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length; 
        int even =1 ;
        int odd = 0;
        long count =0 ;
        int sum= 0; 
        for (int i= 0; i <n; i++){
            sum += arr[i]; 
            if(sum %2 == 0){
                even++; 
                count += odd;
            }
            else{
                odd++; 
                count += even ; 
            }
        }
        return (int)(count % 1000000007);
    }
}
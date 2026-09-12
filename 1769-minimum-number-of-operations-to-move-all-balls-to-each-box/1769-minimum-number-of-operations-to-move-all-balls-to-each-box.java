class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int[] temp = new int[n];
        for (int i = 0 ; i < n ; i++){
            if(boxes.charAt(i) == '1')
            temp[i] = 1;  
        }
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j++){
                if(temp[j] == 1){
                    ans[i] += Math.abs(j-i); 
                }
            }
        }
        return ans;

    }
}
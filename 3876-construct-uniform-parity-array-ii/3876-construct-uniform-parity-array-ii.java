class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean flag = false; 
        int min = nums1[0]; 
        for (int num : nums1){
            if (num % 2 !=0 ){
                flag = true;
            }
            if(num < min){
                min = num;
            }
        }
        if(!flag) return true;
        return (min % 2 != 0 ) ;
    }
}
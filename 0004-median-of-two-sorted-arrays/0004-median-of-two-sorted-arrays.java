class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n+m];
        int i = 0, j = 0, k = 0;
        while( i < n || j < m){
            if( i == n){
                result[k] = nums2[j];
                k++;
                j++;
                continue;
            }
            if( j == m){
                result[k] = nums1[i];
                k++;
                i++;
                continue;
            }
            if( nums1[i] <= nums2[j] ){
                result[k] = nums1[i];
                i++;
            }
            else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        int mid = result.length / 2;
        if(result.length % 2 == 0 ){
            return (float)(result[mid] + result[mid - 1]) / 2;
        }
        else{
            return result[mid];
        }
    }
}
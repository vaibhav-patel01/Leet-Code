class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list  = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int val : set1){
            if(!set2.contains(val)){
                row1.add(val);
            }
        }
        for (int val : set2){
            if(!set1.contains(val)){
                row2.add(val);
            }
        }
        list.add(row1);
        list.add(row2);
        return list;

    }
}
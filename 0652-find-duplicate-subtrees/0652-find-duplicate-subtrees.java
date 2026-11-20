class Solution {
    private Map<String, Integer> map ; 
    private List<TreeNode> list ;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        list = new ArrayList<>();
        solve(root);
        return list; 
    }
    private String solve(TreeNode node){
        if(node == null){
            return "N";
        }
        String s = String.valueOf(node.val) + ',' + solve(node.left) + ',' + solve(node.right);
        map.put(s,map.getOrDefault(s, 0) + 1); 
        if(map.get(s) ==2 ){
            list.add(node);
        }
        return s;
    }
}
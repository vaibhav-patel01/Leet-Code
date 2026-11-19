class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        solve(root, targetSum,0, sublist);
        return list;
    }
    private void solve(TreeNode node, int target,int sum, List<Integer> sublist){
        if(node == null){
            return ;
        }
        if(node.left == null && node.right == null){
            sum+= node.val; 
            if(sum== target){
                sublist.add(node.val);
                list.add(new ArrayList(sublist));
                sublist.remove(sublist.size() - 1); 
            }
            return ;
        }
        sum += node.val; 
        sublist.add(node.val);
        solve(node.left, target, sum, sublist);
        solve(node.right, target, sum, sublist);
        sublist.remove(sublist.size()-1);
        return;
    }
}
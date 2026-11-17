
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         if(root == null) return list;
//         Deque<TreeNode> stack = new ArrayDeque<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             TreeNode temp = stack.pop();
//             if(temp.right != null){
//                 stack.push(temp.right);
//             }
//             if(temp.left != null){
//                 stack.push(temp.left);
//             }
//             list.add(temp.val);
//         }
//         return list;
//     }
// }

class Solution {
    List<Integer> list; 
    public List<Integer> preorderTraversal(TreeNode root) {
        list  =  new ArrayList<>();
        solve(root);
        return list ;
    }
    private void solve(TreeNode node){
        if(node == null){
            return ; 
        }
        list.add(node.val);
        solve(node.left);
        solve(node.right);
    }
}
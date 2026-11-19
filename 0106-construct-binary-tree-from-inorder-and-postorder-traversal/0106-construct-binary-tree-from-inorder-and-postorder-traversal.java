
class Solution {
    Map<Integer, Integer> map; 
    int idx; 
    public TreeNode buildTree(int[] inorder, int[] postorder ) {
        map = new HashMap<>();
        int n = postorder.length;
        for(int i = 0; i<n;i++){
            map.put(inorder[i], i);
        }
        idx = n-1;
        return solve(postorder, inorder, 0, n-1 );
    }
    private TreeNode solve(int[] post, int[] in, int i, int j){
        if(j < i){
            return null;
        }
        TreeNode node = new TreeNode(post[idx]);
        int inIndex = map.get(post[idx]);
        idx--; 
        node.right = solve(post, in, inIndex+1, j);
        node.left =  solve(post,in ,i, inIndex-1);
        return node ; 
    }
}
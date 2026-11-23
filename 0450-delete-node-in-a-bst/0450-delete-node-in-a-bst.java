class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root; 
        return delete(root, key);
    }
    private TreeNode delete(TreeNode node, int key){
        if(node == null){
            return node; 
        }
        if(key > node.val){
            node.right = delete(node.right, key); 
        }
        if(key< node.val){
            node.left = delete(node.left, key);
        }
        if(node.val == key ){
            if(node.left == null && node.right == null){
                return null;
            }
            if(node.left == null){
                return node.right; 
            }
            if(node.right == null){
                return node.left; 
            }
            else{
                TreeNode successor = findMin(node.right);
                node.val = successor.val; 
                node.right = delete(node.right, successor.val); 
            }
        }
        return node ;
    }
    private TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left; 
        }
        return node;
    }
}
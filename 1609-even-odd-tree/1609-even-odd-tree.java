
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0; 
        int lower = 0; 
        int upper = 1000001; 
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size != 0){
                TreeNode temp = queue.remove();
                if(level %2 == 0){
                    if(temp.val % 2 == 0){
                        return false; 
                    }
                    else{
                        if(lower < temp.val) lower = temp.val;
                        else return false;
                    }
                }
                else{
                    if(temp.val % 2 != 0){
                        return false; 
                    }
                    else{
                        if(upper> temp.val) upper = temp.val;
                        else return false;
                    }
                }
                size--; 
                if(temp.left != null){
                    queue.add(temp.left); 
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            level++; 
            lower = 0;
            upper = 1000001;
        }
        return true;
    }
}
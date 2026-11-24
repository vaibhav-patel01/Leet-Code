class Solution {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root); 
        int max = Integer.MIN_VALUE; 
        int level = 1;
        int ans = 0; 
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0; 
            for (int i= 0; i< size; i++){
                TreeNode temp = queue.remove();
                sum += temp.val; 
                if(temp.left != null){
                    queue.add(temp.left); 
                } 
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            if(sum > max){
                max = sum; 
                ans = level ;
            }
            level++; 
        }
        return ans; 

    }
}
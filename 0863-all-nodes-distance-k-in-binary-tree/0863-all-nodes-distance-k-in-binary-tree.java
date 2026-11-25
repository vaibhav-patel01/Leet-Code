/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

                                    //    make parent connection and start bfs from target

class Solution {
    Map<TreeNode, TreeNode> parent ; 
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent = new HashMap<>();
        List<Integer> list = new ArrayList<>(); 
        if(k == 0 ){
            list.add(target.val);
            return list; 
        }
        Set<Integer> set = new HashSet<>(); 
        Deque<TreeNode> queue = new ArrayDeque<>();
        parentConnection(root);
        queue.add(target); 
        set.add(target.val); 
        int level = 0 ;
        while(!queue.isEmpty()){
            int size = queue.size(); 
            for(int i =0 ;i < size; i++){
                TreeNode temp = queue.remove(); 
                set.add(temp.val); 
                if(temp.left != null && !set.contains(temp.left.val)){
                    queue.add(temp.left); 
                    
                }
                if(temp.right != null && !set.contains(temp.right.val)){
                    queue.add(temp.right);
                }
                if(parent.containsKey(temp) && !set.contains(parent.get(temp).val)){
                    queue.add(parent.get(temp));
                }
            }
            level++ ; 
            if(level == k){
                break; 
            }
        }
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove(); 
            list.add(temp.val); 
        }
        return list; 

    }
    private void parentConnection(TreeNode node){
        if(node == null){
            return ; 
        }
        if(node.left != null){
            parent.put(node.left, node); 
        }
        parentConnection(node.left); 
        if(node.right != null){
            parent.put(node.right, node);
        }
        parentConnection(node.right);
        return ;
    }
}
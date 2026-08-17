class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0 ,n = pushed.length; 
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i =0 ; i < n ; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop(); 
                j++; 
            }
        }
        while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop(); 
                j++; 
        }
        if(stack.size() == 0) return true;
        return false;
    }
}
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != ch){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return String.valueOf(sb);
    }
}
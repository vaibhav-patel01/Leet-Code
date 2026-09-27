class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < n ;i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '(' ){
                    sb.append(stack.poll());
                }
                if(!stack.isEmpty() ){
                    stack.pop();
                }
                for(int j = 0; j < sb.length(); j++){
                    stack.push(sb.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = num.length();
        if(k == n) return "0";
        for (int i = 0 ; i < n ; i++){
            char x = num.charAt(i) ;
            while(!stack.isEmpty() && x < stack.peek() && k > 0){
                stack.pop();
                k-- ;
            }
            stack.push(x); 
        }
        while(!stack.isEmpty() && k > 0){
                stack.pop();
                k-- ;
        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return (sb.length() == 0) ? "0" : String.valueOf(sb);
    }
}
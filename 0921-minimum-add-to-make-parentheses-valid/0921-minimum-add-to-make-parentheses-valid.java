class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character > stack = new ArrayDeque<>();
        int depth = 0, n = s.length();
        int count = 0, validPairs = 0;
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && ch == ')' && stack.peek() == '('){
                stack.pop();
                validPairs++;
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size(); 
    }
}
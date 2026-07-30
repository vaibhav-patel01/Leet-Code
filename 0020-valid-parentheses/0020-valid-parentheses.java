class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack  = new Stack<>();
        Map <Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']', '[');
        int n = s.length();
        for (int i = 0 ; i < n ; i++){
            char bra = s.charAt(i);
            if (map.containsValue(bra)){
                stack.push(bra);
            }
            else {
                if(!stack.empty() && map.get(bra) == stack.peek()){
                    stack.pop();
                }
                else {
                    return false ;
                }
            }
        }
         if(!stack.empty()){
            return false ;
         }
        return true ;
        
    }
}
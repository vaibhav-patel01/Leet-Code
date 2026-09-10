class Solution {
    public String removeDuplicateLetters(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int[] lastIndex = new int[26];
        boolean[] dekhaKya = new boolean[26];
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            lastIndex[c - 'a'] = i;
        }  
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i); 
            if(!dekhaKya[c - 'a']){
                while(!stack.isEmpty() && stack.peek() > c){
                    if(lastIndex[stack.peek() - 'a'] >= i){
                        dekhaKya[stack.peek() - 'a'] = false;
                        stack.pop();
                        
                    }
                    else break;
                }
                stack.push(c);
                dekhaKya[c - 'a'] = true;
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast()); 
        }
        return sb.toString();
    }
}

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                stringStack.push(currStr);
                currStr = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currStr);
                }
                currStr = decodedString;
            } else {
                currStr.append(c);
            }
        }
        return currStr.toString();
    }
}

// class Solution {
//     public String decodeString(String s) {
//         Deque<String> stack = new ArrayDeque<>();
//         int n = s.length(); 
//         for (int i = 0 ;i < n ; i++){
//             char c = s.charAt(i); 
//             if(c == ']'){
//                 StringBuilder sb = new StringBuilder();
//                 StringBuilder num = new StringBuilder();
//                 while(!stack.isEmpty() && !stack.peek().equals("[")){
//                     sb.append(stack.pop());
//                 }
//                 sb.reverse();
//                 if (!stack.isEmpty() && stack.peek().equals("[")) {
//                     stack.pop();
//                 }
//                 while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0)) ){
//                     num.append(stack.pop());
//                 }
//                 num.reverse();
//                 int number = Integer.parseInt(num.toString());
//                 StringBuilder repeated = new StringBuilder();
//                 for (int k = 0; k < number; k++) {
//                     repeated.append(sb);
//                 }
//                 stack.push(repeated.toString());
//             }
//             else{
//                 stack.push(String.valueOf(c));
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         while (!stack.isEmpty()) {
//     result.append(stack.pollLast()); 
// }
//         return result.toString();
//     }
// }

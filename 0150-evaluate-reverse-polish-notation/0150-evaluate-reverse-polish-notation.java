class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0 ; i < tokens.length ; i++){
            String operator = tokens[i];
            if(isOperator(operator)){
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(operator){
                    case "+":
                    stack.push(num2 + num1);
                    break;
                    case "-" :
                    stack.push(num2 - num1);
                    break;
                    case "*" :
                    stack.push(num2 * num1);
                    break;
                    default : 
                    stack.push(num2 / num1);
                }
            }
            else{
                stack.push(Integer.parseInt(operator));
            }
        }
        return stack.peek();
    }
    private boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }
}
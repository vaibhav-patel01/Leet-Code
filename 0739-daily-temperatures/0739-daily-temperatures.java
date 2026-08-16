class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int n = temperatures.length ;
        Stack<int[]> stack = new Stack<>();
        for (int i = n - 1 ; i >= 0 ;i--){
            int num = temperatures[i]; 
            while(!stack.isEmpty() && stack.peek()[0] <= num){
                stack.pop();
            }
            if(stack.isEmpty()){
                 answer[i] = 0;
            }
            else {
                answer[i] = stack.peek()[1] - i ;
            }
            int[] element = new int[2];
            element[0] = num;
            element[1] = i ;
            stack.push(element);
        }
        
        return answer;
    }
}
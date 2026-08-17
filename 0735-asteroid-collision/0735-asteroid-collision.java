class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack =  new ArrayDeque<>();
        int n = asteroids.length; 
        for (int i = 0 ; i < n ; i++){
            int rock = asteroids[i] ; 
            boolean temp = true  ; 
            if(rock < 0){
                while(!stack.isEmpty() && temp && stack.peek() > 0){
                    if(stack.peek() > (-1*rock)){
                        temp = false ; 
                    }
                    else if(stack.peek() < (-1*rock)){
                        stack.pop();
                    }else{
                        stack.pop() ;
                        temp = false;
                    }
                }
            }
            if(temp){
                stack.push(rock);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1 ; i >=0 ; i--){
            result[i] = stack.pop();
        }
        return result ; 

    }
}
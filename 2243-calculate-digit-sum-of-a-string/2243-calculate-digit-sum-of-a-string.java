class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        
        while(sb.length() > k){
            StringBuilder temp = new StringBuilder();
            int sum = 0;
            int i = 0; 
            while(i<sb.length()){
                sum +=   sb.charAt(i)- '0';
                if((i+1) % k == 0){
                    temp.append(sum);
                    sum = 0; 
                }
                
                i++;
            }
            if(sb.length() % k != 0){
                temp.append(sum);
            }
            sb.setLength(0);
            sb.append(temp);
        }
        return sb.toString();
    }
}

// sb1.append(sb2);
// sb.setLength(0); // Empties the StringBuilder

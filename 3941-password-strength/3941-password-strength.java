class Solution {
    public int passwordStrength(String password) {
        int n = password.length(), sum = 0 ; 
        Set<Character> set = new HashSet<>();
        for (char x : password.toCharArray()){
            set.add(x);
        }
        for (char i : set){
            int x = (int)i;
            if((int)'a' <= x  && x <= (int)'z'){
                sum += 1 ;
            }
            else if((int)'A' <= x  && x <= (int)'Z'){
                sum += 2 ;
            }
            else if((int)'0' <= x  && x <= (int)'9'){
                sum += 3 ;
            }
            else{
                sum += 5 ;
            }
        }
        return sum;
    }
}
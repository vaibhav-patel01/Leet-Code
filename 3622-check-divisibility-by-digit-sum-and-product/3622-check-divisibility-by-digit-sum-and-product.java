class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n ;
        int prod = 1, sum = 0 ;
        while(n> 0){
            prod *= n % 10 ;
            sum += n % 10 ;
            n = n / 10 ;
        }
        if(temp % (prod+sum) == 0) return true;
        return false; 
    }
}
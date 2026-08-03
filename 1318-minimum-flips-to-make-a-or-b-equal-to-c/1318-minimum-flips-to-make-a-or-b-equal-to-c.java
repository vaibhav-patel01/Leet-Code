class Solution {
    public int minFlips(int a, int b, int c) {
        int flip = 0;
        while( a != 0 || b != 0 || c != 0){
            int aMsb = a&1;
            int bMsb = b&1;
            int cMsb = c&1;
            if(cMsb == 1){
                if(aMsb == 0 && bMsb == 0){
                    flip++;
                }
            }
            else{
                if(aMsb == 1 && bMsb == 1){
                    flip = flip+2;
                }
                else if(aMsb == 1 || bMsb == 1){
                    flip++;
                }
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return flip;
    }
}
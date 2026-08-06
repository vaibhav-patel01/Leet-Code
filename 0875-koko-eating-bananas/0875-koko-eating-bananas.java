class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long max = piles[0];
        for(int val : piles){
            max = Math.max(max, val);
        }
        long i = 1 , j = max;
        while( i< j){
            long mid = i + (j - i)/2 ;
            if(possibleInTime(piles, h, mid)){
                j = mid;
            }
            else{
                i = mid+ 1;
            }
        }
        return (int)j;
    }
    private boolean possibleInTime(int[] piles, long h, long speed){
        long time = 0;
        for (int i = 0; i < piles.length ;i++){
            time +=  (piles[i]% speed) != 0  ? (piles[i]/speed) + 1 : (piles[i]/speed);
            // time += (long)(piles[i] + speed - 1) / speed;
            if(time > h){
                return false;
            }
        }
        return true;

    }
}
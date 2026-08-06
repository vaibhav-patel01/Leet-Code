class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min = Arrays.stream(time).min().getAsInt();
        long i = 1, j = min * totalTrips; 
        while(i < j){
            long mid = i + (j - i)/2; 
            long midValue = total(mid, time);
            if(midValue >= totalTrips){
                j = mid ;

            }
            else{
                i = mid + 1;
            }
        }
        return j;
    }
    private long total(long n, int[] time){
        long ans = 0;
        for (int i = 0 ; i< time.length ; i++){
            ans += n / time[i];
        }
        return ans;
    }
}
class Solution {
    public int countDays(int days, int[][] meetings) {
        if (meetings.length == 0) {
            return days;
        }
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0], b[0]));
        int daysMeet = 0;
        int currEnd = meetings[0][1];
        int currStart = meetings[0][0];
        for (int i = 1 ; i < meetings.length ; i++){
            int nextStart = meetings[i][0];
            int nextEnd = meetings[i][1];
            if(currEnd >= nextStart ){
                currEnd = Math.max(currEnd, nextEnd);
            }
            else{
                daysMeet += currEnd - currStart + 1 ; 
                currEnd = nextEnd;
                currStart = nextStart;
            }
        }
        daysMeet += currEnd - currStart + 1;



        return days - daysMeet;

    }
}
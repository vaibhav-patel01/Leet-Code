class Solution {
    public int countDaysTogether(String aa, String la, String ab, String lb) {
        
        String lastArrive = aa.compareTo(ab) > 0 ? aa : ab ;
        String earlyDepart = la.compareTo(lb) > 0 ? lb : la ;

        int earyDays = solve(lastArrive);
        int lateDays = solve(earlyDepart);

        return Math.max(0, lateDays - earyDays + 1);
        
    }
    private int solve(String s){
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int m = Integer.parseInt(s.substring(0,2));
        int d = Integer.parseInt(s.substring(3,5));
        for(int i= 0; i < m- 1; i++){
            d += months[i];
        }
        return d;
    }
}
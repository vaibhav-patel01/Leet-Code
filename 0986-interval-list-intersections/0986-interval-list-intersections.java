class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // [[0,2],[5,10],[13,23],[24,25]]
        // [[1,5],[8,12],[15,24],[25,26]]
        // [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

        List<int[]> result = new ArrayList<>();
        int n1 = firstList.length;
        int n2 = secondList.length;
        int i = 0;
        int j = 0;
        while( i < n1 && j < n2){
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];
            if( e1 >= s2 && s1 <= e2){
                result.add( new int[] {Math.max(s1, s2),  Math.min(e1, e2)});  
            }
            if( e1 < e2){
                i++;
            }
            else if(e2 < e1){
                j++;
            }
            else{
                if(n1>=n2) i++;
                else j++;
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}
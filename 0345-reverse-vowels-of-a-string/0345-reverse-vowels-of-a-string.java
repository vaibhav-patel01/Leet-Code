class Solution {
    public String reverseVowels(String s) {
        int i= 0;
        int n = s.length();
        int j = n -1 ;
        char[] arr = s.toCharArray();
        while( i < j){
            char ch1 = arr[i];
            char ch2 = arr[j];
            if(isVowel(ch1) && isVowel(ch2)){
                char temp =  arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                j--;
                i++;
            }
            else if(!isVowel(ch1)){
                i++; 
            }
            else{
                j--; 
            }
        }
        return String.valueOf(arr);
    }
    private boolean isVowel(char ch){
        if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U' ){
            return true;
        }
        return false;
    }
}
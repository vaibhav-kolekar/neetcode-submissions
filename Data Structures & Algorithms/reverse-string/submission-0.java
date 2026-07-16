class Solution {
    public void reverseString(char[] s) {
        char[] x = new char[s.length];
        int j = 0;
        for(int i = s.length-1; i>= 0; i--){
            x[j++] = s[i];
        }
        
        for(int i = 0; i< x.length; i++){
            s[i] = x[i];
        }

        return ;
    }
}
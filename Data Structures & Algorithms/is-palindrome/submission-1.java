class Solution {
    public boolean isPalindrome(String s) {
        String tmp = s.replaceAll("[^\\p{Alnum}]", "");
        String a = tmp.toLowerCase();
        int i = 0, j = a.length()-1;
        while(i<=j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++; j--;
        }

        return true;
    }
}

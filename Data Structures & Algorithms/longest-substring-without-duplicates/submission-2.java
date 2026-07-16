class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char b = s.charAt(j);
                if (!sb.toString().contains(String.valueOf(b))) {
                    sb.append(b);
                    max = Math.max(max, sb.length());
                } else {
                    break;
                }
            }
        }
        return max;
    }
}

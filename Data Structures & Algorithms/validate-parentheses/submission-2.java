class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for (char x : s.toCharArray()) {
            if(x == '(' || x == '{' || x == '['){
                st.push(x);
            }
            else if(x == ')' || x == '}' || x == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if (
                        (x == ')' && top != '(') ||
                                (x == '}' && top != '{') ||
                                (x == ']' && top != '[')
                ) {
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }
}

class Solution {
    public int[] dailyTemperatures(int[] tmp) {
        Stack<Integer>st = new Stack<>();
        int[]res = new int[tmp.length];

        for(int i = tmp.length - 1; i>=0; i--){
            while(!st.empty() && tmp[i] >= tmp[st.peek()] ){
                st.pop();
            }

            if(!st.empty()){
                res[i] = st.peek() - i;
            }

            st.push(i);
        }

        return res;
    }
}

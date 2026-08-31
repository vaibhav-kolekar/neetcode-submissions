class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for(String x : op){
            if(x.equals("+")){
                int first = st.pop();
                int second = st.pop();
                int tmp = first + second;
                st.push(second);
                st.push(first);
                st.push(tmp);
            }else if(x.equals("C")){
                st.pop();
            }else if(x.equals("D")){
                int tmp = st.peek();
                st.push(2*tmp);
            }else{
                st.push(Integer.parseInt(x));
            }
        }
        int sum = 0;
        while(!st.empty()){
            sum += st.peek();
            st.pop();
        }

        return sum;
    }
}
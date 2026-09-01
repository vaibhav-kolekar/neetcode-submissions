class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int x : asteroids){
            boolean destroyed = false;

            while(!st.empty() && x < 0 && st.peek() > 0){
                if(st.peek() < -x){
                    st.pop();
                    continue;
                }else if(st.peek() == -x){
                    st.pop();
                }
                destroyed = true;
                break;
            }

            if(!destroyed){
                st.push(x);
            }
        }

        int [] res = new int [st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            res[i] = st.pop();
        }

        return res;
    }
}
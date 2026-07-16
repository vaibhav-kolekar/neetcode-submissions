class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for(Integer x : nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }else{
                map.put(x, 1);
            }
        }
        int max = Integer.MIN_VALUE, res = 0;
        for(Integer x : map.keySet()){
            if(map.get(x) > max){
                max = map.get(x);
                res = x;
            }
        }

        return res;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for(Integer x : nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }else{
                map.put(x, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        for(Integer x : map.keySet()){
            if(map.get(x) > nums.length / 3){
                list.add(x);
            }
        }

        return list;
    }
}
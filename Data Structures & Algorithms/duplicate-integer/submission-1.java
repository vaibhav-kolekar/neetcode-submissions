class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.getOrDefault(x, 0) > 0){
                return true;
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return false;
    }
}